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
		<c:if test="${not empty info}">
			<div class="alert alert-info" role="alert">
				${info}
			</div>
		</c:if>
	
		<form:form method="POST" commandName="transliteratorModel" action="/transliterator/">
			<div class="form-group">
				<form:label path="sourceAlphabet">Source alphabet</form:label>
				<form:input path="sourceAlphabet" readonly="true"/>
			</div>
			
			<div class="form-group">
				<form:label path="targetAlphabet">Target alphabet</form:label>
				<form:select path="targetAlphabet" items="${targetAlphabets}"/>
			</div>
			
			<fieldset class="form-group">
				<form:label path="sourceAlphabetString">Source</form:label>
				<form:textarea path="sourceAlphabetString" cssClass="form-control" cols="60" rows="20"/>
				
				<form:label path="targetAlphabetString">Target</form:label>
				<form:textarea path="targetAlphabetString" cssClass="form-control" cols="60" rows="20"/>
			</fieldset>
			
			<div class="btn-group" role="group">
				<input type="submit" name="transliterate" value="Transliterate" class="btn btn-primary"/>
				<input type="submit" name="transliterateReverse" value="Transliterate reverse" class="btn btn-primary"/>
			</div>
		</form:form>
	</div>
</body>
</html>