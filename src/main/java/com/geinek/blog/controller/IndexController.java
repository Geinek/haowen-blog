package com.geinek.blog.controller;

import com.geinek.blog.exception.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
        String blog = null;
        if (blog == null) {
            throw new NotFoundException("Blog not exist.");
        }
        return "index";
    }
}
