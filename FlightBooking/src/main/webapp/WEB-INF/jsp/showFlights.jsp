<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<title>Show Flights</title>
<!-- Comment -->
</head>
<body>
<table class="table table-striped">
	<thead>
		<tr>
			<th>Flight Id</th>
			<th>From City</th>
			<th>To City</th>
			<th>Start Time</th>
			<th>End Time</th>
			<th>Distance(In Kms)</th>
			<th>Fair</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="element" items="${flightlist}" varStatus="status"> 
		<tr>
			<td>${element.flightId}</td>
			<td>${element.fromCity}</td>
			<td>${element.toCity}</td>
			<td>${element.startTime}</td>
			<td>${element.endTime}</td>
			<td>${element.distanceInKm}</td>
			<td>${pricelist[status.index]} </td> 
		</tr>
	</c:forEach> 
	</tbody>
</table>

</body>
</html>