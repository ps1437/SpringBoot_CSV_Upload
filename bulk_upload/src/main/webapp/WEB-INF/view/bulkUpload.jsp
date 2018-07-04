<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>Piramal Bulk Upload</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="/images/bulk.png" type='image/png'>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css">
</head>

<style>
.txtColor {
	font-size: 40px;
	color: white;
}

.menu {
	float: left;
	colro: green;
}

.scrollbar {
	max-height: 400px;
	border: 1px solid red;
	overflow: auto;
}
</style>

<script>
	function noBack() {
		window.history.forward();
	}

	var selectFile = false;
	function showChild() {

		var type = document.getElementById('templateId').value;
		
		if (type == 'C') {
			document.getElementById('cand-req').style.display = '';

		} else {
			document.getElementById('cand-req').style.display = 'none';
		}

	}

	function validateType() {

		var value = document.getElementById("templateId").value;
		
		if(value == 'C')
		{
			value = document.getElementById("subTemplateId").value;
		}

		
		if (value=='none') {
			selectFile = false;
			alert("Please select a file type to upload")
			return false;
		}
		selectFile = true;
		return true;
	}

	function fileCheck() {

		if (selectFile) {
			return true;
		} else
			alert("Please select a file to upload")
		return false;
	}
</script>
<body onload="noBack();">

	<%@ include file="bulkHeader.jsp"%>
	<div class="container">
		<div class="row">
			<form method="POST" action="/bulk/upload"
				enctype="multipart/form-data">
				<div class="col-sm-3">
					<br> <br>

					<div class="form-group">

						<label for="sel1">Select Template:</label> <select id="templateId"
							name="templateId" class="form-control selectpicker"
							data-width="auto" onchange="showChild();">
							<option value="none">--Select--</option>
							<option value="R">Requisition</option>
							<option value="C">Candidate</option>
							<option value="O">Offers</option>
							<option value="RC">Requistion Candidate</option>
							<option value="S">SHL</option>
						</select>
					</div>



					<div class="form-group" id="cand-req" style="display: none">

						<label for="sel1">Select Candidate file type:</label> <select
							id="subTemplateId" name="subTemplateId"
							class="form-control selectpicker" data-width="auto">
							<option value="none">--Select--</option>
							<option value="CC">Candidate Creation</option>
							<option value="CB">Candidate Bypass</option>
							<option value="CEXP">Candidate Experience</option>
							<option value="CEDU">Candidate Education</option>
						</select>
					</div>



					<div class="text-center">


						<span class='label label-info' id="upload-file-info"></span> <label
							class="btn btn-default btn-file "> Browse..... <input
							type="file" style="display: none;" name="file" id="file"
							onchange="$('#upload-file-info').html(this.files[0].name)"
							onclick="return validateType();">

						</label> <br> <br> <label class="btn btn-default btn-file ">
							Upload <input type="submit" style="display: none;"
							onclick=" return fileCheck()">
						</label> <br> <br>
					</div>

					<c:if test="${fileUploaded}">
						<div class="alert alert-success" style="margin-top: 80px">
							<b>File uploaded sucessfully..!</b>
						</div>
					</c:if>

					<c:if test="${emptyFile}">
						<div class="alert alert-danger" style="margin-top: 80px">
							<b>Uploaded File is Empty........!</b>
						</div>
					</c:if>

				</div>


			</form>


			<div class="col-sm-6">

				<c:if test="${not empty fileStatus}">

					<center class='alert alert-info'>${fileStatus}</center>
				</c:if>
				<c:if test="${not empty errorList}">
					<div class="panel panel-default ">


						<div class="table-responsive panel-body  scrollbar">

							<table class="table table-bordered text-center">
								<thead>
									<tr>
										<th class='text-center'>Entered Value</th>
										<th class='text-center'>Reason</th>
									</tr>
								</thead>

								<tbody>
									<c:forEach var="error" items="${errorList}">

										<tr class="danger">
											<td>${error.errorId }</td>
											<td>${error.errorMsg }</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</c:if>


			</div>



			<div class="col-sm-3 text-center">
				<%@ include file="bulkTemplate.jsp"%>
			</div>
		</div>

		<input type="hidden" value='${emailId}' name="emailId">
		<div class="footer navbar-fixed-bottom">&copy; Piramal
			Enterprises Ltd.</div>
	</div>
</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/scripts/basic.js"></script>
</html>
