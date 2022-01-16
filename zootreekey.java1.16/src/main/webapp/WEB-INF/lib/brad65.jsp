<%@ page import="utils.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/eeit36"
	user="root"
	password="root"
/>


<%@	public static String encPasswd(String passwd) {
		String hsPasswd = BCrypt.hashpw(passwd, BCrypt.gensalt() );
		return hsPasswd;
	} %>
<c:if test="${!empty param.account }">
	<sql:update var="count">
		INSERT INTO member (account,passwd,realname) VALUES (?,?,?)
		<sql:param>${param.account }</sql:param>
		<sql:param>${BradUtils.encPasswd(param.passwd) }</sql:param>
		<sql:param>${param.realname }</sql:param>
	</sql:update>
	<c:redirect url="brad64.jsp"></c:redirect>
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Brad Big Company</title>
</head>
<body>

<h1>新增資料</h1>
<hr />
<form>
	Account: <input type="text" name="account" /><br />
	Password: <input type="password" name="passwd" /><br />
	Realname: <input type="text" name="realname" /><br />
	<input type="submit" value="新增" />
</form>

</body>
</html>