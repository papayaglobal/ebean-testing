create table worker_contract (
  id                            bigint auto_increment not null,
  project_name                  varchar(255),
  start_date                    date,
  end_date                      date,
  base_salary                   integer not null,
  status                        integer,
  worker                        bigint,
  version                       bigint not null,
  when_created                  datetime(6) not null,
  when_modified                 datetime(6) not null,
  who_created                   varchar(255) not null,
  who_modified                  varchar(255) not null,
  deleted                       tinyint(1) default 0 not null,
  constraint pk_worker_contract primary key (id)
);

create table files (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  url                           varchar(255),
  status                        integer,
  contract                      bigint,
  version                       bigint not null,
  when_created                  datetime(6) not null,
  when_modified                 datetime(6) not null,
  who_created                   varchar(255) not null,
  who_modified                  varchar(255) not null,
  deleted                       tinyint(1) default 0 not null,
  constraint pk_files primary key (id)
);

create table worker_payment (
  id                            bigint auto_increment not null,
  executed_at                   datetime(6),
  payed_at                      datetime(6),
  payed_amount                  decimal(16,3),
  payed_amount_currency         varchar(255),
  worker_id                     bigint,
  version                       bigint not null,
  when_created                  datetime(6) not null,
  when_modified                 datetime(6) not null,
  who_created                   varchar(255) not null,
  who_modified                  varchar(255) not null,
  deleted                       tinyint(1) default 0 not null,
  constraint pk_worker_payment primary key (id)
);

create table worker (
  id                            bigint auto_increment not null,
  first_name                    varchar(255),
  last_name                     varchar(255),
  marital_status                varchar(255),
  num_of_children               integer not null,
  date_of_birth                 date,
  status                        integer,
  version                       bigint not null,
  when_created                  datetime(6) not null,
  when_modified                 datetime(6) not null,
  who_created                   varchar(255) not null,
  who_modified                  varchar(255) not null,
  deleted                       tinyint(1) default 0 not null,
  constraint pk_worker primary key (id)
);

create index ix_worker_contract_worker on worker_contract (worker);
alter table worker_contract add constraint fk_worker_contract_worker foreign key (worker) references worker (id) on delete restrict on update restrict;

create index ix_files_contract on files (contract);
alter table files add constraint fk_files_contract foreign key (contract) references worker_contract (id) on delete restrict on update restrict;

create index ix_worker_payment_worker_id on worker_payment (worker_id);
alter table worker_payment add constraint fk_worker_payment_worker_id foreign key (worker_id) references worker (id) on delete restrict on update restrict;

alter table worker_contract add system versioning;
alter table files add system versioning;
alter table worker_payment add system versioning;
alter table worker add system versioning;
