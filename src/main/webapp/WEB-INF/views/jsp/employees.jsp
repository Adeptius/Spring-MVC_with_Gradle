<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="align-items: center">
    <%--<tr>--%>
        <%--<th>First name</th>--%>
        <%--<th>Last name</th>--%>
        <%--<th>Position</th>--%>
        <%--<th>Salary</th>--%>
    <%--</tr>--%>
    <%--<c:forEach var="employee" items="${employees}" >--%>
        <%--<tr>--%>
            <%--<td>${employee.name}</td>--%>
            <%--<td>${employee.surname}</td>--%>
            <%--<td>${employee.position}</td>--%>
            <%--<td>${employee.salary}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>

        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Position</th>
        </tr>

        <%--цикл foreach достаём лист, положенный в контроллере под ключем employees--%>
        <%--итерируемый обьект - employee--%>
        <c:forEach var="employee" items="${employees}" >
            <tr>
                <%--ссылка на employee c передачей параметров --%>
                <td><a href="/employee?employeeName=${employee.name}">${employee.name}</a> </td>
                <td>${employee.surname}</td>
                <td>${employee.position}</td>
            </tr>
        </c:forEach>
</table>
</body>
</html>
