package com.vito16.pingxx.order;

import java.io.Serializable;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2016/04/26
 */
public class PayOrder  implements Serializable{
    /**
     * 支付渠道
     */
    private String channel;
    /**
     * 币种
     */
    private String currency = "cny";
    /**
     * 客户端IP
     */
    private String clientIp;
    /**
     * 商品名
     */
    private String subject;
    /**
     * 商品描述
     */
    private String body;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 总金额
     */
    private Integer amount;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
