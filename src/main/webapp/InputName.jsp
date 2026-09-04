<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		%>
		<form action="InputNameServlet" method = "post">
			Name : <input type="text" name="name" value="${NameValue}"/><span style ="color: red">${Error} </span><br><br>
			Email : <input type="text" name="email" value="${EmailValue}"/><span style ="color: red">${PassErr}</span><br><br>
			Password : <input type="password" name="password"/><span style ="color: red"> ${EmailErr}</span><br><br>
			<input type="submit" value="submit"/>
		</form>
		
</body>
</html>