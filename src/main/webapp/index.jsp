<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SPRING MVC</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body> 
<!--  bootstrap ten form örneği aldım kopyaladım-->
	<h1 class="h2 text-center m-4">RESULTS</h1>
	<div class="container"> <!-- form un tamamına css verebilmek için div -->
		<form action="submit"> <!--submit e basınca action gerçekleşiyor, sayılar, işlem olmak üzere sonucController a gidiyor-->
	<!--  buradaki submit ile sonucController daki submit aynu olmalı-->	
			<div class="mb-3">
				<label for="sayi1" class="form-label">1.Number</label>
			 	<input type="number" class="form-control" id="sayi1" name="sayi1" placeholder="enter first number">
			</div>
			<div class="mb-3">
				<label for="sayi2" class="form-label">2.Number</label>
			 	<input type="number" class="form-control" id="sayi2" name="sayi2" placeholder="enter second number">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>