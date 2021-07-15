package com.pwb.service;

import com.pwb.domain.LibUser;

import java.util.List;

public interface LibUserService {
    // 查询所有账户
    public List<LibUser> findAll();

    // 保存帐户信息
    public void saveAccount(LibUser libUser);
}
