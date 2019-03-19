package com.cim.cim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CimBaseController {

    @GetMapping("cim")
    String start() {
        return "redirect:/cim/checkIn";
    }

    @GetMapping("login")
    String login() {
        return "login";
    }
}
