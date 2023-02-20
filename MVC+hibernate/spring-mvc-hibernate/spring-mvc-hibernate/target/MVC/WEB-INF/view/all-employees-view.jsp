<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title> sll employees</title>
</head>
<body>
<h2> all employees</h2>

<table>
    <tr>
        <th>name</th>
        <th>surname</th>
        <th>department</th>
        <th>salary</th>
        <th>Operations</th>
    </tr>



    <c:forEach var="emp" items="${allEmps}">

        <c:url var="updateButton" value="/updateInfo">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <c:url var="removeButton" value="/removeEmp">
            <c:param name="empId" value="${emp.id}"/>
        </c:url>

        <tr>
            <td>${emp.name}</td>
            <td>${emp.surname}</td>
            <td>${emp.department}</td>
            <td>${emp.salary}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}' ">
                <input type="button" value="Delete" onclick="window.location.href = '${removeButton}' ">
            </td>
        </tr>
    </c:forEach>
</table>

<br><br>
<input type="button" value="OK" onclick="window.location.href= 'addnewemployee'"/>

</body>
</html>
