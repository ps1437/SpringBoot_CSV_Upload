<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/images/bulk.png" type='image/png'>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

<link href="css/style.css" rel="stylesheet">
</head>
<script>
	function noBack() {
		window.history.forward();
	}
</script>

<style>
.txtColor {
	font-size: 40px;
	color: white;
}
</style>

<body onload="noBack();">
	<%@ include file="bulkHeader.jsp"%>
	<div class="container card">
		<h2 class="text-center">Log in</h2>
		<div style="align: center">

			<form action="/bulk/login" method="POST">
				<div class="form-group">
					<input type="email" placeHolder="Please Enter Email Id"
						class="form-control login-cust " id="email" name="email">
				</div>


				<div class="form-group">
					<input type="submit" class="btn btn-primary btn-block login-cust"
						value='Log In' onclick="return validateEmail()">

				</div>
			</form>
		</div>
	</div>
	<div class="footer navbar-fixed-bottom">&copy; Piramal
		Enterprises Ltd.</div>

</body>
<script src="${pageContext.request.contextPath}/scripts/basic.js"></script>
</html>