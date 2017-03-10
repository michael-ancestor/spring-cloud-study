package org.xujin.sc.eureka.first.order.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.xujin.sc.eureka.first.order.entity.Order;
import org.xujin.sc.eureka.first.order.model.OrderModel;
import org.xujin.sc.eureka.first.order.service.OrderService;

public class OrderServiceImpl implements OrderService {
	public OrderModel findOrderByOrderId(Long orderId) {
		OrderModel orderModel = new OrderModel();
		if (orderId.equals(2L)) {
			Order order = new Order();
			order.setCreateTime(new Date());
			order.setOrderNo(2L);
			BeanUtils.copyProperties(order, orderModel);
		}
		return orderModel;
	}

}
