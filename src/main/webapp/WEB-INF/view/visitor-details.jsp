<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitor Details</title>
</head>
<body>
	The Visitor details are: ${visitor.firstName }${visitor.lastName}<br><hr>
	City: ${visitor.city }<br><hr>
	Can Relocate: ${visitor.relocate}<br>
	<hr>
	Languages Known:  
	<ul>
		<c:forEach var="temp" items="${visitor.languagesKnown }">
		<li>${temp}</li>
		</c:forEach>
	</ul><hr>
 	Country Code: ${visitor.conCode}<hr>
</body>
</html>