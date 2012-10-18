<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to BangaloreWiki</title>
	<link type="text/css" href="css/bwiki-style-format2.css" rel="stylesheet" />
	<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<script src="script/jquery-1.7.min.js"></script>
</head>
<body>
	<script type="text/javascript">
		$(document).ready(function() {
			$("#menu ul li").mouseover(function() {
				$(this).addClass("onmenuover");
			});
			$("#menu ul li").mouseout(function() {
				$(this).removeClass("onmenuover");
			});
			$("#menu ul li").click(function() {
				$("#menu ul li").removeClass("onmenu");
				$(this).addClass("onmenu");
				$("#content-section").load("menu-item.jsp");
			});
		});
	</script>
	<tiles:insertAttribute name="header" />
	<div id="content1">
		<tiles:insertAttribute name="menu" />
		<div id="content-section">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
	<tiles:insertAttribute name="footer" />
</body>
</html>
