package com.dang.springboot.mapper;

import com.dang.springboot.pojo.StaffSalary;
import com.dang.springboot.pojo.StaffSalaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffSalaryMapper {
    long countByExample(StaffSalaryExample example);

    int deleteByExample(StaffSalaryExample example);

    int deleteByPrimaryKey(Integer staffSalaryId);

    int insert(StaffSalary record);

    int insertSelective(StaffSalary record);

    List<StaffSalary> selectByExample(StaffSalaryExample example);

    StaffSalary selectByPrimaryKey(Integer staffSalaryId);

    int updateByExampleSelective(@Param("record") StaffSalary record, @Param("example") StaffSalaryExample example);

    int updateByExample(@Param("record") StaffSalary record, @Param("example") StaffSalaryExample example);

    int updateByPrimaryKeySelective(StaffSalary record);

    int updateByPrimaryKey(StaffSalary record);
}