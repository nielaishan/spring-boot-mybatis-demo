package com.example.demo;

import com.example.demo.dao.dao.AdminDao;
import com.example.demo.dao.domain.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private AdminDao adminDao;

	@Test
	public void contextLoads() {
		Admin admin = adminDao.selectById(1);
		System.out.print(admin.getUsername());
	}

	@Test
	public void testTest() {
		Admin admin = adminDao.selectById(1);
		System.out.print(admin.getUsername());
	}


}
