<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visitor Form</title>
<style>
	.error{
	color:red;
	}
</style>
</head>
<body>
	<h3>Visitor Form</h3>
	<form:form action="processForm" modelAttribute="visitor">
		First Name:(*) <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		
		Last Name: <form:input path= "lastName" />
		<br><br>
		<hr>
		City:
		<form:select path="city">
			<%-- <form:option value="India" label="India" />
			<form:option value="USA" label="USA" />
			<form:option value="Brazil" label="Brazil" />
			<form:option value="Kentucky" label="Kentucky" />
			<form:option value="Rome" label="Rome" /> --%>
			
			<form:options items="${visitor.cityOptions }" />
			<br><br>
		</form:select><hr>
		<p> can you relocate ? </p>
			Yes <form:radiobutton path="relocate" value="Yes" />
			No <form:radiobutton path="relocate" value="No" />
		<br><br>
		<hr>
		Languages Known:
		
		Hindi <form:checkbox path="languagesKnown" value="Hindi" />
		English <form:checkbox path="languagesKnown" value="English" />
		Marathi <form:checkbox path="languagesKnown" value="Marathi" />
		German <form:checkbox path="languagesKnown" value="German" />
		Korean <form:checkbox path="languagesKnown" value="Korean" />
		French <form:checkbox path="languagesKnown" value="French" />
		<br><br>
		<hr>
		Country Code: <form:input path="conCode" />
		<form:errors path="conCode" cssClass="error" />
		<br><br>	
		<hr>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>