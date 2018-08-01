package com.sz.mapper;

import com.sz.pojo.Account;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    /**
     * 检查某个卡号是否存在
     * @param cardNo
     * @return
     */
    int isExistCardNo(@Param("cardNo") String cardNo);

    /**
     * 检查卡号和密码是否存在对应的账号
     * @param account
     * @return
     */
    Account checkCardNoPassword(Account account);

}
