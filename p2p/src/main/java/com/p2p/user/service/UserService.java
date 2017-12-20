package com.p2p.user.service;

import com.p2p.pojo.Invetor;

import java.util.List;

/**
 * Created by Administrator on 2017/12/14.
 */
public interface UserService {


    List<Invetor> findById(Invetor invetor);

    void add(Invetor invetor);
}
