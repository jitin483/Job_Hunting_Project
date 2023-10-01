<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body style="background-color:gainsboro">
<!-- Header -->

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" style="color:white ; font-family:cursive"><strong>Job Hunting Portal</strong></p></a>
    </div>
    <ul class="nav navbar-nav" >
      <li class="active"><a href="homePage.jsp" style="color:white ; margin-left:800px">Home</a></li>
      <li><a href="about.jsp" style="color:white">About</a></li>
      <li><a href="contact.jsp" style="color:white" >Contact</a></li>
    </ul>
  </div>
</nav>
<div class="container" style="margin-left:350px ; margin-top:50px">
		<div class="row">

			<div class="col-md-6 offset-sm-4 pt-5">

				<div class="card ">
					<div class="card-header text-center bg-primary text-white">
						<span class="fa fa-3x fa-user-circle"></span> <br> 
						<p style="font-size:30px">Update HR</p>
					</div>
					<div class="card-body">
						<form action="updateform" method="post">
						
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">id</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${hr.id} "
									name="id">
							</div>
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Username</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"   value ="${hr.username} "
									name="username">
							</div>
						
						
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Password</label> <input type="password" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${hr.password}"
									name="password">
							</div>
						
						
								<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${hr.name}"
									name="name">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">COmpany</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${hr.companyname}"
									name="companyname">
							</div>
					
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Forpost</label>
								<input type="text" class="form-control" 
									id="exampleInputPassword1" name="forpost" value ="${hr.forpost}">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Experience</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="experience" value ="${hr.experience}">
							</div>
							
							
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Skills</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="skills" value ="${hr.skills}" >
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Mobile</label>
								<input type="mobile" class="form-control"
									id="exampleInputPassword1" name="mobile" value ="${hr.mobile}" >
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Email</label>
								<input type="email" class="form-control"
									id="exampleInputPassword1" name="email" value ="${hr.email}" >
							</div>
				
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Is Active</label>
								
									<div >
									<select class="form-control" id="exampleFormControlSelect1"
										name="isActive"   value ="${hr.isActive}">
										<option> ${hr.isActive}</option>
										<option>yes</option>
										<option>no</option>
										
									</select>
									
								</div>
							</div>
				
							
								<div class="form-group mt-2">
							<button type="submit" value="update" class="btn btn-primary">Update</button>
							</div>
							
						</form>
					</div>
				</div>
			</div>
		</div>
		

</body>
</html>