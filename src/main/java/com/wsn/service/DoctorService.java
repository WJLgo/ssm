package com.wsn.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsn.bean.DoctorInfo;
import com.wsn.bean.DoctorInfoExample;
import com.wsn.dao.DoctorInfoMapper;

@Service
public class DoctorService {
	@Autowired
	private DoctorInfoMapper doctorInfo;
	/*
	 * 获取所有用户
	 */
	public List<DoctorInfo> getDoctors(){
		return doctorInfo.selectByExample(null);
	}
	/*
	 * 新增用户
	 */
	public void insertDoctor(DoctorInfo doctor){
		doctorInfo.insert(doctor);
	}
	/**
	 * 修改用户信息,将修改的整个用户的信息重新填入，id(work_num)无法修改
	 */
	public void updateDoctor(DoctorInfo doctor){
		doctorInfo.updateDoctor(doctor);
	}
	/**
	 * 删除用户信息
	 */
	public void deleteDoctor(String work_num){
		doctorInfo.deleteDoctor(work_num);
	}
}
