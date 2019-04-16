package net.xdclass.order_service.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import net.xdclass.order_service.domain.ProductOrder;
import net.xdclass.order_service.service.ProductClient;
import net.xdclass.order_service.service.ProductOrderService;
import net.xdclass.order_service.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.Map;
import java.util.UUID;
@Service
public class ProductOrderServiceImpl implements ProductOrderService {
    @Autowired
    private ProductClient productClient;
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
    @Override
    public ProductOrder save(int userId, int productId) {

//        Map<String,Object> productMap = restTemplate.getForObject("http://product-service/api/v1/product/find?id="+productId,Map.class);
//        ServiceInstance instance = loadBalancerClient.choose("product-service");
//        String url = String.format("http://%s:%s/api/v1/product/find?id="+productId,instance.getHost(),instance.getPort());
//        RestTemplate restTemplate = new RestTemplate();
//        Map<String,Object> productMap = restTemplate.getForObject(url,Map.class);
        String response = productClient.findById(productId);
        JsonNode jsonNode = JsonUtils.str2JsonNode(response);
        ProductOrder productOrder = new ProductOrder();
        productOrder.setCreateTime(new Date());
        productOrder.setUserId(userId);
        productOrder.setTradeNo(UUID.randomUUID().toString());
        productOrder.setProductName(jsonNode.get("name").toString());
        productOrder.setPrice(Integer.parseInt(jsonNode.get("price").toString()));
        return productOrder;
    }
}
