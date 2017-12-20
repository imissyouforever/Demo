package com.p2p.debt.dao;

import com.p2p.pojo.Firstdebt;
import com.p2p.pojo.FirstdebtExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FirstdebtMapper {
    int countByExample(FirstdebtExample example);

    int deleteByExample(FirstdebtExample example);

    int deleteByPrimaryKey(String id);

    int insert(Firstdebt record);

    int insertSelective(Firstdebt record);

    List<Firstdebt> selectByExample(FirstdebtExample example);

    Firstdebt selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Firstdebt record, @Param("example") FirstdebtExample example);

    int updateByExample(@Param("record") Firstdebt record, @Param("example") FirstdebtExample example);

    int updateByPrimaryKeySelective(Firstdebt record);

    int updateByPrimaryKey(Firstdebt record);
}