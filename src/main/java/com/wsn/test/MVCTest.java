package com.wsn.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.wsn.bean.DoctorInfo;

/**
 * 使用spring提供的测试模块测试请求功能，
 */
@RunWith(SpringJUnit4ClassRunner.class)

// 获取web的ioc容器
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath*:applicationContext.xml",
		"file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml" })
public class MVCTest {

	// 虚拟mvc请求，获取到处理结果
	MockMvc mockmvc;
	// 传入springmvc的ioc
	@Autowired
	WebApplicationContext context;

	// Before代表每次要用该方法时都要初始化一下
	@Before
	public void initMockMvc() {

		mockmvc = MockMvcBuilders.webAppContextSetup(context).build();

	}

	@Test
	public void test() throws Exception {
		// perform模拟网页发送请求
		// 模拟请求拿到返回值
		MvcResult result = mockmvc.perform(MockMvcRequestBuilders.get("/getDoctors")).andReturn();

		MockHttpServletRequest request = result.getRequest();
		List<DoctorInfo> doctors = (List<DoctorInfo>) request.getAttribute("doctors");
//		System.out.println(doctors);
		for (DoctorInfo doctor : doctors) {
			System.out
					.println("部门:" + doctor.getDepartment() + "  姓名:" + doctor.getName() + "职位：" + doctor.getPosition()
							+ "工作年龄L:" + doctor.getWorkNum() + "mac地址:" + doctor.getMac() + "工作年数：" + doctor.getWage());
		}

	}
}
