<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<c:forEach var="site" items="${siteList}">
<div class="records">
	<p class="records-header">${site.name}</p>
	<table class="records-table">
		<tr><td class="records-cell-label">Road :</td><td class="records-cell-value">${site.road}</td>
			<td class="records-cell-label">Place Type :</td><td class="records-cell-value">${site.type}</td>
			<td class="records-cell-label">Food :</td><td class="records-cell-value">${site.food}</td>
		<tr><td class="records-cell-label">Distance :</td><td class="records-cell-value">${site.dist}</td>
			<td class="records-cell-label">Lodge :</td><td class="records-cell-value">${site.lodge}</td>
			<td class="records-cell-label">Direction :</td><td class="records-cell-value">${site.direction}</td>
		<tr><td class="records-cell-label">Petrol :</td><td class="records-cell-value">${site.petrol}</td>
			<td class="records-cell-label">Remarks :</td><td class="records-cell-value">${site.remarks}</td>
			<td class="records-cell-label">Period From :</td><td class="records-cell-value">${site.from_period}</td>
		<tr><td class="records-cell-label">Period To :</td><td class="records-cell-value">${site.to_period}</td>
			<td class="records-cell-label">Days Required :</td><td class="records-cell-value">${site.days_reqd}</td>
	</table>
</div>
</c:forEach>