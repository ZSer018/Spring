<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<body>

<h2>
    thanks!
</h2>
<br>
<br>
<%--Your name: ${param.employeeName}--%>

<%--Your name: ${nameAttribute}--%>

Your name: ${employee.name}<br>
Your surname: ${employee.surname}<br>
Your phone: ${employee.phoneNumber}<br>
Yore E-Mail ${employee.email}<br>
Your salary: ${employee.salary}<br>
Youre department:  ${employee.department}<br>
Youre car: ${employee.carBrand}<br>

Language(s):
<ul>
    <c:forEach var = "lang" items="${employee.languageList}">
        <li>   ${lang}    </li>
    </c:forEach>
</ul>
</body>

</html>