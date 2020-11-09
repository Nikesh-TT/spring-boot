package com.nikesh.single_sign_on_oauth2_legacy_stack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class UiController {

//  The templates go in the src/main/resources/templates directory. You’ll notice in the controller above that they’re simply returning strings for the routes.
//  When the Thymeleaf dependencies are included the build, Spring Boot automatically assumes you’re returning the name of the template file from the controllers,
//  and so the app will look in src/main/resources/templates for a file name with the returned string plus .html
    @RequestMapping("/securedPage")
    public String getSecuredPage(Model model, Principal principal){
        return "securedPage";
    }

    @RequestMapping("/")
    public String index(Model model, Principal principal){
        return "index";
    }

}
