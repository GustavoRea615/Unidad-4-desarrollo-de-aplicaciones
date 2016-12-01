<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Task Manager | Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
    <!--[if lt IE 9]>
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	<![endif]-->
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
				<li><a href="task">Task</a></li>
				<li><a href="account">Account</a></li>
				<li><a href="customer">Customer</a></li>
				<li><a href="desing">Desing</a></li>
					<li><a href="development">Development</a></li>
					<li><a href="distributor">Distributor</a></li>
					<li><a href="manager">Manager</a></li>
					<li><a href="provider">Provider</a></li>
					<li><a href="publisher">Publisher</a></li>
					<li><a href="tester">Tester</a></li>
					<li><a href="job">Job</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome SUPER Manager</h1>
					<h4>Rea Jimenez Gustavo</h4>
				</div>
			</div>
		</c:when>
		
		
	</c:choose>


	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>
