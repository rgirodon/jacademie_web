<html>

<jsp:include page="headerBootstrap.jsp" />

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
