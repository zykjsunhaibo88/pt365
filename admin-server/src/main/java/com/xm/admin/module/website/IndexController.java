package com.xm.admin.module.website;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class IndexController {
    @GetMapping("/hello")
    public String indexPage(Model model) {
        model.addAttribute("name", "es_project.");
        return "hello";
    }
    @GetMapping("/vueResource")
    @ResponseBody    public String vueResource() {

        return "Hello vue-resource.";
    }
}

