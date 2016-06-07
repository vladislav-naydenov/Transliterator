<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<form:select path="alphabets">
	<form:option value="0" label="Select alphabet"/>
	<form:options items="${targetAlphabets}"/>
</form:select>
</body>
</html>
