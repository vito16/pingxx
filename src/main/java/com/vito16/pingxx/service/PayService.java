package com.vito16.pingxx.service;

import com.alibaba.fastjson.JSONObject;
import com.pingplusplus.Pingpp;
import com.pingplusplus.exception.*;
import com.pingplusplus.model.Charge;
import com.vito16.pingxx.common.Constants;
import com.vito16.pingxx.order.PayOrder;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * 支付服务接口
 *
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/26
 */
@Service
public class PayService {
	public String pay(PayOrder order) {
		Pingpp.apiKey = Constants.TEST_KEY;
		Map<String, Object> chargeParams = new HashMap<String, Object>();
		chargeParams.put("order_no", order.getOrderNo());
		chargeParams.put("amount", order.getAmount());
		Map<String, String> app = new HashMap<String, String>();
		app.put("id", Constants.APP_KEY);
		chargeParams.put("app", app);
		chargeParams.put("channel", order.getChannel());
		chargeParams.put("currency", order.getCurrency());
		chargeParams.put("client_ip", order.getClientIp());
		chargeParams.put("subject", order.getSubject());
		chargeParams.put("body", order.getBody());

		Map<String, String> extra = new HashMap<String, String>();
		extra.put("success_url", order.getSuccessUrl());
		chargeParams.put("extra",extra);

		Charge charge = null;
		try {
			charge = Charge.create(chargeParams);
		} catch (AuthenticationException e) {
			e.printStackTrace();
		} catch (InvalidRequestException e) {
			e.printStackTrace();
		} catch (APIConnectionException e) {
			e.printStackTrace();
		} catch (APIException e) {
			e.printStackTrace();
		} catch (ChannelException e) {
			e.printStackTrace();
		}
		return JSONObject.toJSONString(charge);
	}
	
}
