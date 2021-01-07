<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
<style>
	.container{
		width:300px;
		border: 1px solid black;
		padding: 10px;
		margin: auto;
	}
</style>
</head>
<body>
	<div class=container>
    <form action="input.person" class=box>
        Name : <input type=text name=name required><br><br>
        Message : <textarea name=message required></textarea><br><br>
        <input type=submit>
    </form>
</div>
</body>
</html>