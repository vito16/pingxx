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
    <form>
        <select name="channel">
            <option value="alipay">支付宝</option>
        </select>
        <div class="form-group">
            <input type="text" class="form-control" name="subject" placeholder="商品名" required autofocus>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="body" placeholder="商品描述" required autofocus>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="amount" placeholder="价格" required autofocus>
        </div>
        <div class="form-group">
            <button class="btn btn-lg btn-primary btn-block" type="submit">付款</button>
        </div>

    </form>

</div>
<!-- /container -->
<%@include file="/common/footer.jsp" %>
<%@ include file="/common/include-base-js.jsp" %>
</body>
</html>