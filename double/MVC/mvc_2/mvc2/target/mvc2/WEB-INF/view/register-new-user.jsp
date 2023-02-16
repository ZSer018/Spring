<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h2>REG NEW</h2><br>


<form:form action="regComplete" modelAttribute="userData">
    Name <form:input path="name"/><br><br>
    Mail <form:input path="mail"/><br><br>
    Age <form:input path="age"/><br><br>
    Gender <for:select path="gender">
        <form:options items="${userData.genderType}"/>
    </for:select>
    <br><br><br>
    <input type="submit" value="reg"/>
</form:form>

</body>
</html>
