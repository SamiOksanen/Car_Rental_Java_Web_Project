<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Vuokraukset</title>
</head>
<body>

<c:forEach items="${vuokraukset}" var ="vuokraus">
<c:out value="${vuokraus.numero}" /> &nbsp;&nbsp;
<c:out value="${vuokraus.vuokrauspvm}" /> &nbsp; - &nbsp;
<c:out value="${vuokraus.paattymispvm}" /> <br />
<c:out value="${vuokraus.kokonaishinta}" /> eur
<c:if test="${vuokraus.maksupvm != null }">
<c:out value="  maksettu " /> 
<c:out value="${vuokraus.maksupvm}" />
</c:if>
<div>
<c:out value="${vuokraus.vuokraaja.id}" />&nbsp;&nbsp;
<c:out value="${vuokraus.vuokraaja.etunimi}" />&nbsp;
<c:out value="${vuokraus.vuokraaja.sukunimi}" /><br />
<c:out value="${vuokraus.vuokraaja.osoite}" /> <br />
<c:out value="${vuokraus.vuokraaja.posti.postinro}" />&nbsp;
<c:out value="${vuokraus.vuokraaja.posti.postitmp}" />
</div>
<div>
<c:out value="${vuokraus.vuokrakohde.rekno}" />&nbsp;
<c:out value="${vuokraus.vuokrakohde.merkki}" />&nbsp;
<c:out value="${vuokraus.vuokrakohde.malli}" /><br />
<c:out value="${vuokraus.vuokrakohde.vrkhinta}" /> eur <br />
<c:if test="${vuokraus.vuokrakohde.huoltopvm != null}">
<c:out value="auto on huollettu viimeksi " />
<c:out value="${vuokraus.vuokrakohde.huoltopvm}" />
</c:if>
</div>
<br />
<br />
</c:forEach>



</body>
</html>