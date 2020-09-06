<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Add Athlete Page</title>
</head>
<body>
	<h2>
		<center>Enter Details</center>
	</h2>
	<table border="1">
		<form action="addUser" onsubmit="return validation()">
			<tr>
				<td>Athlete Name</td>
				<td><input type="text" name="athleteName" id="user" />
				<span style="color:red" id="username"></span>
				</td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><label for="Male">Male</label><input type="radio"
					name="gender" value="Male">
					<label for="Female">Female</label><input type="radio" 
					name="gender" value="Female">
					<span style="color:red" id="gendername"></span>
				</td>
					
			</tr>
			<tr>
				<td>Category</td>
				<td><select id="selectbox" name="category">
      					<option value="Running">Running</option>
      					<option value="High Jump">High Jump</option>
      					<option value="Hurdles">Hurdles</option>
      					<option value="Relay">Relay</option>
      					<option value="Javelin Throw">Javelin Throw</option>
      					<option value="Shotput">Shotput</option>
    				</select></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" id="email" name="emailId" />
				<span style="color:red" id="emailname"></span>
				</td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td><input type="text" id="mobile" name="mobile" />
				<span style="color:red" id="mobilename"></span>
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit" value="submit">ADD</button>
					<button type="reset">CANCEL</button>
				</td>
				<td>
				<a href="index.jsp"><u>Home</u></a>
				</td>
			</tr>
		</form>

	</table>
	
	<script type="text/javascript">
	function validation() {
		var user = document.getElementById('user').value;
		var email = document.getElementById('email').value;
		var mobile = document.getElementById('mobile').value;
		var gender = document.getElementsByName('gender');
		var genValue = false;
		for(var i=0; i<gender.length;i++){
            if(gender[i].checked == true){
                genValue = true;    
            }
        }
		var regexp = /^[A-Z]/;
		
		if(user=="")
			{
				document.getElementById('username').innerHTML="Please fill Name field";
				return false;
			}
		if(user.length>40)
			{
				document.getElementById('username').innerHTML="Please fill shorter name";
				return false;
			}
		
		if(!regexp.test(user))
		    {
		    	document.getElementById('username').innerHTML="Name should start with capital";
				return false;
		    }
		if(!isNaN(user))
			{
				document.getElementById('mobilename').innerHTML="Enter characters only";
				return false;
			}
		if(!genValue){
				document.getElementById('gendername').innerHTML="Please select gender";
            	return false;
     	    }
		if(email=="")
			{
				document.getElementById('emailname').innerHTML="Please fill email id";
				return false;
			}
		if(email.indexOf('@')<=0)
			{
				document.getElementById('emailname').innerHTML="** @ invalid position";		
				return false;
			}
		if((email.charAt(email.length-4)!='.')&&(email.charAt(email.length-3)!='.'))
			{
				document.getElementById('emailname').innerHTML="** . invalid position";
				return false;
			}
		if(mobile=="")
			{
				document.getElementById('mobilename').innerHTML="Please fill mobile number";
				return false;
			}
		if(mobile.length>10)
			{
				document.getElementById('mobilename').innerHTML="Enter 10 digits only";
				return false;
			}
		if(mobile.length<10)
			{
				document.getElementById('mobilename').innerHTML="Enter a valid number";
				return false;
			}
		if(isNaN(mobile))
			{
				document.getElementById('mobilename').innerHTML="Enter digits only";
				return false;
			}
		
	}
	
	</script>
</body>
</html>