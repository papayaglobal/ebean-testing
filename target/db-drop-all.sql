alter table worker_contract drop foreign key fk_worker_contract_worker;
drop index ix_worker_contract_worker on worker_contract;

alter table files drop foreign key fk_files_contract;
drop index ix_files_contract on files;

alter table worker_payment drop foreign key fk_worker_payment_worker_id;
drop index ix_worker_payment_worker_id on worker_payment;

alter table worker_contract drop system versioning;
drop table if exists worker_contract;

alter table files drop system versioning;
drop table if exists files;

alter table worker_payment drop system versioning;
drop table if exists worker_payment;

alter table worker drop system versioning;
drop table if exists worker;

