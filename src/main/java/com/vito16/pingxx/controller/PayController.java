/*
 * www.yiji.com Inc.
 * Copyright (c) 2016 All Rights Reserved
 */

/*
 * 修订记录:
 * muyu@yiji.com 2016-04-26 12:58 创建
 *
 */
package com.vito16.pingxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vito16.pingxx.order.PayOrder;
import com.vito16.pingxx.service.PayService;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/26
 */
@Controller
@RequestMapping("/")
public class PayController {

    @Autowired
    PayService payService;

    @RequestMapping
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");
        return model;
    }

    @RequestMapping("/pay")
    @ResponseBody
    public String pay(PayOrder order){
        String str = payService.pay(order);
        return str;
    }
}
