package com.sz.service.impl;

import com.sz.pojo.Account;
import com.sz.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sz.mapper.AccountMapper;

import java.util.HashMap;
import java.util.Map;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 登录
     * @param account
     * @return
     */
    @Override
    public Map<String, Object> loginBank(Account account) {
        Map<String,Object> map = new HashMap<>();
        int code = -1;
        String carNo = account.getCardNo();
        carNo = carNo.trim();
        if(carNo == null || carNo == ""){
           code = 400;
        }
        // 到这一步说明用户不为空
        int row = accountMapper.isExistCardNo(account.getCardNo());
        if (row == 1){
            // 用户存在
            Account a = accountMapper.checkCardNoPassword(account);
            if (a == null){
                // 密码错误
                code = 403;
            }else {
                // 用户存在并且账号密码正确
                code = 200;
                map.put("account",a);
            }
        }else {
            // 用户不存在
            code = 400;
        }
        System.out.println(code);
        map.put("code",code);
        return map;
    }


}
