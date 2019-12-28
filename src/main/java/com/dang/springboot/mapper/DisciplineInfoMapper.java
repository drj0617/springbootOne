package com.dang.springboot.mapper;

import com.dang.springboot.pojo.DisciplineInfo;
import com.dang.springboot.pojo.DisciplineInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisciplineInfoMapper {
    long countByExample(DisciplineInfoExample example);

    int deleteByExample(DisciplineInfoExample example);

    int deleteByPrimaryKey(Integer disciplineId);

    int insert(DisciplineInfo record);

    int insertSelective(DisciplineInfo record);

    List<DisciplineInfo> selectByExample(DisciplineInfoExample example);

    DisciplineInfo selectByPrimaryKey(Integer disciplineId);

    int updateByExampleSelective(@Param("record") DisciplineInfo record, @Param("example") DisciplineInfoExample example);

    int updateByExample(@Param("record") DisciplineInfo record, @Param("example") DisciplineInfoExample example);

    int updateByPrimaryKeySelective(DisciplineInfo record);

    int updateByPrimaryKey(DisciplineInfo record);
}