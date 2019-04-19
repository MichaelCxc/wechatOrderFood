package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {


    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123458889");
        orderDetail.setOrderId("11133411");
        orderDetail.setProductIcon("http//www.baidu.com");
        orderDetail.setProductId("4447844");
        orderDetail.setProductName("辣条");
        orderDetail.setProductPrice(new BigDecimal(20.5));
        orderDetail.setProductQuantity(5);



        OrderDetail res = repository.save(orderDetail);
        Assert.assertNotNull(res);
    }


    @Test
    public void findByOrOrderId() {
        List<OrderDetail> orderDetailList = repository.findByOrOrderId("1111111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}