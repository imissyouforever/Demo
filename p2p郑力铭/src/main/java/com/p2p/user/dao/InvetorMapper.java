package com.p2p.user.dao;

import com.p2p.pojo.Invetor;
import com.p2p.pojo.InvetorExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Mapper
public interface InvetorMapper {
    int countByExample(InvetorExample example);

    int deleteByExample(InvetorExample example);

    int deleteByPrimaryKey(String id);

    int insert(Invetor record);

    int insertSelective(Invetor record);

    List<Invetor> selectByExample(InvetorExample example);

    Invetor selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Invetor record, @Param("example") InvetorExample example);

    int updateByExample(@Param("record") Invetor record, @Param("example") InvetorExample example);

    int updateByPrimaryKeySelective(Invetor record);

    int updateByPrimaryKey(Invetor record);
}