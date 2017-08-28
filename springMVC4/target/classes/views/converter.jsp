<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>HttpMessageConverter Demo</title>
</head>
<body>
<div id="tesp"></div>
<input type="button" onclick="req()" value="请求"/>
<script src="assets/js/jQuery.js" type="text/javascript"></script>

<script>
    function req() {
        $.ajax({
            url: "converter",
            data: "1-wangyunfei",
            type: "POST",
            contentType: "application/x-wisely",
            success: function (data) {
                $("#resp").html(data);
            }
        });
    }
</script>
</body>
</html>