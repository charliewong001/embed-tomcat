package com.github.charlie.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/common")
public class CommonController {

    @RequestMapping(value = "/login")
    public @ResponseBody String login() {
        return "login";
    }
}
