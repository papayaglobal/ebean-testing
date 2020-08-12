package org.example.sboot.domain;

import io.ebean.DB;
import io.ebean.Version;
import io.ebean.test.UserContext;
import lombok.SneakyThrows;
import org.example.sboot.domain.repo.PayerRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HistoryCascadeTest {
    PayerRepository payerRepository = new PayerRepository(DB.getDefault());
    @BeforeAll
    @SneakyThrows
    void init(){
        UserContext.setUserId("U1");
        Organization papaya = Organization.builder()
                .name("papaya")
                .build();
        Payer payer = Payer.builder()
                .name("payer")
                .organization(papaya)
                .build();
        papaya.getPayers().add(payer);
        payerRepository.save(payer);
        papaya.setName("papaya-updated-first");
        payerRepository.save(payer);
        //payer.setName("payer-updated");
        //payerRepository.save(payer);
        Thread.sleep(1000);
        papaya.setName("papaya-updated-second");
        payerRepository.save(payer);
        Thread.sleep(1000);
    }
    @Test
    public void testHistoryQueries() {

        List<Version<Payer>> version = payerRepository.findVersion(Timestamp.valueOf(LocalDateTime.MIN), Timestamp.valueOf(LocalDateTime.now()));
        version.forEach(v -> {
            System.out.println(v.getBean());
        });
        payerRepository.findById(1L);
        Assert.assertTrue(version.get(1).getBean().getOrganization().getName().equals("papaya-updated-first") ||
                version.get(1).getBean().getOrganization().getName().equals("papaya"));
    }
    @Test
    public void testHistoryQueriesQueryBeans() {

        List<Version<Payer>> version = payerRepository.findVersionQueryBean(Timestamp.valueOf(LocalDateTime.MIN), Timestamp.valueOf(LocalDateTime.now()));
        version.forEach(v -> {
            System.out.println(v.getBean());
        });
        payerRepository.findById(1L);
        Assert.assertTrue(version.get(1).getBean().getOrganization().getName().equals("papaya-updated-first") ||
                version.get(1).getBean().getOrganization().getName().equals("papaya"));
    }

    @Test
    public void testHistoryQueriesAsOf() {
        Payer version1 = payerRepository.findVersion(Timestamp.from(Instant.now().minusMillis(2020)));
        Assert.assertEquals(version1.getOrganization().getName(),"papaya-updated-first");
        System.out.println(version1);
        Payer version2 = payerRepository.findVersion(Timestamp.from(Instant.now().minusMillis(1020)));
        Assert.assertEquals(version2.getOrganization().getName(),"papaya-updated-second");
        System.out.println(version2);
    }
}
