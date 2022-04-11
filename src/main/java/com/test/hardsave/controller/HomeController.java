package com.test.hardsave.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // 홈페이지 이동 API
    @GetMapping("/")
    public String moveIndex (Model model,@RequestParam(required = false) String filename) {

        model.addAttribute("filepath", filename);
        return "imageview";
    }

}
