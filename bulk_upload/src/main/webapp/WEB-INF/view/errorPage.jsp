<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Piramal Bulk Upload</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/images/biometrics.png" type='image/png'>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css">
<style>
.txtColor {
	font-size: 40px;
	color: white;
}
</style>

<script>
	function noBack() {
		window.history.forward();

	}
</script>

<body onload="noBack()">
	<%@ include file="bulkHeader.jsp"%>
	<div class="container">
		<div class="jumbotron text-center">
			<h2>${ errorMessage}</h2>
			
			<strong> <br> <br> <br> <br> <br> <a
				href="/">Click here to go to Home</a></strong>

		</div>
	</div>

</body>
</html>