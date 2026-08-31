<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Calculation</h1>
	<form action = "PatternServlet" method = "post">
		Enter the Symbol = <input type="text" name="symbol"/><br></br>
		Enter the rows = <input type="text" name="rows"/><br></br>
		Pattern List :=> <br></br>
		Left Triangle : <input type="radio" value="left" name="ptr"/>
		Right Triangle : <input type="radio" value="right" name="ptr"/>
		Triangle : <input type="radio" value="triangle" name="ptr"/>
		Inverted Triangle : <input type="radio" value="inverted" name="ptr"/>
		<input type="submit" value = "Perfome"/>
	</form>
</body>
</html>