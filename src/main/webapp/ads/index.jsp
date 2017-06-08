<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp"/>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp"/>
    <div>
        <c:forEach var="ad" items="${ads}">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <h3>Posted By ${ad.userId}</h3>
        </c:forEach>
    </div>
</body>
</html>
