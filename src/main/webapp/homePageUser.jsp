<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<%@page import="com.mvc.models.Client"%>
<%@page import="com.mvc.models.Hr"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title><style>
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
</style>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body style="background-image: url('https://images.unsplash.com/photo-1516387938699-a93567ec168e?ixlib=rb-1.2.1&amp;ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bGFwdG9wfGVufDB8fDB8fA%3D%3D&amp;w=1000&amp;q=80'); background-attachment: fixed; background-repeat: no-repeat; background-size: cover">
<!-- Header -->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" style="color:white ; font-family:cursive"><strong>Job Hunting Portal</strong></p></a>
    </div>
    <ul class="nav navbar-nav" >
<li class="active"><a href="/" style="color:white ; margin-left:800px">Home</a></li>
      <li><a href="/about" style="color:white">About</a></li>
      <li><a href="/contact" style="color:white" >Contact</a></li>
      <li><a class=" btn btn-danger"  href="logout" style="color:white" >Logout</a></li>
      
    </ul>
   
  </div>
</nav>

<table id="tab" >
<h1><center>Jobs Available</center></h1>
<tr style="height:60px">
<th style="background-color:slateblue;color:white"><center>Job_id</center> </th>
<th style="background-color:slateblue;color:white"><center>HR_Name</center> </th>
<th style="background-color:slateblue;color:white"><center>Company Name</center> </th>
<th style="background-color:slateblue;color:white"><center>Job profile</center></th>
<th style="background-color:slateblue;color:white"><center>Location</center></th>
<th style="background-color:slateblue;color:white"><center>Job Type</center></th>
<th style="background-color:slateblue;color:white"><center>Skills required</center></th>
<th style="background-color:slateblue;color:white"><center>Experience required</center></th>
<th style="background-color:slateblue;color:white"><center>Action</center></th>
</tr>


<c:forEach items="${job}" var="j">
<tr>
<td><center> ${j.id}</center></td>
<td><center>${j.hrName}</center></td>
<td><center>${j.companyName}</center></td>
<td><center>${j.jobprofile}</center></td>
<td><center>${j.location}</center></td>
<td><center>${j.jobType}</center></td>
<td><center>${j.skillsRequired}</center></td>
<td><center>${j.experience}</center></td>
<td scope="row"><a href="applied?jobid=${j.id}&&userid=${userid}"class="btn btn-primary">apply</a></td>
</tr>
</c:forEach>

</table>



<table id="tab" >
<h1><center>Jobs Applied</center></h1>
<tr style="height:60px">
<th style="background-color:slateblue;color:white"><center>Job_id</center> </th>
<th style="background-color:slateblue;color:white"><center>HR_Name</center> </th>
<th style="background-color:slateblue;color:white"><center>Company Name</center> </th>
<th style="background-color:slateblue;color:white"><center>Job profile</center></th>
<th style="background-color:slateblue;color:white"><center>Location</center></th>
<th style="background-color:slateblue;color:white"><center>Job Type</center></th>
<th style="background-color:slateblue;color:white"><center>Skills required</center></th>
<th style="background-color:slateblue;color:white"><center>Experience required</center></th>

</tr>


<c:forEach items="${appliedjobs}" var="j">
<tr>
<td><center> ${j.id}</center></td>
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