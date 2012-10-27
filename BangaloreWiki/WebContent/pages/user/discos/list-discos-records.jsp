<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="Disco" items="${discosList}">
<div class="records">
	<p class="records-header">${Disco.name}</p>
	<table class="records-table"><tr>
		<td class="records-cell-label">S.No :</td><td class="records-cell-value">${Disco.no}</td>
		<td class="records-cell-label">Name :</td><td class="records-cell-value">${Disco.name}</td>
		<tr><td class="records-cell-label">Contact Person :</td><td class="records-cell-value">${Disco.contact_person}</td>
		<td class="records-cell-label">Address :</td><td class="records-cell-value">${Disco.address}</td>
		<td class="records-cell-label">Contact :</td><td class="records-cell-value">${Disco.phone_no}</td>
		<tr><td class="records-cell-label">Capacity :</td><td class="records-cell-value">${Disco.capacity}</td>
		<td class="records-cell-label">Rating :</td><td class="records-cell-value">${Disco.rating}</td>
	</table>
</div>
</c:forEach>