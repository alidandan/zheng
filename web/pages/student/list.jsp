<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/student/add">学生添加</a> <br/>


<c:forEach var="student" items="${studentList}">

    ${student.stuId}, ${student.stuName}, ${student.stuSex eq 0 ? "男" : "女"},${student.stuStatus eq 0 ? "离校" : "在校"},${student.teacher.teaName}


    <a href="${pageContext.request.contextPath}/student/edit?stuId=${student.stuId}">修改</a>
    <a href="${pageContext.request.contextPath}/student/del?stuId=${student.stuId}">删除</a> <br/>


    <br/>

</c:forEach>

<%@include file="/pages/inc/pager.jsp"%>

</body>
</html>
