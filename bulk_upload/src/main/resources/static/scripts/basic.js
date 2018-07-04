var selectFile = false;



function emailId() {
	alert(document.getElementById('emailId').value);
}

/*function showSub() {

	val = document.getElementById('fileType').value;

	if (val == "R") {
		document.getElementById("sub-req").style.display = 'block';
		document.getElementById("cand-req").style.display = 'none';
	} else if (val == "C") {
		document.getElementById("sub-req").style.display = 'none';
		document.getElementById("cand-req").style.display = 'block';

	} else {
		document.getElementById("sub-req").style.display = 'none';
		document.getElementById("cand-req").style.display = 'none';
	}

}*/

function validateEmail() {
	var email = document.getElementById("email").value;
	if (email.length < 1) {
		alert("Please enter your email id");
		return false;
	} else {

		var expression = /\S+@\S+\.\S+/;
		var res = expression.test(email);
		if (!res) {
			alert("The Email Address is in an invalid format");
			return false;
		}
		if (email.indexOf("@piramal.com") == -1) {
			alert("Invalid Email Id");
			return false;
		}

	}
	return true;
}


