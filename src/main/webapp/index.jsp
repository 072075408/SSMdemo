<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/findAll">测试查询</a>

<h3>测试包</h3>

<form action="account/save" method="post">
    姓名：<input type="text" name="userName" /><br/>
    密码：<input type="text" name="password" /><br/>
    <input type="submit" value="保存"/><br/>
</form>

</body>
</html>