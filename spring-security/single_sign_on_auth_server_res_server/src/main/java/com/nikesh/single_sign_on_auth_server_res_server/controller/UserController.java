package com.nikesh.single_sign_on_auth_server_res_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

// This file allows the client apps to find out more about the users that authenticate with the server
@RestController
public class UserController {

    @GetMapping("/user/me")
    public Principal getUser(Principal principal){
        return principal;
    }

}
