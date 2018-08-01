package com.sz.service;

import com.sz.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.Map;

public interface AccountService {

    /**
     * 登录
     * @param account
     * @return
     */
    Map<String,Object> loginBank(Account account);

}
