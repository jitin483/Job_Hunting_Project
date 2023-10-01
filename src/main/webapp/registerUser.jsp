<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<style>
body{

}
.form-label
{
color:Black;
}
.coloring
{
color:Black;}
</style>
</head>
<body id="back">
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
    </ul>
  </div>
</nav>

<div class="container" style="margin-left:350px ; margin-top:50px">
		<div class="row">

			<div class="col-md-6 offset-sm-4 pt-5">

				<div class="card ">
					<div class="card-header text-center bg-primary text-white">
						<span class="fa fa-3x fa-user-circle"></span> <br> 
						<p style="font-size:30px">User Register Here</p>
					</div>
					<div class="card-body">
						<form action="register" method="post">
						
						
								<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="name">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Username</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="username">
							</div>
					
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Email</label>
								<input type="Email" class="form-control"
									id="exampleInputPassword1" name="email">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input type="password" class="form-control"
									id="exampleInputPassword1" name="password">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Address</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="address">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Mobile Number</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="mobile">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Education</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="education">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">School</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="school">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">College</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="college">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Skills</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="skills">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Experience</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="experience">
							</div>
							
							
								<div class="form-group mt-2">
							<button type="submit" class="btn btn-primary">Submit</button>
							</div>
								<div class="form-group mt-2">
						 <label class="form-check-label" for="exampleCheck1" id="coloring">Existing User?</label> <a href="login">Login Here</a>
								</div>
						</form>
					</div>
				</div>
			</div>
		</div>
		
	



 </body>
	</html>