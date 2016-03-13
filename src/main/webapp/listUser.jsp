<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User list</title>
    <script src="<%= basePath %>js/jquery-1.8.0.min.js"></script>
    <script>
        /**
         * 修改当前页码，调用后台重新查询
         */
        function changeCurrentPage(currentPage) {
            $("#currentPage").val(currentPage);
            $("#mainForm").submit();
        }
    </script>
</head>
<body>
<form action="<%= basePath %>userController/listUser.do" id="mainForm" method="post">
    <input type="hidden" name="currentPage" id="currentPage" value="${page.currentPage}"/>
    <h3>UserList</h3>
    <a href="<%=path %>/addUser.jsp">Add User</a><br/>
    <table border="1" width="70%">
        <tr>
            <td>order num</td>
            <td>Id</td>
            <td>Name</td>
            <td>Age</td>
            <td>Address</td>
            <td>Delete</td>
            <td>Update</td>
        </tr>
        <c:forEach items="${userlist}" var="user" varStatus="status">
            <tr>
            <tr <c:if test="${status.index % 2 != 0}">style='background-color:#ECF6EE;'</c:if>>
                <td>${status.index+1 }</td>
                <td>${user.id }</td>
                <td>${user.name }</td>
                <td>${user.age }</td>
                <td>${user.address }</td>
                <td><a href="<%=path %>/userController/deleteUser.do?id=${user.id }">Delete</a></td>
                <td><a href="<%=path %>/userController/getUserById.do?id=${user.id }">Update</a></td>
            </tr>
        </c:forEach>
    </table>
    <%-- 分页页脚 --%>
    <br/>
    <div >
        共 <b>${page.totalNumber}</b> 条&nbsp;
        当前第<span>${page.currentPage}/${page.totalPage}</span>页
        <c:if test="${page.currentPage != 1}">
            <a href="javascript:changeCurrentPage('1')" class='first'>首页</a>
            <a href="javascript:changeCurrentPage('${page.currentPage-1}')" class='pre'>上一页</a>
        </c:if>
        <c:if test="${page.currentPage != page.totalPage}">
            <a href="javascript:changeCurrentPage('${page.currentPage+1}')" class='next'>下一页</a>
            <a href="javascript:changeCurrentPage('${page.totalPage}')" class='last'>末页</a>
        </c:if>
        跳至&nbsp;<input id="currentPageText" type='text' value='${page.currentPage}' class='allInput w28'/>&nbsp;页&nbsp;
        <a href="javascript:changeCurrentPage($('#currentPageText').val())" class='go'>GO</a>
    </div>
</form>
</body>
</html>