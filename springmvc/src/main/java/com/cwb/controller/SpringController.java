package com.cwb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/spring")
public class SpringController {

    @RequestMapping(value="/mvc")
    public void SpringMvc(){
        System.out.print("Hello SpringMvc");
    }

    //路径变量
    @RequestMapping(value="/mvc/{id}")
    public void PathVariable(@PathVariable int id){
        System.out.print(id);
    }
}
