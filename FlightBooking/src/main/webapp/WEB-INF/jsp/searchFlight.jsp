<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Flights</title>
</head>
<body>
<%-- <h2>${command}</h2> --%>

<form:form modelAttribute="flightSearch" action="flights" method="post">
<label>Source</label>
<form:input path="fromCity"/>
<label>Destination</label>
<form:input path="toCity"/>
<input type="submit" value="add">
</form:form>

<%-- <h2>${command}</h2> --%>
</body>
</html>