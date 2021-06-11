package com.example.dataskydemo;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Controller
public class DataSkyController{

    @RequestMapping("/dataSky")
    @ResponseBody
    public String dataSkyProcess(@RequestParam Map<String,String> params){
        if(params.isEmpty()){
            return "null";
        }
        try {
            DataSkyData dsData = JSON.parseObject(params.get("data"), DataSkyData.class);
            List<String> macList = dsData.getData().stream().map(i -> i.getMac()).collect(Collectors.toList());
            String miMac = "9c:bc:f0:d4:f0:24";
            if (macList.contains(miMac)) {
                System.out.println("打卡1，" + System.currentTimeMillis());
            }
            if(macList.contains("90:2b:d2:90:02:9b")){
                System.out.println("打卡2， "+System.currentTimeMillis());
            }
            if(macList.contains("14:f6:d8:3e:f0:71")){
                System.out.println("打卡3"+System.currentTimeMillis());
            }
        }catch (Exception e){
            log.error("exception{},{}", e, JSON.toJSONString(params));
        }
        return "ok";
    }
}