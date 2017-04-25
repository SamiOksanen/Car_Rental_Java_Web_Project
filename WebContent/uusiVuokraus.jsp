<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.min.js"></script>
<script src="_script.js"></script>
<link rel="stylesheet" type="text/css" href="_style.css">
<title>UUSI VUOKRAUS</title>
</head>
<body>
<form action="UusiVuokraus" method ="get" >

<div>
Valitse vuokrausaika:
aloituspvm: <input type="text" name="date" value="${date}" class="date"	placeholder="Valitse päivä" spellcheck="false"/>
lopetuspvm: <input type="text" name="date2" value="${date2}" class="date" placeholder="Valitse päivä" spellcheck="false"/>
<c:if test="${pvmVirhe==true}" >
<c:out value="Anna päivämäärät oikeassa järjestyksessä" />
</c:if>
<c:if test="${pvmPuuttuu==true}" >
<c:out value="Anna kumpikin päivämäärä "/>
</c:if>

<input type="submit" name="action" value="hae asiakkaat ja autot" />
</div>	  
<div>
<c:if test="${not empty autothaettu}" >
<p>
Valitse vuokraaja: <select name="vuokraaja">
	  <c:forEach items="${asiakkaat}" var= "asiakas">
		<option value="${asiakas.id}" 
			<c:if test="${vuokraaja==asiakas.id}"> SELECTED </c:if> > 
		<c:out value ="${asiakas.id}" />&nbsp;
		<c:out value ="${asiakas.etunimi}" />&nbsp;
		<c:out value ="${asiakas.sukunimi}" /> 
		</option>
	  </c:forEach>
	  </select>
	  <br />
	  <br />
	  </p>
 <table>
 <tr> <td>
Valitse vuokrattava auto: </td> <td> </td><td> </td><td> </td><td> </td>
</tr>

	<c:forEach items="${autot}" var="auto">
	<tr>
	<td><input type="radio" name="valittuauto" value="${auto.rekno}">
	<c:out value="${auto.rekno}" /> </td>
	<td><c:out value="${auto.merkki}" /> &nbsp;</td>
	<td><c:out value="${auto.malli}" /> &nbsp;</td>
	<td><c:out value="${auto.vrkhinta}" /> &nbsp;</td>
	<td><c:out value="${auto.huoltopvm}" /> &nbsp;</td>
	<br />
	</input>
	</tr>
	</c:forEach>
 </table>
 <c:if test="${autoPuuttuu==true}" >
 <c:out value="valiste myös auto" />
 </c:if>
 <br />
 <input type="submit" name = "action" value="jatka" />
 </c:if>
 
</div>

</form>
</body>
</html>