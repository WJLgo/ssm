package com.wsn.dao;

import com.wsn.bean.DoctorInfo;
import com.wsn.bean.DoctorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoctorInfoMapper {
    int countByExample(DoctorInfoExample example);

    int deleteByExample(DoctorInfoExample example);

    int insert(DoctorInfo record);

    int insertSelective(DoctorInfo record);

    List<DoctorInfo> selectByExample(DoctorInfoExample example);

    int updateByExampleSelective(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

    int updateByExample(@Param("record") DoctorInfo record, @Param("example") DoctorInfoExample example);

	void deleteDoctor(String work_num);
	
	//@Param("doctor")DoctorInfo doctor 表示将doctor对象注入到自定义的变量doctor中
	void updateDoctor(@Param("doctor")DoctorInfo doctor);
	
	
}