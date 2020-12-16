<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>教师管理</title>
    <script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/js/datePicker/WdatePicker.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    <script>

        function del(id){

            if(confirm("确认执行删除吗？")){
                //执行删除
                window.location.href = "${pageContext.request.contextPath}/teacher/delete?teaId=" + id;
            }

        }

        function delBatch(){

            if($("[name=\"teaIds\"]:checked").length > 0){

                //说明用户至少选择了一项

                if(confirm("确认删除这批教师吗？操作一旦提交不可撤消！")){
                    //提交批量删除
                    $("#teaForm").submit();

                }

            }else{
                //说明用户一项都没选
                alert("请选择一项进行删除！");

            }



        }


        $(function(){


            $("#selectAll").click(function(){



               // $("[name=\"teaIds\"]").prop("checked",this.checked);

                $("[name=\"teaIds\"]").prop("checked",$(this).prop("checked"));



            });



        });

    </script>

</head>
<body>

<form  action="${pageContext.request.contextPath}/teacher/list" method="post">


     <%--
    教师姓名： <input name="teaName" value="${param.teaName}"/><br/>
    教师性别：
    <input name="teaSex" type="radio" value=""  ${empty param.teaSex ?"checked='checked'":""}  />不限,
    <input name="teaSex" type="radio" value="男" ${param.teaSex eq "男" ? "checked='checked'":""}/>男,
    <input name="teaSex" type="radio" value="女" ${param.teaSex eq "女" ? "checked='checked'":""}/>女<br/>
    教师年龄： <input name="teaAge" value="${param.teaAge}"/><br/>
    --%>

         教师姓名： <input name="teaName" value="${teacher.teaName}"/><br/>
         教师性别：
         <input name="teaSex" type="radio" value=""  ${empty teacher.teaSex ?"checked='checked'":""}  />不限,
         <input name="teaSex" type="radio" value="男" ${teacher.teaSex eq "男" ? "checked='checked'":""}/>男,
         <input name="teaSex" type="radio" value="女" ${teacher.teaSex eq "女" ? "checked='checked'":""}/>女<br/>
         <%--教师年龄： <input name="teaAge" value="${teacher.teaAge}"/><br/> --%>

         教师年龄： <input name="teaAgeBegin" value="${teacher.teaAgeBegin}"/>  至  <input name="teaAgeEnd" value="${teacher.teaAgeEnd}"/>  岁  <br/>

         入职时间： <input name="teaDateBegin" value="${teacher.teaDateBegin}" class="Wdate" onClick="WdatePicker();" readonly="readonly"/>  至


         <input name="teaDateEnd" value="${teacher.teaDateEnd}" class="Wdate" onClick="WdatePicker();" readonly="readonly"/> <br/>

    <input type="submit" value="搜索"/>

</form>



<a href="${pageContext.request.contextPath}/teacher/edit">教师添加</a> <br/>

<a href="javascript:delBatch();">批量删除</a> <br/>

<input type="checkbox" id="selectAll"/>全选/取消 <br/>

<form id="teaForm" action="${pageContext.request.contextPath}/teacher/deleteBatch" method="post">

    <%--
<c:forEach var="teacher" items="${teacherList}">


    <input type="checkbox" name="teaIds" value="${teacher.teaId}"/>

    ${teacher.teaId}, ${teacher.teaName}, ${teacher.teaSex},${teacher.teaAge}


    <a href="${pageContext.request.contextPath}/teacher/edit?teaId=${teacher.teaId}">修改</a>

    <a href="javascript:del(${teacher.teaId});">删除</a> <br/>


    <br/>

</c:forEach>--%>

        <c:forEach var="teacher" items="${pageInfo.list}">


            <input type="checkbox" name="teaIds" value="${teacher.teaId}"/>

            ${teacher.teaId}, ${teacher.teaName}, ${teacher.teaSex},${teacher.teaAge}


            <a href="${pageContext.request.contextPath}/teacher/edit?teaId=${teacher.teaId}">修改</a>

            <a href="javascript:del(${teacher.teaId});">删除</a> <br/>


            <br/>

        </c:forEach>


</form>


<%@include file="/pages/inc/pager2.jsp"%>

</body>
</html>
