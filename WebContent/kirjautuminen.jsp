<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles/auth.css">
<title>sisäänkirjautuminen</title>
</head>
<body>
<h1> Autojen Vuokraus </h1>

	<c:if test="${not empty error }">
		<p class="Virhe">
			<c:out value="${error}" />
		</p>
	</c:if>

	<div id="login">
		<form action="kirjaudu" method="post">
			<h1>Sisäänkirjautuminen</h1>
			<table>
				<tr>
					<td>Käyttäjätunnus</td>
					<td><input type="text" name="username"  value="<c:out value="${prev_login_username}"/>"/></td>
				</tr>
				<tr>
					<td>Salasana</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><button type="submit">Kirjaudu sisään</button></td>
				</tr>
			</table>
		</form>
	</div>

</body>
