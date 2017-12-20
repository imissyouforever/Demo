package com.p2p.zhanghu.service.impl;

import com.p2p.pojo.Invetor;
import com.p2p.pojo.InvetorExample;
import com.p2p.user.dao.InvetorMapper;
import com.p2p.zhanghu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by acer on 2017/12/14.
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private InvetorMapper invetorMapper;
    @Override
    public List<Invetor> findByInvetor(Invetor invetor) {
        InvetorExample example=new InvetorExample();
        InvetorExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(invetor.getUsername());
        criteria.andPasswordEqualTo(invetor.getPassword());
        List<Invetor> list = invetorMapper.selectByExample(example);
        return list;
    }

    @Override
    public Invetor findById(String id) {
        return invetorMapper.selectByPrimaryKey(id);
    }

    @Override
    //修改手机号
    public Invetor findByPhone(String phone,Invetor invetor) {
        InvetorExample example=new InvetorExample();
        InvetorExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);
        //手机号是否注册过
        List<Invetor> list = invetorMapper.selectByExample(example);
        //没有修改手机号，并保存
        if(list == null || list.size() == 0){
            invetor.setPhone(phone);
            invetorMapper.updateByPrimaryKey(invetor);
            return invetor;
        }
        //注册过返回null
        return null;
    }

    @Override
    public void update(Invetor invetor1) {
        invetorMapper.updateByPrimaryKey(invetor1);
    }
}
