<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/1
  Time: 18:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
图书列表
<table>
    <thead>
    <tr>用户信息</tr>
    <th>
        <td> ID</td>
        <td> 姓名</td>
        <td> 密码</td>
        <td>邮箱 </td>
        <td> </td>
        <td> </td>
    </th>
    </thead>
    <tbody>
    <tr>
    <td>${user.id}</td>
    <td>${user.passid}</td>
    <td>${user.name}</td>
    <td>${user.id}</td>
    <td>${user.id}</td>
    <td>${user.id}</td>
    </tr>
    </tbody>
</table>

</body>
</html>
