<!DOCTYPE html>
<html lang="en">

<head>
<title>Job Hunting Portal - HR Registration Form</title>
<!-- HTML5 Shim and Respond.js IE10 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 10]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<!-- Meta -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description" content="#">
<meta name="keywords"
	content="Admin , Responsive, Landing, Bootstrap, App, Template, Mobile, iOS, Android, apple, creative app">
<meta name="author" content="#">
<!-- Favicon icon -->
<link rel="icon" href="..\files\assets\images\favicon.ico"
	type="image/x-icon">
<!-- Google font-->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,600,800"
	rel="stylesheet">
<!-- Required Fremwork -->
<link rel="stylesheet" type="text/css"
	href="..\files\bower_components\bootstrap\css\bootstrap.min.css">
<!-- themify-icons line icon -->
<link rel="stylesheet" type="text/css"
	href="..\files\assets\icon\themify-icons\themify-icons.css">
<!-- ico font -->
<link rel="stylesheet" type="text/css"
	href="..\files\assets\icon\icofont\css\icofont.css">
<!-- feather Awesome -->
<link rel="stylesheet" type="text/css"
	href="..\files\assets\icon\feather\css\feather.css">
<!-- Select 2 css -->
<link rel="stylesheet"
	href="..\files\bower_components\select2\css\select2.min.css">
<!-- Multi Select css -->
<link rel="stylesheet" type="text/css"
	href="..\files\bower_components\bootstrap-multiselect\css\bootstrap-multiselect.css">
<link rel="stylesheet" type="text/css"
	href="..\files\bower_components\multiselect\css\multi-select.css">
<!-- Style.css -->
<link rel="stylesheet" type="text/css"
	href="..\files\assets\css\style.css">
<link rel="stylesheet" type="text/css"
	href="..\files\assets\css\jquery.mCustomScrollbar.css">
</head>

<body>

	<!-- Pre-loader end -->

	<div id="pcoded" class="pcoded">
		<!-- Pre-loader start -->
		<div class="theme-loader">
			<div class="ball-scale">
				<div class='contain'>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
					<div class="ring">
						<div class="frame"></div>
					</div>
				</div>
			</div>
		</div>
		<!-- Pre-loader end -->
		<div id="pcoded" class="pcoded">
			<div class="pcoded-overlay-box"></div>
			<div class="pcoded-container navbar-wrapper">

				<%@include file="topBar.jsp"%>


				<!-- Sidebar inner chat end-->
				<div class="pcoded-main-container">
					<div class="pcoded-wrapper">
						<%@include file="sideNav.jsp"%>
						<div class="pcoded-content">
							<div class="pcoded-inner-content">
								<!-- Main-body start -->
								<div class="main-body">
									<div class="page-wrapper">
										<!-- Page-header start -->
										<div class="page-header">
											<div class="row align-items-end">
												<div class="col-lg-8">
													<div class="page-header-title">
														<div class="d-inline">
															<h4>Update Hr</h4>

														</div>
													</div>
												</div>
												<div class="col-lg-4">
													<div class="page-header-breadcrumb"></div>
												</div>
											</div>
										</div>
										<!-- Page-header end -->

										<!-- Page body start -->
										<div class="page-body">
											<div class="row">
												<div class="col-sm-12">
													<!-- Default select start -->
													<div class="card">

														<div class="card-block">
															<form action="updateform" method="post">
																<div class="row">
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">id</h4>
																		<input name="id" type="text" placeholder="UserName"
																			value="${hr.id} " class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">Username</h4>
																		<input name="username" type="text"
																			placeholder="Username" value="${hr.username} "
																			class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">Password</h4>
																		<input name="password" type="password"
																			placeholder="Password" value="${hr.password}"
																			class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">Name</h4>
																		<input name="name" type="text" placeholder="Name"
																			value="${hr.name}" class="form-control">
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">COmpany</h4>
																		<input name="companyname" type="text"
																			placeholder="Companyname" value="${hr.companyname}"
																			class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">Forpost</h4>
																		<input name="forpost" type="text"
																			placeholder="Forpost" value="${hr.forpost}"
																			class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">Experience</h4>
																		<input name="experience" type="text"
																			placeholder="experience" value="${hr.experience}"
																			class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">skills</h4>
																		<input name="skills" type="text" placeholder="skills"
																			value="${hr.skills}" class="form-control">
																	</div>
																</div>
																<div class="row">
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">Mobile</h4>
																		<input name="mobile" type="mobile"
																			placeholder="Mobile" value="${hr.mobile}"
																			class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">Email</h4>
																		<input name="email" type="email"
																			placeholder="hrStatus" value="${hr.email}"
																			class="form-control">
																	</div>
																	<div class="col-sm-12 col-xl-3 m-b-30">
																		<h4 class="sub-title">IsActive</h4>
																		<div>
																			<select class="form-control"
																				id="exampleFormControlSelect1" name="isActive"
																				value="${hr.isActive}">
																				<option>${hr.isActive}</option>
																				<option>yes</option>
																				<option>no</option>

																			</select>

																		</div>

																	</div></div>
																	<button class="btn btn-success">Update</button>
															</form>
														</div>
													</div>


												</div>
											</div>
										</div>
										<!-- Page body end -->
									</div>
								</div>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>


		<!-- Warning Section Starts -->
		<!-- Older IE warning message -->
		<!--[if lt IE 10]>
<div class="ie-warning">
    <h1>Warning!!</h1>
    <p>You are using an outdated version of Internet Explorer, please upgrade <br/>to any of the following web browsers
        to access this website.</p>
    <div class="iew-container">
        <ul class="iew-download">
            <li>
                <a href="http://www.google.com/chrome/">
                    <img src="../files/assets/images/browser/chrome.png" alt="Chrome">
                    <div>Chrome</div>
                </a>
            </li>
            <li>
                <a href="https://www.mozilla.org/en-US/firefox/new/">
                    <img src="../files/assets/images/browser/firefox.png" alt="Firefox">
                    <div>Firefox</div>
                </a>
            </li>
            <li>   
                <a href="http://www.opera.com">
                    <img src="../files/assets/images/browser/opera.png" alt="Opera">
                    <div>Opera</div>
                </a>
            </li>
            <li>
                <a href="https://www.apple.com/safari/">
                    <img src="../files/assets/images/browser/safari.png" alt="Safari">
                    <div>Safari</div>
                </a>
            </li>
            <li>
                <a href="http://windows.microsoft.com/en-us/internet-explorer/download-ie">
                    <img src="../files/assets/images/browser/ie.png" alt="">
                    <div>IE (9 & above)</div>
                </a>
            </li>
        </ul>
    </div>
    <p>Sorry for the inconvenience!</p>
</div>
<![endif]-->
		<!-- Warning Section Ends -->
		<!-- Required Jquery -->
		<script type="text/javascript"
			src="..\files\bower_components\jquery\js\jquery.min.js"></script>
		<script type="text/javascript"
			src="..\files\bower_components\jquery-ui\js\jquery-ui.min.js"></script>
		<script type="text/javascript"
			src="..\files\bower_components\popper.js\js\popper.min.js"></script>
		<script type="text/javascript"
			src="..\files\bower_components\bootstrap\js\bootstrap.min.js"></script>
		<!-- jquery slimscroll js -->
		<script type="text/javascript"
			src="..\files\bower_components\jquery-slimscroll\js\jquery.slimscroll.js"></script>
		<!-- modernizr js -->
		<script type="text/javascript"
			src="..\files\bower_components\modernizr\js\modernizr.js"></script>
		<script type="text/javascript"
			src="..\files\bower_components\modernizr\js\css-scrollbars.js"></script>


		<!-- i18next.min.js -->
		<script type="text/javascript"
			src="..\files\bower_components\i18next\js\i18next.min.js"></script>
		<script type="text/javascript"
			src="..\files\bower_components\i18next-xhr-backend\js\i18nextXHRBackend.min.js"></script>
		<script type="text/javascript"
			src="..\files\bower_components\i18next-browser-languagedetector\js\i18nextBrowserLanguageDetector.min.js"></script>
		<script type="text/javascript"
			src="..\files\bower_components\jquery-i18next\js\jquery-i18next.min.js"></script>
		<!-- Select 2 js -->
		<script type="text/javascript"
			src="..\files\bower_components\select2\js\select2.full.min.js"></script>
		<!-- Multiselect js -->
		<script type="text/javascript"
			src="..\files\bower_components\bootstrap-multiselect\js\bootstrap-multiselect.js">
			
		</script>
		<script type="text/javascript"
			src="..\files\bower_components\multiselect\js\jquery.multi-select.js"></script>
		<script type="text/javascript"
			src="..\files\assets\js\jquery.quicksearch.js"></script>
		<!-- Custom js -->
		<script type="text/javascript"
			src="..\files\assets\pages\advance-elements\select2-custom.js"></script>
		<script src="..\files\assets\js\pcoded.min.js"></script>
		<script src="..\files\assets\js\vartical-layout.min.js"></script>
		<script src="..\files\assets\js\jquery.mCustomScrollbar.concat.min.js"></script>
		<script type="text/javascript" src="..\files\assets\js\script.js"></script>
		<!-- Global site tag (gtag.js) - Google Analytics -->
		<script async=""
			src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
		<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>
	</div>
</body>

</html>