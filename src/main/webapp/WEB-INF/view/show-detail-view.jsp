<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h2>Dear employee</h2>
    <h3>Your name : ${employee.name} </h3>
    <h3>Your name : ${employee.surname} </h3>
    <h3>Your name : ${employee.salary} </h3>
    <h3>Your name : ${employee.department} </h3>
    <h3>Your car : ${employee.carBrand} </h3>
    <ul>
        <c:forEach var ="lang" items="${employee.languages}" >

            <li>${lang} </li>

        </c:forEach>
    </ul>

</body>
</html>