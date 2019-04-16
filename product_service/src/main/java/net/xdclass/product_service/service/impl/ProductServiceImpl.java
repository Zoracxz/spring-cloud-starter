package net.xdclass.product_service.service.impl;

import net.xdclass.product_service.domain.Product;
import net.xdclass.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class ProductServiceImpl implements ProductService {

    private static final Map<Integer,Product> daoMap = new HashMap<>();

    static{
        Product p1 = new Product(1,"iphonex",9999,10);
        Product p2 = new Product(2,"冰箱",5426,105);
        Product p3 = new Product(3,"洗衣机",1255,120);
        Product p4 = new Product(4,"电话",1299,210);
        Product p5 = new Product(5,"汽车",546465,110);
        Product p6 = new Product(6,"椅子",333,106);
        Product p7 = new Product(7,"书籍",123,17);
        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
        daoMap.put(p6.getId(),p6);
        daoMap.put(p7.getId(),p7);
    }

    @Override
    public List<Product> listProduct() {

        Collection<Product> collection = daoMap.values();
        List<Product> list = new ArrayList<>(collection);

        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
