<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ログイン画面</title>
</head>

<body>
ログイン
	<form action="LoginAction">
		<textfield name="name"/>
		<password name="password"/>
		<submit value="ログイン"/>
	</form>
	
</body>
</html>