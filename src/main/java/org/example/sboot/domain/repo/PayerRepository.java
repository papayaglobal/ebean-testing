package org.example.sboot.domain.repo;

import io.ebean.Database;
import io.ebean.Version;
import org.example.sboot.domain.Payer;
import org.example.sboot.domain.query.QPayer;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public class PayerRepository extends BeanRepository<Long, Payer>{
    public PayerRepository(Database server) {
        super(Payer.class, server);
    }

    public Payer findById(Long id){
        return server.find(Payer.class).where().eq("id", id).findOne();
    }

    public List<Version<Payer>> findVersion(Timestamp start, Timestamp end){
       return server.find(Payer.class)/*.fetch(Payer.Fields.organization)*/.findVersionsBetween(start, end);
    }
    public List<Version<Payer>> findVersionQueryBean(Timestamp start, Timestamp end){
       return new QPayer().findVersionsBetween(start, end);
    }
    public Payer findVersion(Timestamp ts){
       return new QPayer().asOf(ts).findOne();
    }
}
