package com.vito16.pingxx.service;

import com.alibaba.fastjson.JSONObject;
import com.pingplusplus.Pingpp;
import com.pingplusplus.exception.*;
import com.pingplusplus.model.Charge;
import com.vito16.pingxx.common.Constants;
import com.vito16.pingxx.order.PayOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vito on 2016/4/26.
 */
public class PayService {
    public String  pay(PayOrder order){
        Pingpp.apiKey="sk_test_qLiDCK8uzTmHfnHyPOmXnb1G";
        Map<String, Object> chargeParams = new HashMap<String, Object>();
        chargeParams.put("order_no",  order.getOrder_no());
        chargeParams.put("amount", order.getAmount());
        Map<String, String> app = new HashMap<String, String>();
        app.put("id", Constants.KEY);
        chargeParams.put("app",app);
        chargeParams.put("channel",order.getChannel());
        chargeParams.put("currency",order.getCurrency());
        chargeParams.put("client_ip",order.getClient_ip());
        chargeParams.put("subject",order.getSubject());
        chargeParams.put("body",order.getBody());
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
