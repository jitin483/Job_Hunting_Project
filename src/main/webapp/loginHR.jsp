<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Login Page</title>
   
<style>
    body{
        background-image:url("https://images.unsplash.com/photo-1527689368864-3a821dbccc34?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80g");
    };
</style>
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
</head>
<body>
    <!--NavBar-->
    <nav class="navbar navbar-expand-lg navbar-light bg-info">
        <a class="navbar-brand" href="/">JOB PORTAL</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Link</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-expanded="false">
                register
              </a>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="/">Manager-Register</a>
                 <a class="dropdown-item" href="/">User-Register</a>
            
                
            </li>
            
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
      </nav>




      <!-- For Login  System Page-->
      <div class="container" style="height:800px; margin-top:100px;">
      <h5 style="color:red">${register}</h5>
      <div class="row">
        <div class="col-7">

        </div>
        <div class="col-4 bg-transparent border border-primary" style=" height: 450px; margin-top: 50px; margin-bottom: 20px; margin-left: 20px; margin-right: 20px; border-radius: 3%;" >
         <div class="bg-success text-light" style="margin-top: 30px;"><h2 style="text-align: center;">Login To Job Portal</h2>
        </div>
 <h5 style="color:red">${msg1}</h5>
  
        <form  action="login"method="post" style="margin-top: 10px;" >

            <div class="form-group">
              <div class="form-group">
              <label for="formGroupExampleInput">Select Login Type</label>
              <select name="usertype" class="form-control" id="formGroupExampleInput2" onchange="if (this.value) window.location.href=this.value">
                <option selected>select</option>
                <option value="/" >Admin</option>
                <option value="/" selected>MANAGER</option>
                <option value="/">USER</option>
              </select>
            </div>
            <div class="form-group">
                <label for="formGroupExampleInput2">Username</label>
                <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="username" name="username">
              </div>
            
            <div class="form-group">
              <label for="formGroupExampleInput2">Password</label>
              <input type="password" class="form-control" id="formGroupExampleInput2" placeholder="password" name="password">
            </div>
            
            <button type="submit" class="btn btn-primary" >Login</button>
            <button type="reset" class="btn btn-danger">Cancel</button>

           

          </form>
         
        </div>
        <div class="col-1">

        </div>
      </div>
    </div>
</body>
</html>