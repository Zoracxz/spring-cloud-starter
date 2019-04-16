package net.xdclass.order_service.service.impl;

import net.xdclass.order_service.service.ProductClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteHystrix implements ProductClient {

    @Override
    public String findById(int id) {
        return null;
    }

    @Override
    public String hello2(@RequestParam(value = "name") String name) {
        return "hello"+name+",this message send failed";
    }
}
