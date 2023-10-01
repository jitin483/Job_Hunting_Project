<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<%@page import="com.mvc.models.Client"%>
<%@page import="com.mvc.models.Hr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#tab{
    width:600px;
    height:200px;
    margin-left:auto;
    margin-right:auto;
    
    margin-top:50px;
}
.tab tr,th,td{
    border:2px double black;
    text-align:center;
    font-size:17px;
}
.container-fluid
{
background-color:black;
}
</style>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
</head>
<body style="background-image: url('https://images.unsplash.com/photo-1516387938699-a93567ec168e?ixlib=rb-1.2.1&amp;ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bGFwdG9wfGVufDB8fDB8fA%3D%3D&amp;w=1000&amp;q=80'); background-attachment: fixed; background-repeat: no-repeat; background-size: cover">

<!-- Header -->

<nav class="navbar navbar-expand">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" style="color:white ; font-family:cursive"><strong>Job Hunting Portal</strong></p></a>
    </div>
    <ul class="nav navbar-nav" >
<li class="active"><a href="/" style="color:white ; margin-left:800px">Home</a></li>
      <li><a href="/about" style="color:white">About</a></li>
      <li><a href="/contact" style="color:white" >Contact</a></li>
       <a class="btn btn-primary " href="logout" style="color:white" >logout</a>
    </ul>
  </div>
</nav>

<br>
	<center><a href="jobs"><button type="button" class="btn btn-primary btn-lg">Add
			Jobs</button></a></center>
	
	
	<div class="container">
		<div class="row">


			<div class="col-md-12  ">

				<div class="card">
					<div class="card-header text-center bg-dark text-white">
						<h2>
	Jobs Available
	</h2>
						
					</div>
					<div  class="card-body">

						<table  class="table">
							<tr>
								<th scope="col">Job_id</th>

								<th scope="col">HR_Name</th>

								<th scope="col">Company Name</th>
								<th><center>Job profile</center></th>
								<th><center>Location</center></th>
								<th><center>Job Type</center></th>
								<th><center>Skills required</center></th>
								<th><center>Experience required</center></th>
								<th><center>Action*</center></th>

							</tr>

	<c:forEach items="${jobs}" var="j">
			<tr>
				<td><center>${j.id}</center></td>
				<td><center>${j.hrName}</center></td>
				<td><center>${j.companyName}</center></td>
				<td><center>${j.jobprofile}</center></td>
				<td><center>${j.location}</center></td>
				<td><center>${j.jobType}</center></td>
				<td><center>${j.skillsRequired}</center></td>
				<td><center>${j.experience}</center></td>
				<td scope="row"><a href="update?id=${j.id}"
					class="btn btn-dark">Update</a></td>
			</tr>
		</c:forEach>



						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
	</body>
	</html>