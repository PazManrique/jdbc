<%@page import = "java.util.List"%>
<%@page language ==" contentType ="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset =="ISO 8859 1">
<title >${title}</title>

<h1> PROFESOR ${profesor} </h1>

</head>
<body>
<ul>
<c:forEach items ="${alumnos}" var ="alumno">
<li> <c:out value= "${alumno}" /></li>
</c:forEach>
</ul>
</body>
</html>
