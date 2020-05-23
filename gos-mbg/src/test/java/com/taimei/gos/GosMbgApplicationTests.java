package com.taimei.gos;

import com.taimei.gos.mapper.AdminMapper;
import com.taimei.gos.model.AdminExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
class GosMbgApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("skdfqf");
    }

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void countByExample() {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminIdEqualTo(1);
        System.out.println(adminMapper);
        long l = adminMapper.countByExample(adminExample);
        System.out.println(l);
    }

}
