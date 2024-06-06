package com.codesart.springfoot.common.data.jpa.test;

import com.codesart.springfoot.common.data.jpa.test.dao.DemoDeptDAO;
import com.codesart.springfoot.common.data.jpa.test.dao.DemoUserDAO;
import com.codesart.springfoot.common.data.jpa.test.entity.DemoUserDO;
import com.codesart.springfoot.common.data.jpa.test.repository.DemoUserRepository;
import com.codesart.springfoot.common.data.jpa.test.config.SpringFootDataJpaTestConfiguration;
import com.codesart.springfoot.common.data.jpa.test.repository.DemoDeptRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@DataJpaTest
@SpringJUnitConfig(classes = SpringFootDataJpaTestConfiguration.class)
public class SpringFootDataJpaTest {

    @Autowired
    private DemoUserDAO demoUserDAO;
    @Autowired
    private DemoDeptDAO demoDeptDAO;
    @Autowired
    private DemoUserRepository demoUserRepository;
    @Autowired
    private DemoDeptRepository demoDeptRepository;

    @BeforeEach
    void beforeEach() {
        DemoUserDO demoUserDO = DemoUserDO.builder().code("1").username("userName1").build();
        demoUserDAO.save(demoUserDO);
    }

    @Test
    void contextLoads() {
        System.out.println(demoUserDAO.findAll());
        System.out.println(demoUserRepository.findByUsernameLike("%1%"));
    }

}