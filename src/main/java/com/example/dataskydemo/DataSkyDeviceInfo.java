package com.example.dataskydemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataSkyDeviceInfo {
    private String mac;
    private String rssi;
    private String rssi1;
    private String rssi2;
    private String rssi3;
    private String rssi4;
    private String rssi5;
    private String rssi6;
    private String range;
    private String router;
}


