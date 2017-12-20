package com.p2p.user.service.impl;

import com.p2p.pojo.Invetor;
import com.p2p.pojo.InvetorExample;
import com.p2p.user.dao.InvetorMapper;
import com.p2p.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/14.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private InvetorMapper invetorMapper;
    //注册
    @Override
    public void add(Invetor invetor) {
        invetorMapper.insert(invetor);
    }

    //登录
    @Override
    public List<Invetor> findById(Invetor invetor) {
        InvetorExample example=new InvetorExample();
        InvetorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(invetor.getUsername());
        criteria.andPasswordEqualTo(invetor.getPassword());
        List<Invetor> list = invetorMapper.selectByExample(example);
        return list;
    }
}
