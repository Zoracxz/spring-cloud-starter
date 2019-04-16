package net.xdclass.order_service.service;

import net.xdclass.order_service.service.impl.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 商品服务客户端
 */
@FeignClient(name = "product-service2",fallback = HelloRemoteHystrix.class)
public interface ProductClient {
    @GetMapping("/api/v1/product/find")
    String findById(@RequestParam("id") int id);
    @RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);
}
