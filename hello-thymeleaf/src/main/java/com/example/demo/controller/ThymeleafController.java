package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Đánh dấu đây là một Controller
// Nơi tiếp nhận các reqquest từ phía người dùng
@Controller
public class ThymeleafController {
    // Nếu người dùng request GET tới địa chỉ "/"
    @GetMapping("/")
    public String index() {
        // Trả về file index.html
        return "index";
    }

    // Nếu người dùng request GET tới địa chỉ "/about"
    // Model là một object của Spring Boot, được gắn vào trong mọi request
    @GetMapping("/about")
    public String index(Model model) {
        model.addAttribute("name", "Thu");

        // Trả về file hello.html cùng với thông tin trong object Model
        return "about";
    }


    @GetMapping("/admin")
    public String admin() {
        return "/admin/about";
    }

    @GetMapping("/admin/products")
    public String product() {
        return "/admin/product";
    }

    @GetMapping("/admin/blog")
    public String blog() {
        return "/admin/blog";
    }
}
