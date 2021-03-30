<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Calculator</title>
<style>

	#error {
		color: red;
		border: 1px solid red;
	}
	
</style>
<script>
	function validateForm() {
		var errorNode = document.getElementById('error');	
		var firstNumberRef = document.forms['calFrom'].elements['firstNumber'];
		var secondNumberRef = document.forms['calFrom'].elements['secondNumber'];
		if(firstNumberRef.value == '') {
			errorNode.innerHTML = firstNumberRef.name.toUpperCase()+" can not be left blank";
			firstNumberRef.focus();
			return false;
		}
		if(secondNumberRef.value == '') {
			errorNode.innerHTML = secondNumberRef.name.toUpperCase()+" can not be left blank";
			secondNumberRef.focus();
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<header>
		<h2>Simple Math Calculator</h2>
		<div id='error'>
			${MESSAGE}
		</div>
		<br/>
	</header>
	<section>
		<form name="calFrom" action="calcSubmit.htm" method="GET"
			onsubmit="return validateForm();">
			Enter Number : <input type="number" name="firstNumber" value="20" /><br />
			Enter Number : <input type="number" name="secondNumber" value="10" /><br />
			<input type="submit" value="SUM" /><br />
		</form>
	</section>
</body>
</html>