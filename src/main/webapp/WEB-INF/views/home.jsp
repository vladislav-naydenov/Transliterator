<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Choose alphabet</h1>

	<form:form method="POST" commandName="transliteratorModel" action="/transliterator/">
		<table>
			<tr>
				<td>
					<form:label path="primaryAlphabet">Source alphabet</form:label>
					<form:input path="primaryAlphabet"/>
				</td>
				
				<td>
					<form:label path="targetAlphabet">Target alphabet</form:label>
					<form:select path="targetAlphabet" items="${targetAlphabets}"/>
				</td>
			</tr>
			
			<tr>
				<td><form:textarea path="input" cols="60" rows="20"/></td>
				<td><form:textarea path="result" cols="60" rows="20" readonly="true"/></td>
			</tr>
			
			<tr>
                <td colspan="2" align="center"><input type="submit" value="Transliterate"/></td>
            </tr>
		</table>
	</form:form>
</body>
</html>