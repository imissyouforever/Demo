package com.p2p.liushui.controller;

import com.p2p.liushui.pojo.LiuShui;
import com.p2p.liushui.service.LiuShuiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lenovo on 2017/12/18.
 */
@Controller
public class LiuShuiController {
    @Autowired
    private LiuShuiService liuShuiService;
    @RequestMapping("/liushui/show")
    public String show(HttpServletRequest request){
        String uid="904c3da3a60b43caab7f0c174ded306e";
        List<LiuShui> list = liuShuiService.findByUid(uid);
        request.setAttribute("list",list);
        return "zhanghu_zijin";
    }

    @RequestMapping("/liushui/show2")
    public String show2(HttpServletRequest request,String pageNumberstr){
        if(pageNumberstr==null ||"".equals(pageNumberstr)){
            pageNumberstr="0";
        }
        int pageNumber = Integer.parseInt(pageNumberstr);
        int pageSize = 1;

        PageRequest pageRequest = new PageRequest(pageNumber, pageSize, null);
        String uid="904c3da3a60b43caab7f0c174ded306e";
        Page<LiuShui> page = liuShuiService.findByUid(pageRequest, uid);
        List<LiuShui> list = page.getContent();
        request.setAttribute("list",list);
        request.setAttribute("pageNumberstr",pageNumber);
        request.setAttribute("TotalPages",page.getTotalPages()-1);
        return "zhanghu_zijin";
    }
}
