package com.p2p.zhanghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by acer on 2017/12/19.
 */
@Controller
@RequestMapping("/api")
public class VerifyController {
    /**
     * @param checkCode 前端用户输入返回的验证码
     * 参数若需要，自行添加
     */
    @RequestMapping(value = "/verify")
    @ResponseBody
    public String checkcode(HttpServletRequest request,
                            HttpSession session,
                            String checkCode) throws Exception {

        // 获得验证码对象
        Object cko = session.getAttribute("simpleCaptcha");
        if (cko == null) {
            request.setAttribute("errorMsg", "请输入验证码！");
            return "请输入验证码！";
        }
        String captcha = cko.toString();
        // 验证码有效时长为1分钟
        Date date = new Date();
        Long codeTime = Long.valueOf(session.getAttribute("codeTime") + "");
        // 判断验证码输入是否正确
        if (StringUtils.isEmpty(checkCode) || captcha == null || !(checkCode.equalsIgnoreCase(captcha))) {
            request.setAttribute("errorMsg", "验证码错误！");
            return "验证码错误，请重新输入！";


        } else if ((date.getTime() - codeTime) / 1000 / 60 > 1) {
            request.setAttribute("errorMsg", "验证码已失效，请重新输入！");
            return "验证码已失效，请重新输入！";
        } else {

            // 在这里可以处理自己需要的事务，比如验证登陆等

            return "验证通过！";
        }
    }
}


