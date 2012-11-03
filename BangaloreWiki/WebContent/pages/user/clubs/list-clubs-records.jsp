<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="Club" items="${clubList}">
<div class="records">
	<p class="records-header">${Club.name}</p>
	<table class="records-table"><tr>
		<td class="records-cell-label">Name :</td><td class="records-cell-value">${Club.name}</td>
		<td class="records-cell-label">Address :</td><td class="records-cell-value">${Club.address}</td>
		<tr><td class="records-cell-label">Pincode :</td><td class="records-cell-value">${Club.pinCode}</td>
		<td class="records-cell-label">Contact :</td><td class="records-cell-value">${Club.phoneNo}</td>
		<tr><td class="records-cell-label">Contact Person :</td><td class="records-cell-value">${Club.contactPerson}</td>
		<td class="records-cell-label">Capacity :</td><td class="records-cell-value">${Club.members}</td>
		<tr><td class="records-cell-label">Rating :</td><td class="records-cell-value">${Club.grade}</td>
	</table>
</div>
</c:forEach>