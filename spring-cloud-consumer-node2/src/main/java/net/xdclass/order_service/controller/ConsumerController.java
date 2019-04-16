package net.xdclass.order_service.controller;

import net.xdclass.order_service.service.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ProductClient productClient;

    @RequestMapping("/hello2/{name}")
    public String index(@PathVariable("name") String name){
        return productClient.hello2(name);
    }
}
