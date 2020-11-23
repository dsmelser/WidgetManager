package com.talentpath.WidgetREST.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/userdata")
public class UserdataController {

    @GetMapping("/test")
    public String testUserDataController(){
        return "should not see this!";
    }

}
