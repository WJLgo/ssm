package com.wsn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wsn.bean.DoctorInfo;
import com.wsn.dao.DoctorInfoMapper;

/**
 * dao层功能测试
 * 
 * @author tykj 推荐spring的项目就可以使用spring的单元测试 ，可以自动注入我们需要的组件 1、导入springTest模块
 *         2、使用@ContextConfiguration指定Spring配置文件的位置 3、直接autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })

public class MapperTest {
	@Autowired
	private DoctorInfoMapper doctorInfoMapper;

	@Test
	public void testCRUD() throws NoSuchMethodError {

		/*
		 * // 1、创建SPringIoc容器 ApplicationContext ioc = new
		 * ClassPathXmlApplicationContext("applicationContext.xml"); // 2、从容器中获取
		 * mapper UserMapper bean = ioc.getBean(UserMapper.class);
		 */
		System.out.println("加油：" + doctorInfoMapper);

		/**
		 * 增加用户测试
		 */
//		 DoctorInfo doctorInfo = new DoctorInfo();
//		 doctorInfo.setDepartment("医疗部");
//		 doctorInfo.setMac(15828);
//		 doctorInfo.setName("王金磊");
//		 doctorInfo.setPosition("院长");
//		 doctorInfo.setWage(125);
//		 doctorInfo.setWorkNum("152210703126");
//		 doctorInfoMapper.insert(doctorInfo);
		
		 System.out.println("插入成功");
		//

		/**
		 * 查询
		 */
		doctorInfoMapper.selectByExample(null);
		System.out.println(doctorInfoMapper.selectByExample(null));

		/**
		 * s 删除测试
		 */
//		 doctorInfoMapper.deleteDoctor("152210703126");
		/**
		 * 修改测试
		 */
		 DoctorInfo doctorInfo = new DoctorInfo();
		 doctorInfo.setDepartment("卫生部");
		 doctorInfo.setMac(15828);
		 doctorInfo.setName("王金磊");
		 doctorInfo.setPosition("院长");
		 doctorInfo.setWage(125);
		 doctorInfo.setWorkNum("152210703126");
		 doctorInfoMapper.updateDoctor(doctorInfo);
	}
}
