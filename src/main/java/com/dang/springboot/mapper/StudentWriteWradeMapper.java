package com.dang.springboot.mapper;

import com.dang.springboot.pojo.StudentWriteWrade;
import com.dang.springboot.pojo.StudentWriteWradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentWriteWradeMapper {
    long countByExample(StudentWriteWradeExample example);

    int deleteByExample(StudentWriteWradeExample example);

    int deleteByPrimaryKey(Integer writeGradeId);

    int insert(StudentWriteWrade record);

    int insertSelective(StudentWriteWrade record);

    List<StudentWriteWrade> selectByExample(StudentWriteWradeExample example);

    StudentWriteWrade selectByPrimaryKey(Integer writeGradeId);

    int updateByExampleSelective(@Param("record") StudentWriteWrade record, @Param("example") StudentWriteWradeExample example);

    int updateByExample(@Param("record") StudentWriteWrade record, @Param("example") StudentWriteWradeExample example);

    int updateByPrimaryKeySelective(StudentWriteWrade record);

    int updateByPrimaryKey(StudentWriteWrade record);
}