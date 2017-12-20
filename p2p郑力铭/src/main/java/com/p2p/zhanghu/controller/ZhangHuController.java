package com.p2p.zhanghu.controller;

import com.p2p.common.CookieUtils;
import com.p2p.common.JsonUtils;
import com.p2p.pojo.Invetor;
import com.p2p.zhanghu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by acer on 2017/12/14.
 */
@Controller
public class ZhangHuController {
    @Value("${COOKIE_NAME}")
    private String COOKIE_NAME;
    @Autowired
    private LoginService loginService;
    //账户设置
    @RequestMapping("/shezhi")
    public String shezhi(HttpServletRequest request){
        String cookie = CookieUtils.getCookieValue(request, COOKIE_NAME,true);
        if(StringUtils.isEmpty(cookie)){
            request.setAttribute("msg","你还没有登陆，请去登陆");
            return "index";
        }

        Invetor invetor1 = JsonUtils.jsonToPojo(cookie, Invetor.class);

        request.setAttribute("invetor",invetor1);
        return "zhanghu_shezhi";
    }
    //修改密码页面
    @RequestMapping("/zhanghu/mimaxiugai")
    public String mimaxiugei(HttpServletRequest request){
        String cookie = CookieUtils.getCookieValue(request, COOKIE_NAME,true);
        if(StringUtils.isEmpty(cookie)){
            request.setAttribute("msg","你还没有登陆，请去登陆");
            return "index";
        }

        Invetor invetor1 = JsonUtils.jsonToPojo(cookie, Invetor.class);
        request.setAttribute("invetor",invetor1);
        return "zhanghu_mimaxiugai";
    }

    //修改手机号
    @RequestMapping("/gaiphone")
    public String gaiPhone(String phone,HttpServletRequest request){
        String cookie = CookieUtils.getCookieValue(request, COOKIE_NAME,true);
        if(StringUtils.isEmpty(cookie)){
            request.setAttribute("msg","你还没有登陆，请去登陆");
            return "index";
        }

        Invetor invetor1 = JsonUtils.jsonToPojo(cookie, Invetor.class);
        Invetor invetor= loginService.findByPhone(phone,invetor1);
        //判断有无对象，有是修改成功，无是手机号已被注册
        if(invetor ==null){
            request.setAttribute("msg","手机号已被注册");
            return "";
        }else{
            request.setAttribute("invetor",invetor);
            request.setAttribute("msg","手机号已修改");
        }

        return "zhanghu_shezhi";
    }
    //查询密码
    @RequestMapping("/gaimima")
    @ResponseBody
    public String gaimima(HttpServletRequest request, String password){
        String cookie = CookieUtils.getCookieValue(request, COOKIE_NAME,true);
        if(StringUtils.isEmpty(cookie)){
            request.setAttribute("msg","你还没有登陆，请去登陆");
            return "index";
        }

        Invetor invetor1 = JsonUtils.jsonToPojo(cookie, Invetor.class);
        if(! password.equals(invetor1.getPassword())){
            return "密码输入错误";
        }

        return "√";
    }
    //跳转账户设置页面
    @RequestMapping("/zhanghushezhi")
    public String zhanghushezhi(HttpServletRequest request){
        String cookie = CookieUtils.getCookieValue(request, COOKIE_NAME,true);
        if(StringUtils.isEmpty(cookie)){
            request.setAttribute("msg","你还没有登陆，请去登陆");
            return "index";
        }

        Invetor invetor1 = JsonUtils.jsonToPojo(cookie, Invetor.class);
        request.setAttribute("invetor",invetor1);
        return "zhanghu_shezhi";
    }
    //跳转账户概要页面
    @RequestMapping("/zhanghu")
    public String zhanghu(){
        return "zhanghu_gaiyao";
    }
    //修改密码
    @RequestMapping("/xiugaimima")
    public String xiugaimima(String password,String password1,HttpServletRequest request){
        String cookie = CookieUtils.getCookieValue(request, COOKIE_NAME,true);
        if(StringUtils.isEmpty(cookie)){
            request.setAttribute("msg","你还没有登陆，请去登陆");
            return "index";
        }

        Invetor invetor1 = JsonUtils.jsonToPojo(cookie, Invetor.class);
        if( ! invetor1.getPassword().equals(password)){
            request.setAttribute("msg","密码输入错误");
            return "zhanghu_mimaxiugai";
        }
        invetor1.setPassword(password1);
        loginService.update(invetor1);
        return "zhanghu_gaiyao";
    }
}
