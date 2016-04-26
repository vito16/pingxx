<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="/common/global.jsp" %>
    <title>主页</title>
    <%@ include file="/common/meta.jsp" %>
    <%@ include file="/common/include-base-styles.jsp" %>
    <link type="text/css" rel="stylesheet" href="${ctx}/css/index.css"/>
</head>

<body>
<%@include file="/common/header-nav.jsp" %>
<div class="container">
    <div class="form-group">
        <select class="form-control" id="channel">
            <option value="alipay_pc_direct">支付宝</option>
            <option value="upacp_pc">银联</option>
        </select>
    </div>
    <div class="form-group">
        <input type="text" value="大鹏展翅" class="form-control" id="subject" placeholder="商品名" required autofocus>
    </div>
    <div class="form-group">
        <input type="text" value="木鱼测试商品" class="form-control" id="body" placeholder="商品描述" required autofocus>
    </div>
    <div class="form-group">
        <input type="text" value="19900" class="form-control" id="amount" placeholder="价格(分)" required autofocus>
    </div>
    <div class="form-group">
        <button id="payBtn" class="btn btn-lg btn-primary btn-block">付款</button>
    </div>
</div>
<!-- /container -->
<%@include file="/common/footer.jsp" %>
<%@ include file="/common/include-base-js.jsp" %>
<script type="application/javascript">
    $(function () {
        $("#payBtn").click(function () {
            $.ajax({
                method: "POST",
                url: "/pay",
                data: {
                    channel: $("#channel").val(),
                    body: $("#body").val(),
                    subject: $("#subject").val(),
                    amount: $("#amount").val()
                },
                success: function(charge){
                    pingppPc.createPayment(charge, function(result, err) {
                        console.log(result);
                        console.log(err);
                    })
                }
            });


        });
    })
</script>
</body>
</html>