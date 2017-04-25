<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>VUOKRAUS</title>
</head>
<body>
<form action="UusiVuokraus" method="get" >
VUOKRAUSAIKA: <c:out value="${vuokraus.vuokrauspvm}" /> &nbsp; - &nbsp; 
		<c:out value="${vuokraus.paattymispvm}" /> yht. <c:out value="${vali}" /> vrk
<body>
<br /> <br />
<br />
ASIAKAS: 
<table>
<tr>
<td><c:out value="${vuokraus.vuokraaja.id}" /> </td>
<td> <c:out value="${vuokraus.vuokraaja.etunimi}" />  &nbsp;
 <c:out value="${vuokraus.vuokraaja.sukunimi}" /> </td>
</tr>
<tr>
<td> </td>
<td> <c:out value="${vuokraus.vuokraaja.osoite}" />  </td>
</tr>
<tr>
<td> </td>
<td> <c:out value="${vuokraus.vuokraaja.posti.postinro}" /> &nbsp;
<c:out value="${vuokraus.vuokraaja.posti.postitmp}" /> </td>
</tr>
</table>

<br />
<br />
AUTO: 
<c:out value="${vuokraus.vuokrakohde.rekno}" />
<c:out value="${vuokraus.vuokrakohde.merkki}" />
<c:out value="${vuokraus.vuokrakohde.malli}" />
<c:out value="${vuokraus.vuokrakohde.vrkhinta}" /> eur/vrk

<br />
<br />
KOKONAISHINTA: <c:out value="${vuokraus.kokonaishinta}" /> eur
<br />
<br />
ONKO VUOKRAUS MAKSETTU:
<input type="radio" name="maksettu" value="ON" ><c:out value="ON" /> </input>
<input type="radio" name="maksettu" value="EI" checked> <c:out value="EI" /> </input>
<br />
<br />
<input type="submit" name="action" value="talleta vuokraus" />&nbsp;&nbsp;
<input type="submit" name="action" value="peruuta" />
</form>
</body>
</html>