<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<script src="script/jquery.easing.1.3.js"></script>
<script type="text/javascript">
<!--
	$(function(){
		$(".records div").hide();
		$(".records").mouseenter(function(e){
			$(this).find("div").show("slide", {direction: "up", duration: 700, easing: "easeOutQuad"});
		});
		$(".records").mouseleave(function(e){
			$(this).find("div").hide("slide", {direction: "up", duration: 500}, "easeOutBounce");
		});
	});
//-->
</script>
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
			<td class="records-cell-label">Rating :</td><td class="records-cell-value">${site.rating}</td>
	</table>
	<div class="record-side-option">
		<img id="sm-fb" class="sm-fb" alt="Post on Facebook" src="../images/facebook-logo-square.png">
		<img id="sm-fv" class="sm-fb" alt="Add to favorites" src="../images/diglog-square.png">
		<img id="sm-gm" class="sm-fb" alt="Send to a friend" src="../images/gmail-logo-square2.png">
		<img id="sm-tw" class="sm-fb" alt="Tweet" src="../images/twitter-logo-square.png">
	</div>
</div>
</c:forEach>