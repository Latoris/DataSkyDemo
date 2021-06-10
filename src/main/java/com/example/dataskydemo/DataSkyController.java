package com.example.dataskydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataSkyController{

    @RequestMapping("/dataSkyDemo")
    @ResponseBody
    public String dataSkyProcess(@RequestBody DataSkyData skyProcess){
        System.out.println(skyProcess);
        return "ok";
    }
}