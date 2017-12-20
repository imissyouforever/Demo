package com.p2p.liushui.dao;

import com.p2p.liushui.pojo.LiuShui;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lenovo on 2017/12/18.
 */
public interface LiuShuiReponsitory extends JpaRepository<LiuShui,Integer>{
       List<LiuShui> findByUid(String uid);
    Page<LiuShui> findByUid(Pageable pageable, String uid);
}
