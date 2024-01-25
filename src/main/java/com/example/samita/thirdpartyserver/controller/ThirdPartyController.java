package com.example.samita.thirdpartyserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thirdparty")
public class ThirdPartyController {

    @GetMapping("/samita")
    public String getMessage(){

        return "samita";
    }

    @GetMapping("/jarnail")
    public String getJarnail(){

        return "jarnail";
    }


    @GetMapping("/feign-samita")
    public String getMessagefeign(){

        return "samita-feign";
    }

    @GetMapping("/feign-jarnail")
    public String getJarnailfeign(){

        return "jarnail-feign";
    }
}
