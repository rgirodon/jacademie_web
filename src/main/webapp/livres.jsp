<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<jsp:include page="headerBootstrap.jsp" />
<body>
	<table class="table table-hover table-striped">
		<thead>
			<th>Auteur</th>
			<th>Titre</th>
		</thead>
		<tbody>
			<c:forEach items="${livres}" var="livre">
			  <tr>
			    <td> <c:out value="${livre.titre}" /> </td>
			    <td> <c:out value="${livre.auteur}" /> </td>          
			  </tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
