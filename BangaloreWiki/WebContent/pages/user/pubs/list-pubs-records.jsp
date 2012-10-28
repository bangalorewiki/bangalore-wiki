<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="Pub" items="${pubList}">
<div class="records">
	<p class="records-header">${Pub.name}</p>
	<table class="records-table"><tr>
		<td class="records-cell-label">Name :</td><td class="records-cell-value">${Pub.name}</td>
		<td class="records-cell-label">Address :</td><td class="records-cell-value">${Pub.address}</td>
		<tr><td class="records-cell-label">Contact :</td><td class="records-cell-value">${Pub.contact}</td>
		<td class="records-cell-label">Capacity :</td><td class="records-cell-value">${Pub.capacity}</td>
		<tr><td class="records-cell-label">Rating :</td><td class="records-cell-value">${Pub.rating}</td>
	</table>
</div>
</c:forEach>