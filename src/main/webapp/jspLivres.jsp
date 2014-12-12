<%@page import="org.jacademie.tdweb.domain.Livre"%>
<%@page import="java.util.Collection"%>
<%
Collection<Livre> livres = (Collection<Livre>)request.getAttribute("livres");
%>
<html>
<head>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
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