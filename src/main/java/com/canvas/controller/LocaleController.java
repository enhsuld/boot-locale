package com.canvas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LocaleController {

    @RequestMapping(value = "/{locale:en|mn|vi}/login2")
    public String login2(Model model) {
        return "login2";
    }
}