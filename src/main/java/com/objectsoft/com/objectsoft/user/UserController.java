package com.objectsoft.com.objectsoft.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/")
    String home() {
        return "Hi World!!!";
    }
}
