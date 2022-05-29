package com.mouse.bean;

import com.mouse.bean.annotation.Dubbo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author gongchangyou
 * @version 1.0
 * @date 2022/5/29 17:24
 */
@RestController
@RequestMapping(value = "/pay")
public class TestController {
    @Dubbo
    private Long a;

    @GetMapping(value = "/toPay")
    public String pay(
    ){
        return "success!";
    }
}
