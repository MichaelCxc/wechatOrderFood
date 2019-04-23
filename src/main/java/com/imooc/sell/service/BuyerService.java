package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDTO;

/*
 * @Author Michael
 * @Description 买家
 * @Date 9:11 AM 2019/4/23
 * @Param 
 * @return 
 **/
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    OrderDTO cancelOrder(String openid, String orderId);

}
