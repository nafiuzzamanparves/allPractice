package com.nafiuzzaman.allPractice.controller;

import com.nafiuzzaman.allPractice.utils.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@RequestMapping("/api")
public class AppController {

    @GetMapping("/test")
    public String testController() {
        return "Successful";
    }

    @GetMapping("/callCustomException")
    public String callCustomException(@RequestParam String message){
        CustomException customException = new CustomException(message);
        return customException.getMessage();
    }
}
