package com.gcp.services.controller;/*
  @created 5/16/20
  @Author  - Meeravali Shaik
 */

import java.util.List;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppEngineDemoController {

    @GetMapping("/listing")
    public List<String> getAppEngineMethods(){
        return Arrays.asList("standard-one","standard-two","standard-three");
    }


}
