package com.vito16.pingxx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by vito on 2016/4/26.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class PayServiceTest {
    @Test
    public void testPay(){
        PayService payService = new PayService();
        PayOrder order = new PayOrder();
        order.setAmount(21);
        order.setBody("body");
        order.setChannel("alipay");
        order.setClient_ip("192.168.23.23");
        order.setOrder_no("234123423");
        order.setSubject("无");
        payService.pay(order);
    }
}
