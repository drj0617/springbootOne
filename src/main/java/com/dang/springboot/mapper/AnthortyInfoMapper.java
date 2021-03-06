package com.dang.springboot.mapper;

import com.dang.springboot.pojo.AnthortyInfo;
import com.dang.springboot.pojo.AnthortyInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnthortyInfoMapper {
    long countByExample(AnthortyInfoExample example);

    int deleteByExample(AnthortyInfoExample example);

    int deleteByPrimaryKey(Integer anthortyId);

    int insert(AnthortyInfo record);

    int insertSelective(AnthortyInfo record);

    List<AnthortyInfo> selectByExample(AnthortyInfoExample example);

    AnthortyInfo selectByPrimaryKey(Integer anthortyId);

    int updateByExampleSelective(@Param("record") AnthortyInfo record, @Param("example") AnthortyInfoExample example);

    int updateByExample(@Param("record") AnthortyInfo record, @Param("example") AnthortyInfoExample example);

    int updateByPrimaryKeySelective(AnthortyInfo record);

    int updateByPrimaryKey(AnthortyInfo record);
}