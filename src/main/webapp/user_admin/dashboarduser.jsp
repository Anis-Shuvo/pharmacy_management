<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author"
	content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
<meta name="generator" content="Hugo 0.84.0">
<title>Medicine form</title>

<link rel="canonical"
	href="https://getbootstrap.com/docs/5.0/examples/dashboard/">



<!-- Bootstrap core CSS -->
<link href="/font/bootstrap.min.css" rel="stylesheet">

<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}
</style>


<!-- Custom styles for this template -->
<link href="/font/dashboard.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>


	<header
		class="navbar navbar-dark sticky-top bg-primary flex-md-nowrap p-0 shadow">
		<a class="navbar-brand col-md-3 col-lg-2 me-0 px-3" href="#">Medicare
			Pharma</a>
		<button class="navbar-toggler position-absolute d-md-none collapsed"
			type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu"
			aria-controls="sidebarMenu" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="navbar-nav">
			<div class="nav-item text-nowrap">
				<a class="nav-link px-3" href="#">Sign out</a>
			</div>
		</div>
	</header>

	<div class="container-fluid">
		<div class="row">
			<nav id="sidebarMenu"
				class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
				<div class="position-sticky pt-3">
					<ul class="nav flex-column">
						
						
						<li class="nav-item"><a class="nav-link" href="/allMedicine">
								<span data-feather="shopping-cart"></span> Medicine List
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/newCustomer"> <span
								data-feather="users"></span>Add Customers
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/allcustomer"> <span
								data-feather="users"></span>Customers List
						</a></li>
						
						<li class="nav-item"><a class="nav-link" href="/sform"> <span
								data-feather="users"></span>Sell Medicine
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/newReturn"> <span
								data-feather="users"></span>Return medicine
						</a></li>
						
						
					</ul>

				
					<!-- <ul class="nav flex-column mb-2">
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Current month
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Last quarter
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Social engagement
						</a></li>
						<li class="nav-item"><a class="nav-link" href="#"> <span
								data-feather="file-text"></span> Year-end sale
						</a></li>
					</ul>
					 -->
				</div>
			</nav>

			<main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
				<div
					class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
					<h1 class="h2">Dashboard</h1>
					<div class="btn-toolbar mb-2 mb-md-0">
						<div class="btn-group me-2">
							<button type="button" class="btn btn-sm btn-outline-secondary">Share</button>
							<button type="button" class="btn btn-sm btn-outline-secondary">Export</button>
							
						</div>
						<input type="date" value="">
					</div>
					
				</div>


			<div class="row">
				
				<div class="card text-white bg-primary m-3"
					style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title">Total Medicine Item</h5>
						<h1 class="card-text m-2"></h1>
					</div>
				</div>
				<div class="card text-white bg-secondary m-3"
					style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title"> Total Sell last Day</h5>
						<h1 class="card-text m-2"></h1>
					</div>
				</div>
				<div class="card text-white bg-success m-3"
					style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title"> Date Expired</h5>
						<h1 class="card-text m-2"></h1>
					</div>
				</div>
				<div class="card text-white bg-danger m-3"
					style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title"> Stock Out</h5>
						<h1 class="card-text m-2"></h1>
					</div>
				</div>
			</div>	
			<div class="row">
				<div class="card text-dark bg-warning m-3"
					style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title">Last Day sell</h5>
						<h1 class="card-text m-2"></h1>
					</div>
				</div>
				<div class="card text-dark bg-info m-3" style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title">Registered Customer</h5>
					<h1 class="card-text m-2"></h1>
					</div>
				</div>
				<div class="card text-dark bg-light m-3" style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title">Leave Request Rejected</h5>
						<h1 class="card-text m-2"></h1>
					</div>
				</div>
				<div class="card text-white bg-dark m-3" style="max-width: 18rem;">
					<div class="card-header"></div>
					<div class="card-body">
						<h5 class="card-title">Total Department</h5>
						<h1 class="card-text m-2"></h1>
					</div>
				</div>
			</div>

				

			</main>
		</div>
	</div>





	<script src="/font/bootstrap.bundle.min.js"></script>

	<script
		src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js"
		integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js"
		integrity="sha384-zNy6FEbO50N+Cg5wap8IKA4M/ZnLJgzc6w2NqACZaK0u0FXfOWRRJOnQtpZun8ha"
		crossorigin="anonymous"></script>
	<script src="dashboard.js"></script>
</body>
</html>
