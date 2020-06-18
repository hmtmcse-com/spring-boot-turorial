package com.hmtmcse.spring;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/")
    @ResponseBody
    public String bismillah(){
        return "<h1>Bismillah</h1>";
    }

}
