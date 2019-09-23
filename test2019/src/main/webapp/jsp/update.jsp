<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息更改页面</title>
</head>
<body>
<form action="/comm/update.do" method="post">
    <input type="hidden" name="id" value="${commodity.id}">
    <table border="1">
        <tr>
            <th>商品名称</th>
            <td><input type="text" name="name" value="${commodity.name}"></td>
        </tr>
        <tr>
            <th>商品价格</th>
            <td><input type="text" name="price" value="${commodity.price}"></td>
        </tr>
        <tr>
            <th>商品生产日期</th>
            <td><input type="text" name="birthday" value="${commodity.birthday}"></td>
        </tr>
        <tr>
            <th>商品简介</th>
            <td><textarea name="describes">${commodity.describes}</textarea></td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">提交</button></td>
        </tr>
    </table>
</form>
</body>
</html>
