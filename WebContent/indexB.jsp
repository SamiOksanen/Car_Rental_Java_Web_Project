<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.min.js"></script>
<script src="_script.js"></script>
<link rel="stylesheet" type="text/css" href="_style.css">
<title>VUOKRAUKSET</title>
</head>
<body>
<h1>Autojen vuokraukset</h1>
<form action="Servlet" method="get" >
<input type="submit" name="action" value="hae kaikki vuokraukset"/>
<input type="submit" name="action" value="hae tietyn pvm vuokraukset"/>
<input type="text" name="date" class="date"	placeholder="Valitse päivä" spellcheck="false"/>

<c:if test="${tyhja==true}" >
<br />
<c:out value="${date}" /> <c:out value=" ei löytyny yhtään vuokrausta" />
</c:if>
<br />
<c:if test="${EI_LOYDY==true}" >
<br />
<c:out value=" Tietokannassa ei ole yhtään autojen vuokrauksia" />
</c:if>
<br />
<br />
<c:if test="${TK_VIRHE==true}" >
<c:out value="Tietokantaan ei nyt saada yhteyttä. Korjaamme vian tuotapikaa" />
</c:if>
<br />
<br />
</form>
<form action="UusiVuokraus" method="get" >
<input type="submit" name="action" value="tee uusi vuokraus" /> &nbsp; &nbsp;
<br />
<c:if test="${LISAYSONNISTUI== true}" >
 <c:out value="Vuokrauksen lisäys onnistui" />
</c:if>
<c:if test="${LISAYSEPAONNISTUI== true}" >
 <c:out value="Vuokrauksen lisäys EPÄONNISTUI" />
</c:if>
</form>
<form action="kirjaudu_ulos" method="get">
<input type="submit" name="action" value="Kirjaudu_ulos" />
</form>
</body>
</html>