package com.example.dataskydemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataSkyData {
    String id;
    String mmac;
    Integer rate;
    String wssid;
    String wmac;
    String time;
    String lat;
    String lon;
    String addr;
    List<DataSkyDeviceInfo> data;
}
