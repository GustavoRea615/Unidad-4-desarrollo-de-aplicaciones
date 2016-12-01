
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
    
    <title>Provider Manager | Home</title>
    
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
				
					<li><a href="new-provider">New Provider</a></li>
					<li><a href="all-providers">All Providers</a></li>
					
					
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
	
	
	<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to Provider Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_PROVIDERS'}">
			<div class="container text-center" id="providersDiv">
				<h3>My Providers</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Last Update</th>
								<th>Nationality</th>
								<th>Affiliation</th>
								<th>Active</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="provider" items="${providers}">
								<tr>
									<td>${provider.id}</td>
									<td>${provider.firstName}</td>
									<td>${provider.lastName}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd" value="${provider.lastUpdate}"/></td>
									<td>${provider.nationality}</td>
									<td>${provider.affiliation}</td>
									<td>${provider.active}</td>
									<td><a href="update-provider?id=${provider.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-provider?id=${provider.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Provider</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-provider">
					<input type="hidden" name="id" value="${provider.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">firstName</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="firstName" value="${provider.firstName}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">lastName</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="lastName" value="${provider.lastName}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">nationality</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="nationality" value="${provider.nationality}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">affiliation</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="affiliation" value="${provider.affiliation}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">active</label>
						<div class="col-md-7">
							<input type="radio" class="col-sm-1" name="active" value="true"/>
							<div class="col-sm-1">Yes</div>
							<input type="radio" class="col-sm-1" name="active" value="false" checked/>
							<div class="col-sm-1">No</div>
						</div>				
					</div>		
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>
		
	</c:choose>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>
