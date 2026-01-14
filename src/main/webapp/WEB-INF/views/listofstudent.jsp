<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>

<table class="table table-bordered">
    <thead>
        <tr>
            <th>Name</th>
            <th>City</th>
            <th>Course</th>
            <th>Fees</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${stud}" var="student">
            <tr>
                <td>${student.name}</td>
                <td>${student.cit}</td>
                <td>${student.course}</td>
                <td>${student.fees}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
