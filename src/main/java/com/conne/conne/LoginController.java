package com.conne.conne;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login")
    public String handlePostRequest(@RequestBody String body) {
        // handle the request
        System.out.println( "hehe"+body);
        return "true" ;
    }
}
