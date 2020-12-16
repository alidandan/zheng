<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>城市列表</title>
</head>
<body>


<c:forEach var="city" items="${cityList}">

    ${city.cid}, ${city.cname} <br/>

</c:forEach>



</body>
</html>
