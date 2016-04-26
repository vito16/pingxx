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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/26
 */
@Controller
public class PayController {

    @RequestMapping("/")
    public String index(){
        return "";
    }

    @RequestMapping("/pay")
    public String pay(){
        return "";
    }
}
