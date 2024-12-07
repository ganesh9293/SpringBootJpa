<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Customers</title>
    
</head>
<body>
    <h3 style="text-align: center;"><u>View All Customers</u></h3>
    <table>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>DATE OF BIRTH</th>
            <th>ADDRESS</th>
            <th>EMAIL</th>
            <th>PHNO</th>
        </tr>
        <c:forEach items="${customerlist}" var="cus">
            <tr>
                <td><c:out value="${cus.id}"/></td>
                <td><c:out value="${cus.name}"/></td>
                <td><c:out value="${cus.dob}"/></td>
                <td><c:out value="${cus.address}"/></td>
                <td><c:out value="${cus.email}"/></td>
                <td><c:out value="${cus.contactno}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>