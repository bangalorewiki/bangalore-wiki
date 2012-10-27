<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="FastFood" items="${fastFoodList}">
<div class="records">
	<p class="records-header">${FastFood.name}</p>
	<table class="records-table"><tr>
		<td class="records-cell-label">Name :</td><td class="records-cell-value">${FastFood.name}</td>
		<td class="records-cell-label">Address :</td><td class="records-cell-value">${FastFood.address}</td>
		<tr><td class="records-cell-label">Contact :</td><td class="records-cell-value">${FastFood.contact}</td>
		<td class="records-cell-label">Pincode :</td><td class="records-cell-value">${FastFood.pincode}</td>
		<td class="records-cell-label">Rating :</td><td class="records-cell-value">${FastFood.rating}</td>
		<tr><td class="records-cell-label">Capacity :</td><td class="records-cell-value">${FastFood.footfalls}</td>
		<td class="records-cell-label">Contact Person :</td><td class="records-cell-value">${FastFood.contactPerson}</td>
</table>
</div>
</c:forEach>