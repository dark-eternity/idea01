<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品信息列表页面</title>
    <script src="../js/jquery-3.3.1.min.js"></script>
    <script>
    </script>
</head>
<body>
<form action="#" method="post">
    <table border="1">
        <tr>
            <th>商品id</th>
            <th>商品名称</th>
            <th>商品价格</th>
            <th>生产日期</th>
            <th>商品描述</th>
            <th>操作</th>
        </tr>
        <c:if test="${lists != null && lists.size() > 0}">
            <c:forEach items="${lists}" var="comm" step="1">
                <tr>
                    <td>${comm.id}</td>
                    <td>${comm.name}</td>
                    <td>${comm.price}</td>
                    <td>${comm.birthday}</td>
                    <td>${comm.describes}</td>
                    <td><a href="/comm/findById.do?id=${comm.id}">修改</a></td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</form>
</body>
</html>
