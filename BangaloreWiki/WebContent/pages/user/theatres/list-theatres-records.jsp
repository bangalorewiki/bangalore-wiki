<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="theatre" items="${theatreList}">
<div class="records">
	<p class="records-header">${theatre.name}</p>
	<table class="records-table">
		<tr><td class="records-cell-label">Name :</td><td class="records-cell-value">${theatre.name}</td>
			<td class="records-cell-label">Address :</td><td class="records-cell-value">${theatre.address}</td>
			<td class="records-cell-label">Pincode :</td><td class="records-cell-value">${theatre.pin_code}</td>
		<tr><td class="records-cell-label">Contact :</td><td class="records-cell-value">${theatre.contact_number}</td>
			<td class="records-cell-label">Contact Person:</td><td class="records-cell-value">${theatre.contact_person}</td>
			<td class="records-cell-label">Language :</td><td class="records-cell-value">${theatre.language}</td>
		<tr><td class="records-cell-label">Rating :</td><td class="records-cell-value">${theatre.rating}</td>
	</table>
</div>
</c:forEach>