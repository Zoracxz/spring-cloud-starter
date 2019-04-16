package net.xdclass.order_service.service;

import net.xdclass.order_service.domain.ProductOrder;

public interface ProductOrderService {
    ProductOrder save(int userId,int productId);
}
