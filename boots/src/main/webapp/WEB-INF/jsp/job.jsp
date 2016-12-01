
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
    
    <title>Job Manager | Home</title>
    
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
				
					<li><a href="new-job">New Job</a></li>
					<li><a href="all-jobs">All Jobs</a></li>
					
					
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
	
	
	<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to Job Manager</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_JOBS'}">
			<div class="container text-center" id="jobsDiv">
				<h3>My Jobs</h3>
				<hr />
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>Job Title</th>
								<th>Min Salary</th>
								<th>Max Salary</th>
								<th></th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="job" items="${jobs}">
								<tr>
									<td>${job.id}</td>
									<td>${job.jobTitle}</td>
									<td>${job.minSalary}</td>
									<td>${job.maxSalary}</td>
									
									<td><a href="update-job?id=${job.id}"><span class="glyphicon glyphicon-pencil"></span></a></td>
									<td><a href="delete-job?id=${job.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Job</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-job">
					<input type="hidden" name="id" value="${job.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">JobTitle</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="jobTitle" value="${job.jobTitle}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">MinSalary</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="minSalary" value="${job.minSalary}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">MaxSalary</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="maxSalary" value="${job.maxSalary}"/>
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
