package com.swat018.springbootneo4j;

import com.swat018.springbootneo4j.account.Account;
import com.swat018.springbootneo4j.account.AccountRepository;
import com.swat018.springbootneo4j.account.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.data.neo4j.core.Neo4jTemplate;
import org.springframework.stereotype.Component;

@Component
public class Neo4jRunner implements ApplicationRunner {

    @Autowired
    Neo4jTemplate neo4jTemplate;

    @Autowired
    AccountRepository accountRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
//        account.setEmail("swat018@gmail.com");
//        account.setUsername("jinwoo");

//        account.setEmail("swat018@icloud.com");
//        account.setUsername("swat");
//
//        Role role = new Role();
//        role.setName("admin");
//
//        account.getRoles().add(role);
//
//        neo4jTemplate.save(account);

        account.setEmail("jwpark@naver.com");
        account.setUsername("park");

        Role role = new Role();
        role.setName("user");

        account.getRoles().add(role);

        accountRepository.save(account);

        System.out.println("finished");
    }
}
