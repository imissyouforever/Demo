package com.p2p.zhanghu.service;

import com.p2p.pojo.Invetor;

import java.util.List;

/**
 * Created by acer on 2017/12/14.
 */
public interface LoginService {
    List<Invetor> findByInvetor(Invetor invetor);

    Invetor findById(String id);

    Invetor findByPhone(String phone, Invetor invetor);

    void update(Invetor invetor1);
}
