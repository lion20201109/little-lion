package com.jyc.lion.xsz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    public static String uuid;

    @GetMapping("/echo")
    public String echo(){
        return uuid;
    }
}
