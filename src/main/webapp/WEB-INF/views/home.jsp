<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<title>Home</title>
</head>
<body>
	<div class="container theme-showcase" role="main">
		<h1>Choose alphabet</h1>

		<c:if test="${not empty error}">
			<div class="alert alert-danger" role="alert">
				<strong>Error!</strong> ${error}
			</div>
		</c:if>
	
		<form:form method="POST" commandName="transliteratorModel" action="/transliterator/">
			<div class="form-group">
				<form:label path="primaryAlphabet">Source alphabet</form:label>
				<form:input path="primaryAlphabet" readonly="true"/>
			</div>
			
			<div class="form-group">
				<form:label path="targetAlphabet">Target alphabet</form:label>
				<form:select path="targetAlphabet" items="${targetAlphabets}"/>
			</div>
			
			<div class="form-group">
				<form:textarea path="input" cols="60" rows="20"/>
				<form:textarea path="result" cols="60" rows="20"/>
			</div>
			
			<div class="btn-group" role="group">
				<button type="submit" class="btn btn-primary">Transliterate</button>
				<button type="submit" class="btn btn-primary">Transliterate reverse</button>
			</div>
		</form:form>
	</div>
</body>
</html>