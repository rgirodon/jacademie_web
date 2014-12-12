<html>
<head>
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="panel panel-success">
	  <div class="panel-heading">
	    <h3 class="panel-title">Message de la HelloMvcServlet</h3>
	  </div>
	  <div class="panel-body">
	    Hello <%= request.getAttribute("userName") %> !
	  </div>
	</div>
</body>
</html>
