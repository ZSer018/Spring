<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H3>ALL EMPS</H3>


<security:authorize access="hasAnyRole('IT', 'Manager')">
<input type="button" value="Salary" onclick="window.location.href = 'it_info'"/> only for IT stuff
<br>
</security:authorize>

<security:authorize access="hasAnyRole('Art', 'Manager')">
<br>
<input type="button" value="Salary" onclick="window.location.href = 'art_info'"/> only for Art stuff
</security:authorize>

</body>
</html>
