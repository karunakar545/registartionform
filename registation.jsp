<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form  action="register"  method="post" ><tr>
	<td>first name :</td>
	<td><input type="text" name="first"></td>
	</tr><br>
	<tr>
	<td>last name :</td>
	<td><input type="text"  name="last"></td>
	</tr><br>
	<tr>
	<td>email :</td>
	<td><input type="text" name="email"></td>
	</tr><br>
	<tr>
	<td>password :</td>
	<td><input type="password" name="password"></td>
	</tr><br>
	<tr>
	<td>re-enter password :</td>
	<td><input type="password" name="repassword"></td>
	</tr><br>
	<tr>
	<td>phone :</td>
	<td><input type="text" name="phone"></td>
	</tr><br>
	<tr>
	<td>gender :</td>
	<td><input type="radio" name="male">male <td><input type="radio" name="female">female </td> </td>
	</tr><br>
	<tr>
	<td>address :</td>
	<td><input type="testarea" name="address"></td>
	</tr><br>
	<tr>
	<td>submit:</td>
	<td><input type="submit" ></td>
	</tr>
	</form>
</body>
</html>
