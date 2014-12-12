<%@page import="org.jacademie.tdweb.domain.Livre"%>
<%@page import="java.util.Collection"%>
<%
Collection<Livre> livres = (Collection<Livre>)request.getAttribute("livres");
%>
<html>

<jsp:include page="headerBootstrap.jsp" />

<title>Liste des livres</title>
<body>
<table class="table table-hover table-striped">
	<thead>
		<th>Auteur</th>
		<th>Titre</th>
	</thead>
	<tbody>
<%
	for (Livre livre : livres) {
%>
		<tr>
			<td><%= livre.getAuteur() %></td>
			<td><%= livre.getTitre() %></td>
		</tr>
<%
	}
%>	
	</tbody>
</table>
</body>
</html>