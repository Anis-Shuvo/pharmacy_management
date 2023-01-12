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
<title>Dashboard Template</title>

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
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
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
				<a class="nav-link px-3" href="/">Sign out</a>
			</div>
		</div>
	</header>

	<div class="container-fluid">
		<div class="row">
			<nav id="sidebarMenu"
				class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
				<div class="position-sticky pt-3">
					<ul class="nav flex-column">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="/Dash"> <span data-feather="home"></span>
								Dashboard
						</a></li>

						<li class="nav-item"><a class="nav-link" href="/mediform">
								<span data-feather="file"></span> Add Medicine
						</a></li>

						<li class="nav-item"><a class="nav-link" href="/allMedicine">
								<span data-feather="shopping-cart"></span> Medicine List
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/newCustomer"> <span
								data-feather="users"></span>Add Customers
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/allcustomer"> <span
								data-feather="users"></span>Customers List
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/pform"> <span
								data-feather="users"></span>Purchase Medicine
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/allpurchasef"> <span
								data-feather="users"></span>Show All Purchase
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/sform"> <span
								data-feather="users"></span>Sell Medicine
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/rform"> <span
								data-feather="users"></span>Return medicine
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/report1"> <span
								data-feather="bar-chart-2"></span>Daily Reports
						</a></li>
						<li class="nav-item"><a class="nav-link" href="/report2"> <span
								data-feather="bar-chart-2"></span>Weekly Reports
						</a></li>
						
						<li class="nav-item"><a class="nav-link" href="/report3"> <span
								data-feather="bar-chart-2"></span>Custom Reports
						</a></li>
						
					</ul>

					<h6
						class="sidebar-heading d-flex justify-content-between align-items-center px-3 mt-4 mb-1 text-muted">
						<span>Saved reports</span> <a class="link-secondary" href="#"
							aria-label="Add a new report"> <span
							data-feather="plus-circle"></span>
						</a>
					</h6>
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
					<h1 class="h2"> Medicine Details</h1>
					<div class="btn-toolbar mb-2 mb-md-0">
						
					</div>
				</div>




				<div class="table-responsive">
					<table class="table table-striped table-sm">
						<thead>
							<tr>
								<th scope="col">Medicine Id</th>
								<th scope="col">Name</th>
								<th scope="col">Generic</th>
								<th scope="col">Unit</th>
								<th scope="col">Category</th>
								<th scope="col">Type</th>
								<th scope="col">Supplier</th>
								<th scope="col">Price</th>
								<th scope="col">Supplier Price</th>
								<th scope="col">Vat(%)</th>
								<th scope="col">Stock</th>
								<th scope="col">Date of production</th>
								<th scope="col">Date Expired</th>
								<th scope="col">Action</th>

							</tr>
						</thead>
						<c:forEach var="t" items="${ml}">
							<tbody>

								<tr>
									<td>${t.mid}</td>
									<td>${t.mname}</td>
									<td>${t.mgeneric}</td>
									<td>${t.munit}</td>
									<td>${t.mcategory}</td>
									<td>${t.mtype}</td>
									<td>${t.supplier}</td>
									<td>${t.mprice}</td>
									<td>${t.sprice}</td>
									<td>${t.mvat}</td>
									<td>${t.mstock}</td>
									<td>${t.dop}</td>
									<td>${t.doe}</td>


									<td><form action="/medicine">
											<button type="submit" class="btn btn-primary"
												value="${t.mid}" name="mid">
												<i class="bi bi-pencil-square"></i>
											</button>
										</form>
										<form action="/deleteMedicine">
											<button type="submit" class="btn btn-danger" value="${t.mid}"
												name="mid">
												<i class="bi bi-archive-fill"></i>
											</button>
										</form></td>
								</tr>

							</tbody>
						</c:forEach>


					</table>


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



















