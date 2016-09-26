<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <style type="text/css">
            #container {
                width: 800px;
                border: 1px solid red;
                overflow: hidden;
                margin: 0px auto 0px auto;
                padding: 0px 0px 0px 0px
            }
            #tbl_1 {
                margin-left: 20px;
            }
            #tbl_2 {
                margin-top: 25px ;
                margin-right: 20px;
            }
        </style>

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