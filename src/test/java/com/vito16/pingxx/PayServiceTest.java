package com.vito16.pingxx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.vito16.pingxx.order.PayOrder;
import com.vito16.pingxx.service.PayService;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class PayServiceTest {
	private static final Logger logger = LoggerFactory.getLogger(PayServiceTest.class);
	@Autowired
	PayService payService;
	
	@Test
	public void testPay() {
		PayOrder order = new PayOrder();
		order.setAmount(9900);
		order.setBody("XXX.X..X.XX.=SDFJKSDJF");
		order.setChannel("alipay");
		order.setClientIp("192.168.23.23");
		order.setOrderNo("2341234223");
		order.setSubject("保健品");
		payService.pay(order);
		logger.info("order:{}", JSONObject.toJSONString(order));
	}
}
