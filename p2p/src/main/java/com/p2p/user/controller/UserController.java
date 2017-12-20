package com.p2p.user.controller;

import com.p2p.common.CookieUtils;
import com.p2p.common.NoteUtils;
import com.p2p.common.UUIDUtils;
import com.p2p.pojo.Invetor;
import com.p2p.user.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
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

    //登录
    @RequestMapping("/login")
    public String login(Invetor invetor,Model model,HttpSession session){
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
        return "index-deng";
    }
    //发送短信
    @RequestMapping(value = "/sendMsg",method = RequestMethod.POST)
    @ResponseBody
    public String sendMsg(String phone, HttpServletRequest request, HttpServletResponse response){
        //随机获取6位验证码
        String num = NoteUtils.getRondom();
        //调用接口给手机发送短信
        CookieUtils.setCookie(request,response,"COOKIE_NAME",num,180);
        boolean flag = NoteUtils.ccpSms(phone, num);
        System.out.println(num);
        return "验证码已发送，请注意查收！！！";
    }


    //注册
    @RequestMapping(value="/register",method= RequestMethod.POST)
    public String register(Invetor invetor, HttpServletRequest request){
        String num = CookieUtils.getCookieValue(request,"COOKIE_NAME");
        System.out.println(num);
        //判断用户输入的验证码和生成的随机数是否一致
        if(invetor.getYanzheng().equals(num)){
            invetor.setId(UUIDUtils.getUUID());
            invetor.setAccountmoney((long) 0);
            userService.add(invetor);
            return "index";
        }else{
            request.setAttribute("msg","验证码输入有误！！！");
            return "zhuce";
        }
    }


}
