<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="saveEmployee" modelAttribute="employee">
             <form:hidden path="id"/>
    Name     <form:input path="name"/><br><br>
    Surname  <form:input path="surname"/><br><br>
    Dep      <form:input path="department"/><br><br>
    Salary   <form:input path="salary"/><br><br>

    <input type="submit" value="Ok">
</form:form>

</body>
</html>
