<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <form:form action="regDone" modelAttribute="user">
        Name <form:input path="name"/>
        <br>
        age <form:input path="age"/>
        <br>
        mail <form:input path="email"/>

    <input type="submit" value="Ok">
    </form:form>
</head>
<body>

</body>
</html>
