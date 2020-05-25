package com.taimei.gos.mapper;

import com.taimei.gos.model.Admin;
import com.taimei.gos.model.AdminExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminMapperTest {

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void testCountByExample() {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminIdEqualTo(1);
        System.out.println(adminMapper);
        long l = adminMapper.countByExample(adminExample);
        System.out.println(l);
    }

    @Test
    public void testDeleteByExample() {
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminIdEqualTo(10);
        System.out.println(adminMapper);
        long l = adminMapper.deleteByExample(adminExample);
        System.out.println(l);
    }

    @Test
    public void testDeleteByPrimaryKey() {
        adminMapper.deleteByPrimaryKey(10);
    }

    @Test
    public void testInsert() {
        Admin admin = new Admin();
        admin.setUserName("18054219495");
        admin.setPassword("12434");
        admin.setRealName("guoguo");
        admin.setCreateTime(1571376781);
        admin.setIsDelete((byte) 3);
        admin.setIsFreeze((byte) 0);
        adminMapper.insert(admin);
    }

    @Test
    public void testInsertSelective() {
        Admin admin = new Admin();
        admin.setUserName("18054219496");
        admin.setPassword("12434");
        admin.setRealName("guoguo");
        admin.setCreateTime(1571376781);
        admin.setIsDelete((byte) 3);
        admin.setIsFreeze(null);
        adminMapper.insertSelective(admin);
    }

    @Test
    public void testSelectByExample() {
    }

    @Test
    public void testSelectByPrimaryKey() {
    }

    @Test
    public void testUpdateByExampleSelective() {
    }

    @Test
    public void testUpdateByExample() {
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
    }

    @Test
    public void testUpdateByPrimaryKey() {
    }
}
