package net.xdclass.gatewayservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class GatewayservicezuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayservicezuulApplication.class, args);
    }

}
