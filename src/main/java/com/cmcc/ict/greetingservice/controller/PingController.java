package com.cmcc.ict.greetingservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * &#064;Author  haoLin
 * &#064;Date 2024/10/15
 */
@RestController
@RequestMapping("/")
public class PingController {

    @GetMapping
    public String ping() {
        return "Hello World";
    }
}
