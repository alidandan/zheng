<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>

添加学生<br/>

<form action="${pageContext.request.contextPath}/student/save" method="post">


    学生姓名： <input name="stuName"/><br/>
    学生性别： <input name="stuSex" type="radio" value="0"/>男,<input name="stuSex" type="radio" value="1"/>女<br/>
    学生状态： <input name="stuStatus" type="radio" value="1"/>在校,<input name="stuStatus" type="radio" value="0"/>离校<br/>

    班主任: <select name="teaId">
                   <option value="">请选择班主任</option>
                     <c:forEach var="teacher" items="${teacherList}">
                         <option value="${teacher.teaId}">${teacher.teaName}</option>
                     </c:forEach>

            </select>
    <br/>

    <input type="submit" value="提交"/>


</form>


</body>
</html>
