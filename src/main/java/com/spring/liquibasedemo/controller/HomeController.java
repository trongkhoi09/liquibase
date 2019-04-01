package com.spring.liquibasedemo.controller;

import com.spring.liquibasedemo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Autowired
    CompanyRepository repository;
    @GetMapping(value = "/")
    public String home(){
        return "home";
    }

    @GetMapping(value = "all")
    @ResponseBody
    public String all(){
        return repository.findAll().toString();
    }
}
