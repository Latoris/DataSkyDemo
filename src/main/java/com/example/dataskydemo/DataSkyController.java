package com.example.dataskydemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataSkyController{

    @RequestMapping("/dataSkyDemo")
    public void dataSkyProcess(@RequestBody DataSkyData skyProcess){
        System.out.println(skyProcess);
    }
}