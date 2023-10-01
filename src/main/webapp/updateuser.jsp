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
						<p style="font-size:30px">Update User</p>
					</div>
					<div class="card-body">
						<form action="updateform1" method="post">
						
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">id</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${user.id} "
									name="id">
							</div>
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${user.name} "
									name="name">
							</div>
						
						
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Username</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${user.username}"
									name="username">
							</div>
						
						
								<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Email</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${user.email}"
									name="email">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Password</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp" value ="${user.password}"
									name="password">
							</div>
					
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Address</label>
								<input type="text" class="form-control" 
									id="exampleInputPassword1" name="address" value ="${user.address}">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Mobile</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="mobile" value ="${user.mobile}">
							</div>
							
							
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Education</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="education" value ="${user.education}" >
							</div>
							
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">School</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="school" value ="${user.school}" >
							</div>
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">College</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="college" value ="${user.experience}" >
							</div>
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Skills</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="skills" value ="${user.skills}" >
							</div>
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Experience </label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="experience" value ="${user.experience}" >
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