package com.kts.controller;

import com.kts.service.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HireController {

    @Autowired
    private ContainerService service;

    public HireController() {
        System.out.println("component creatd");
    }

    @GetMapping
    public void test(){
        System.out.println("working");
    }

}
