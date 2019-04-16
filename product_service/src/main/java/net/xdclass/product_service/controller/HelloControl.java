package net.xdclass.product_service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return "hello "+name+",this is the first message";
    }
}
