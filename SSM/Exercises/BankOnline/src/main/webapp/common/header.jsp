<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/31
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="${ctx}/static/js/jquery.js" type="text/javascript"></script>
<div>
    <p>卡号：${account.cardNo}<a href="${ctx}/account/logout" id="as">退出登录</a></p>
</div>
<div>
    <div id="divs">
        <p><a href="javascript:void(0);" id="queryBalance">查询余额</a></p>
        <p><a href="#" >转账</a></p>
        <p><a href="#">查询交易记录</a></p>
        <p><a href="#">修改密码</a></p>
    </div>
    <div id="info">
        <h2>欢迎使用个人网上银行</h2>
    </div>
</div>

<style>
    #as{
        margin-left:1cm
    }
    #divs{
        float: left;
    }
    #info{
        border:5px solid cyan;
        height: 200px;
        width: 500px;
        text-align: center;
        line-height: 100px;
        float: left;
        margin-left:4cm;
    }
</style>

<script>
    $(function () {
        $('#queryBalance').click(function () {
            var html = '<h2>你的账户余额为：${accountAll.balance}元！</h2>';
            $('#info').html(html);
        })
    })
</script>