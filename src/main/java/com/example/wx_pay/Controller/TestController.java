package com.example.wx_pay.Controller;

import com.example.wx_pay.Interface.WeixinPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private WeixinPayService weixinPayService;

    @RequestMapping("/createNative")
    public Map createNative(){

        return weixinPayService.createNative("463724632543","1");
    }

}
