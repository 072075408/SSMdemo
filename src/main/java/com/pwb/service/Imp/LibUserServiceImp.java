package com.pwb.service.Imp;

import com.pwb.dao.LibUserDao;
import com.pwb.domain.LibUser;
import com.pwb.service.LibUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("libUserService")
public class LibUserServiceImp implements LibUserService {

    @Autowired
    private LibUserDao libUserDao;

    @Transactional(readOnly = true,isolation = Isolation.DEFAULT)
    @Override
    public List<LibUser> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return libUserDao.findAll();
    }

    @Transactional(isolation = Isolation.DEFAULT)
    @Override
    public void saveAccount(LibUser libUser) {
        System.out.println("Service业务层：保存帐户...");
        libUserDao.saveAccount(libUser);  //调用service中的saveAccount(account)方法
    }
}
