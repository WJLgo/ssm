package com.wsn.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wsn.bean.DoctorInfo;
import com.wsn.dao.DoctorInfoMapper;

@Service
public class DoctorService {
	@Autowired
	private DoctorInfoMapper doctorInfo;
	
	public List<DoctorInfo> getDoctors(){
		return doctorInfo.selectByExample(null);
	}
}
