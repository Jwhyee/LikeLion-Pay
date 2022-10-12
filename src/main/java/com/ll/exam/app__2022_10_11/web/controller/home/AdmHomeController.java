package com.ll.exam.app__2022_10_11.web.controller.home;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
public class AdmHomeController {
    @GetMapping("")
    @PreAuthorize("isAuthenticated() and hasAuthority('ADMIN')")
    // isAuthenticated -> 로그인을 했는지
    // hasAuthority('ADMIN') -> ADMIN 인지 -> hasRole도 가능하지만 ROLE을 지정해줘야함.
    public String showIndex() {
        return "redirect:/adm/home/main";
    }

    @GetMapping("/home/main")
    @PreAuthorize("isAuthenticated() and hasAuthority('ADMIN')")
    public String showMain() {
        return "adm/home/main";
    }
}