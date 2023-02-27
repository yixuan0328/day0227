<%--
  Created by IntelliJ IDEA.
  User: 杨熠烜
  Date: 2022/7/5
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <h2>查询所有学生信息</h2>
        <table border="1" width="800px">
            <tr>
                <th>学生编号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>年龄</th>
                <th>生日</th>
                <th>地址</th>
                <th>班级</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${list}" var="stu" varStatus="index">
                <tr style="text-align: center">
                    <td>${stu.id}</td>
                    <td>${stu.name}</td>
                    <td>${stu.sex}</td>
                    <td>${stu.age}</td>
                    <td>
                        <fmt:formatDate value="${stu.birthday}" pattern="yyyy-MM-dd"></fmt:formatDate>
                    </td>
                    <td>${stu.address}</td>
                    <td>${stu.gradename}</td>
                    <td>
                        <button onclick="delStuByid(${stu.id})">删除</button>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </center>
</body>
<script>
    function delStuByid(id) {
        if (confirm("您确定删除id是--"+id+"--的学生信息m?")){
            location.href="<c:url value='/student/delStuByid.do?id='/>"+id;
        }
    }
</script>
</html>
