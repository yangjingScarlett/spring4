<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>servlet async support</title>
</head>
<body>
<script type="text/javascript">
    deferred();//页面打开后就向后台发送请求
    function deferred() {
        console.log("String");//在控制台输出服务端推送的数据
        deferred();//一次请求完成后再向后台发送请求
    }
</script>
</body>
</html>