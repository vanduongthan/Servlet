<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FormJsp</title>
<link rel="stylesheet" href="css/styleForm.css">
<script type="text/javascript" src="js/script.js"></script>
</head>
<body>
<div style="border: 1px; width: 600px; height: 600px; margin: auto">
		<div>
			<fieldset >
				<legend>Form dang ki hoc</legend>
				<form action="/databaseJSP.jsp" method="get"
					onsubmit="return !! (checkName()&checkNumber());">

					<div class="image">
						<input type="file" id="uploadImage" name="file" onchange="PreviewImage() " required /><br>
						Your image<br>
						<img id="uploadPreview">
					</div>
					<div>
						First Name:<br> <input class="name" id="firstname" type="text" name="firstname" required/><br>
						Last Name:<br> <input class="name" id="lastname"  type="text" name="last_name" required/><br>
						Phone number:<br>
						<input class="number" id="number1" type="text"name="number1" size="4" maxlength="4" required />
						<input class="number" id="number2" type="text"name="number2" size="3" maxlength="3" required />
						<input class="number" id="number3" type="text"name="number3" size="3" maxlength="3" required /><br>
						<input type="radio" name="gender" required> Male<br>
						<input type="radio" name="gender" required>Female<br>
						<textarea id="textarea" rows="10" cols="50" placeholder="Description"></textarea><br>
						<input type="checkbox" name="bike">By Bike<br>
						<input type="checkbox" name="car">By Car<br>
						<div class="select">
							<select class="select" name="meter">
								<option value="Meter" selected>Meter</option>
								<option value="Meter2">Meter2</option>
							</select>
						</div>
						<br> <input id= "submit" type="submit" value="Submit">
					</div>

				</form>
			</fieldset>
		</div>
	</div>
</body>
</html>