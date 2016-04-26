package com.vito16.pingxx.order;

import java.io.Serializable;

/**
 * Created by vito on 2016/4/26.
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
    private String client_ip;
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
    private String order_no;
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

    public String getClient_ip() {
        return client_ip;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
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

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
