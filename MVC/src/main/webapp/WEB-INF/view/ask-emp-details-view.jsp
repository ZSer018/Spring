<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="for" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>

<h2>
  please input youre name
</h2>

<%-- OLD
<form action="showDetails" method="get">
    <input type="text" name="employeeName" placeholder="Write your name" />
    <input type="submit"/>
</form>--%>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <for:select path="department">
    <form:options items="${employee.departments}"/>
    </for:select>
    <br><br>
<%--    BMV : <form:radiobutton path="carBrend" value="BMV"/>
    Audi : <form:radiobutton path="carBrend" value="Audi"/>
    MB : <form:radiobutton path="carBrend" value="Mers"/>--%>

    <%--<for:select path="carBrand">
        <form:options items="${employee.carBrands}"/>
    </for:select><br><br>
    --%>

    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/> <br><br>
<%--
    Eng <form:checkbox path="languages" value="Eng"/><br>
    Rus <form:checkbox path="languages" value="Rus"/><br>
    Ger <form:checkbox path="languages" value="Ger"/><br><br>--%>

 <form:checkboxes path="languages" items="${employee.languageList}"/>

    <input type="submit" value="OK"/>
</form:form>


</body>

</html>