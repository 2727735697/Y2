package com.sz.controller;

import com.sz.pojo.Account;
import com.sz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 登录
     * @param account
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/login")
    public String login(Account account, Model model, HttpSession session){
        Map<String,Object> map = accountService.loginBank(account);
        model.addAttribute("account",account);
        int code = Integer.valueOf(map.get("code").toString());
        if (code == 404){
            // 404代表用户不存在
            model.addAttribute("errMsg","用户不存在");
            return "login";
        }else if (code == 403){
            // 403代表密码错误
            model.addAttribute("errMsg","密码错误");
            return "login";
        }else if (code == 200){
            // 验证成功--账号密码正确
            Account a = (Account) map.get("account");
            if (a.getStatus() == 1){
                // 账号属于激活状态--才可以登录
                session.setAttribute("accountAll",a);
                return  "index";
            }else {
                model.addAttribute("errMsg","账号被冻结");
                return "login";
            }
        }else {
            return "login";
        }
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) {

        session.removeAttribute("account");
        session.invalidate();
        //重定向
        return "redirect:/";
    }

}
