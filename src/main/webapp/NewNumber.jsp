<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Calculation</h1>
	<form action = "InputServlet" method = "post">
		No1 : <input type="number" name = "no1"/><br><br>
		No2 : <input type="number" name = "no2"/><br><br>
		Add : <input type="radio" value="add" name="opr">
		Sub: <input type="radio" value="sub" name="opr">
		Mul : <input type="radio" value="mul" name="opr">
		Div : <input type="radio" value="div" name="opr">
		
		<input type="submit" value = "Perfome"/>
	</form>
</body>
</html>