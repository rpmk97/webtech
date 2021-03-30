<!DOCTYPE html>
<html>
<head>
	<title>Login Form</title>
	<style>
	</style>
	<script>
		function validateForm() {
			return true;			
		}
	</script>
</head>
<body>		
	<table>
	<form action='india/population' method='POST' onsubmit='return validateForm();'>	
	<tbody>
		<tr>
			<td>Enter Username :</td>
			<td><input type=text value=ritesh name='user' /></td>
		</tr>
		<tr>
			<td>Enter Password :</td>
			<td><input type=password value=secret name='password' /></td>
		</tr>
		<tr>
			<td><input type=submit value=Login /></td>
		</tr>
	</tbody>
	</form>
	</table>
</body>
</html>
