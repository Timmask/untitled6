<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>


<form:form action="showDetails" modelAttribute="employee" >
    Name<form:input path="name"/>
    <form:errors path="name" />
    <br>
    <br>
    Surname<form:input path="surname"/>
    <form:errors path="surname" />
    <br>
    <br>
    salary<form:input path="salary"/>
    <br>
    <br>
    Department
    <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br>
    <br>

    Which car do you want ?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <br>
    Foreign languages <br>
    <form:checkboxes path="languages" items="${employee.languagesList}"/> <br>


    <br>
    <br>
    <input type="submit">
</form:form>

</body>
</html>