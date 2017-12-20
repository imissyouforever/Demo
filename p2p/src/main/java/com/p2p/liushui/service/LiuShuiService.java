package com.p2p.liushui.service;

import com.p2p.liushui.dao.LiuShuiReponsitory;
import com.p2p.liushui.pojo.LiuShui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lenovo on 2017/12/18.
 */

public interface LiuShuiService {
   List<LiuShui> findByUid(String uid);
   Page<LiuShui> findByUid(Pageable pageable,String uid);
}
