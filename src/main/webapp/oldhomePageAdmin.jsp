
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<%@page import="com.mvc.models.Client"%>
<%@page import="com.mvc.models.Hr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>ADMIN HOME</title>
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
</head>
<body style="background-image: url('https://images.unsplash.com/photo-1516387938699-a93567ec168e?ixlib=rb-1.2.1&amp;ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bGFwdG9wfGVufDB8fDB8fA%3D%3D&amp;w=1000&amp;q=80'); background-attachment: fixed; background-repeat: no-repeat; background-size: cover">

<!-- Header -->

<nav class="navbar navbar-expand">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" style="color:white ; font-family:cursive"><strong>Job Hunting Portal</strong></p></a>
    </div>
    <ul class="nav navbar-nav" >
    <li class="active"><a href="homePage.jsp" style="color:white ; margin-left:800px">Home</a></li>
      <li><a href="/about" style="color:white">About</a></li>
      <li><a href="/contact" style="color:white" >Contact</a></li>
      <li><a class=" btn btn-danger"  href="logout" style="color:white" >logout</a></li>
       
    </ul>
  </div>
</nav>

<div class="container">
		<div class="row">


			<div class="col-md-12  ">

				<div class="card">
					<div class="card-header text-center bg-dark text-white">
						<h2>HR Details</h2>

					</div>
					<div class="card-body">

						<table class="table">

							<tr>
								<th><center>Hr_Id</center></th>
								<th><center>Name</center></th>
								<th><center>Username</center></th>
								<th><center>Email</center></th>
								<th><center>Company_Name</center></th>
								<th><center>ForPost</center></th>
								<th><center>Mobile</center></th>
								<th><center>Skills</center></th>
								<th><center>Experience</center></th>
								<th><center>Status</center></th>
								<th><center>Action</center></th>
							</tr>

							</tr>


							<c:forEach items="${Hrlist}" var="h">
								<tr>
									<td><center>${h.id}</center></td>
									<td><center>${h.name}</center></td>
									<td><center>${h.username}</center></td>
									<td><center>${h.email}</center></td>
									<td><center>${h.companyname}</center></td>
									<td><center>${h.forpost}</center></td>
									<td><center>${h.mobile}</center></td>
									<td><center>${h.skills}</center></td>
									<td><center>${h.experience}</center></td>
									<td><center>${h.isActive}</center></td>
									<td scope="row"><a href="updatehr?id=${h.id}"class="btn btn-primary">Update</a></td>
								</tr>
							</c:forEach>



						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
	<br>
	<div class="container">
		<div class="row">


			<div class="col-md-12  ">

				<div class="card">
					<div class="card-header text-center bg-dark text-white">
						<h2>User Details</h2>

					</div>
					<div class="card-body">

						<table class="table">

							<tr>
								<th><center>User_Id</center></th>
								<th><center>Name</center></th>
								<th>Username
									</center>
								</th>
								<th><center>Email</center></th>
								<th><center>Address</center></th>
								<th><center>Mobile</center></th>
								<th><center>School</center></th>
								<th><center>
										College
										<center></th>
								<th><center>
										Skills
										<center></th>
								<th><center>Experience</center></th>
								<th><center>Action</center></th>
							</tr>

							<c:forEach items="${list}" var="c">
								<tr>
									<td><center>${c.id}</center></td>
									<td><center>${c.name}</center></td>
									<td><center>${c.username}</center></td>
									<td><center>${c.email}</center></td>
									<td><center>${c.address}</center></td>
									<td><center>${c.mobile}</center></td>
									<td><center>${c.school}</center></td>
									<td><center>${c.college}</center></td>
									<td><center>${c.skills}</center></td>
									<td><center>${c.experience}</center></td>
									<td scope="row"><a href="updateuser?id=${c.id}"class="btn btn-primary">Update</a></td>
									
								</tr>
							</c:forEach>



						</table>
					</div>
				</div>
			</div>

		</div>
	</div>
	<br />
	<div class="container">
		<div class="row">


			<div class="col-md-12  ">

				<div class="card">
					<div class="card-header text-center bg-dark text-white">
						<h2>Jobs Available</h2>

					</div>
					<div class="card-body">

						<table class="table">

							<tr>
							<tr>
								<th>Job_id
									</center>
								</th>
								<th>HR_Name
									</center>
								</th>
								<th><center>Company Name</center></th>
								<th><center>Job profile</center></th>
								<th>Location
									</center>
								</th>
								<th>Job Type
									</center>
								</th>
								<th>Skills required
									</center>
								</th>
								<th>Experience required
									</center>
								</th>
							</tr>


							<c:forEach items="${job}" var="j">
								<tr>
									<td><center>${j.id}</center></td>
									<td><center>${j.hrName}</center></td>
									<td><center>${j.companyName}</center></td>
									<td><center>${j.jobprofile}</center></td>
									<td><center>${j.location}</center></td>
									<td><center>${j.jobType}</center></td>
									<td><center>${j.skillsRequired}</center></td>
									<td><center>${j.experience}</center></td>
								</tr>
							</c:forEach>



						</table>
</body>
</html>