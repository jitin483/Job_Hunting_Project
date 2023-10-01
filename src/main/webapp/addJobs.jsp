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

</style>
</head>
<body style="background-image: url('https://images.unsplash.com/photo-1516387938699-a93567ec168e?ixlib=rb-1.2.1&amp;ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8bGFwdG9wfGVufDB8fDB8fA%3D%3D&amp;w=1000&amp;q=80'); background-attachment: fixed; background-repeat: no-repeat; background-size: cover">
>
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
						<p style="font-size:30px">Add New Jobs</p>
					</div>
					<div class="card-body">
						<form action="jobs" method="post">
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">HR Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="hrName">
							</div>
						
						
						<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Company Name</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="companyName">
							</div>
						
						
								<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Job Profile</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="jobprofile">
							</div>
							<div class="form-group">
								<label for="exampleInputEmail1" class="form-label">Location</label> <input type="text" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									name="location">
							</div>
					
								<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Job Type</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="jobType">
							</div>
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Skills required</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="skillsRequired">
							</div>
							
							
							
							<div class="form-group">
								<label for="exampleInputPassword1" class="form-label">Experience required</label>
								<input type="text" class="form-control"
									id="exampleInputPassword1" name="experience">
							</div>
							
							<div class="form-group">
                                <label for="exampleInputPassword1" class="form-label">Job Description</label>
                                <input type="text" class="form-control"
                                    id="exampleInputPassword1" name="jobDescription">
                            </div>
							
							
								<div class="form-group mt-2">
							<button type="submit" class="btn btn-primary">Add Job</button>
							</div>
							
						</form>
					</div>
				</div>
			</div>
		</div>
		

</body>
</html>