package org.com.yzh.dubbo.main;

import org.com.yzh.dubbo.domain.OrderRequest;
import org.com.yzh.dubbo.domain.OrderResponse;
import org.com.yzh.dubbo.service.IoOrderService;
import org.com.yzh.dubbo.serviceimpl.IoOrderServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        IoOrderService ioOrderService = new IoOrderServiceImpl();
//        OrderRequest orderRequest = new OrderRequest();
//        orderRequest.setName("yin.zh");
//        OrderResponse response = ioOrderService.doOrder(orderRequest);
//        System.out.println(response);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("order-user.xml");
        IoOrderService ioOrderService = (IoOrderService)applicationContext.getBean("ioOrderService");
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setName("yin.zh");
        OrderResponse response = ioOrderService.doOrder(orderRequest);
        System.out.println(response);
    }
}
