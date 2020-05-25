package com.taimei.gos.portal;

import com.taimei.gos.mapper.AdminMapper;
import com.taimei.gos.model.AdminExample;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GosMbgApplicationTests {
	@Autowired
	private AdminMapper adminMapper;

	@Test
	void contextLoads() {
		AdminExample adminExample = new AdminExample();
		adminExample.createCriteria().andAdminIdEqualTo(1);
		long l = adminMapper.countByExample(adminExample);
		System.out.println(l);
	}

}
