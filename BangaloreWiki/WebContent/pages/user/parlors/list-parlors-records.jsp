<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:forEach var="parlor" items="${parlorList}">
<div class="records">
	<p class="records-header">${parlor.name}</p>
	<table class="records-table">
		<tr><td class="records-cell-label">Name :</td><td class="records-cell-value">${parlor.name}</td>
			<td class="records-cell-label">Address :</td><td class="records-cell-value">${parlor.address}</td>
			<td class="records-cell-label">Email :</td><td class="records-cell-value">${parlor.email}</td>
		<tr><td class="records-cell-label">Contact :</td><td class="records-cell-value">${parlor.contact}</td>
			<td class="records-cell-label">Footfall :</td><td class="records-cell-value">${parlor.foot_falls}</td>
			<td class="records-cell-label">Remarks :</td><td class="records-cell-value">${parlor.remarks}</td>
		<tr><td class="records-cell-label">Rating :</td><td class="records-cell-value">${parlor.rating}</td>
	</table>
</div>
</c:forEach>