package com.p2p.liushui.service.impl;

import com.p2p.liushui.dao.LiuShuiReponsitory;
import com.p2p.liushui.pojo.LiuShui;
import com.p2p.liushui.service.LiuShuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/12/18.
 */
@Service
public class LiuShuiServiceImpl implements LiuShuiService {
    @Autowired
    private LiuShuiReponsitory reponsitory;
    public List<LiuShui> findByUid(String uid) {
        List<LiuShui> list = reponsitory.findByUid(uid);
        return list;
    }

    @Override
    public Page<LiuShui> findByUid(Pageable pageable, String uid) {
        Page<LiuShui> page = reponsitory.findByUid(pageable, uid);
        return page;
    }
}
