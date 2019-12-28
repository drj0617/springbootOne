package com.dang.springboot.mapper;

import com.dang.springboot.pojo.CommunicationInfo;
import com.dang.springboot.pojo.CommunicationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunicationInfoMapper {
    long countByExample(CommunicationInfoExample example);

    int deleteByExample(CommunicationInfoExample example);

    int deleteByPrimaryKey(Integer communicationId);

    int insert(CommunicationInfo record);

    int insertSelective(CommunicationInfo record);

    List<CommunicationInfo> selectByExample(CommunicationInfoExample example);

    CommunicationInfo selectByPrimaryKey(Integer communicationId);

    int updateByExampleSelective(@Param("record") CommunicationInfo record, @Param("example") CommunicationInfoExample example);

    int updateByExample(@Param("record") CommunicationInfo record, @Param("example") CommunicationInfoExample example);

    int updateByPrimaryKeySelective(CommunicationInfo record);

    int updateByPrimaryKey(CommunicationInfo record);
}