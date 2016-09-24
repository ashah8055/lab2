<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="todolistmain" method="post">
<table border="2">
<tr>
<td>Name
<td>Date
<td>
</tr>



<c:forEach items="${entry}"  var="data" >

<tr>
   <c:if test="${data.f eq true}">
<td><strike>${data.name}</strike></td>
<td><strike>${data.date}</strike></td>
<td> </td>
</c:if>

  <c:if test="${data.f eq false}">
<td>${data.name}</td>
<td>${data.date}</td>
<td ><a href="Crossed?id=${data.id}">X</a>
</c:if>


</tr>
</c:forEach>
<tr>
<td ><input type="text" name="txtname">
<td colspan="2"><input type="submit" value="Add">
</tr>
</table>

</form>
</body>
</html>