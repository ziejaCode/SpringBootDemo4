package com.ziejacode.SpringDemo4.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello controller");
        return "some";
    }
}
