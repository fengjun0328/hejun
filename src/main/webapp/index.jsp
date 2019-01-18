<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
%>
<html>
<body>
<h2>登录</h2>
</body>

<head>
    <form action="${path}/index.html" method="post">
        用户名：<input type="text" name="userName">
        密  码：<input type="text" name="userPwd">
        <input type="submit" value="登录">
    </form>

</head>

</html>
