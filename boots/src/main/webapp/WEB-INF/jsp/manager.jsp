
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
    
    <title>Manager Manager :v | Home</title>
    
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
				
					<li><a href="new-manager">New Manager</a></li>
					<li><a href="all-managers">All Managers</a></li>
					
					
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
	
	
	<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to Manager Manager :v</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_MANAGERS'}">
			<div class="container text-center" id="managersDiv">
				<h3>My Managers</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>First Name</th>
								<th>Last Name</th>
								<th>Last Update</th>
								<th>Skill</th>
								<th>Nationality</th>
								<th>Active</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="manager" items="${managers}">
								<tr>
									<td>${manager.id}</td>
									<td>${manager.firstName}</td>
									<td>${manager.lastName}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd" value="${manager.lastUpdate}"/></td>
									<td>${manager.skill}</td>
									<td>${manager.nationality}</td>
									<td>${manager.active}</td>
									<td><a href="update-manager?id=${manager.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-manager?id=${manager.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Manager</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-manager">
					<input type="hidden" name="id" value="${manager.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">firstName</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="firstName" value="${manager.firstName}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">lastName</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="lastName" value="${manager.lastName}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">skill</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="skill" value="${manager.skill}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">nationality</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="nationality" value="${manager.nationality}"/>
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
