package com.pwb.controller;

import com.pwb.domain.LibUser;
import com.pwb.service.LibUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class LibUserController {
    @Autowired
    private LibUserService libUserService;

    @RequestMapping("/account/findAll")
    public String findAll(Model model){  //存数据， Model对象
        System.out.println("Controller表现层：查询所有账户...");
        // 调用service的方法
        List<LibUser> list = libUserService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/account/save")
    public void save(LibUser libUser, HttpServletRequest request, HttpServletResponse response) throws IOException {
        libUserService.saveAccount(libUser);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
