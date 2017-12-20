package com.p2p.user.controller;

import com.p2p.common.CookieUtils;
import com.p2p.common.JsonUtils;
import com.p2p.common.UUIDUtils;
import com.p2p.pojo.Invetor;
import com.p2p.user.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/12/14.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Value("${COOKIE_NAME}")
    private String COOKIE_NAME;
    //登录
    @RequestMapping("/login")
    public String login(Invetor invetor, Model model, HttpServletRequest request, HttpServletResponse response){
        //调用方法根据id进行查询
        List<Invetor> list=userService.findById(invetor);
        //判断返回的集合是否为空
        if (list ==null || list.size()== 0){
            //如果为空，设置错误信息，并返回首页
            model.addAttribute("msg","用户名或密码错误");
            return "index";
        }
        //如果不为空，get（0），将对象存入session域中
        Invetor invetor1 = list.get(0);
        model.addAttribute("invetor",invetor1);
        String s = JsonUtils.objectToJson(invetor1);
        CookieUtils.setCookie(request,response,COOKIE_NAME,s,true);
        return "index-deng";
    }

    //注册
    @RequestMapping(value="/register",method= RequestMethod.POST)
    public String register(Invetor invetor){
        //补全属性
            //设置id为uuid
        invetor.setId(UUIDUtils.getUUID());
        //调用方法进行注册添加
        userService.add(invetor);
        //返回首页
        return "index";
    }







}
