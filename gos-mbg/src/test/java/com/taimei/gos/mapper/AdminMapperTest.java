package com.taimei.gos.mapper;

import com.taimei.gos.GosMbgApplication;
import com.taimei.gos.model.AdminExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GosMbgApplication.class)
public class AdminMapperTest {

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

    @Test
    public void deleteByExample() {
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByExample() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByExampleSelective() {
    }

    @Test
    public void updateByExample() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}
