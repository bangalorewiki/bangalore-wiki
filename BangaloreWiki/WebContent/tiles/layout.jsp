<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to BangaloreWiki</title>
	<link type="text/css" href="css/bwiki-style-format2.css" rel="stylesheet" />
	<link type="text/css" href="css/custom-theme/jquery-ui-1.9.0.custom.css" rel="stylesheet" />
	<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	<script src="script/jquery-1.7.min.js"></script>
    <script src="script/jquery-ui-1.9.0.custom.min.js"></script>
	<script src="script/jquery.easing.1.3.js"></script>
	<link type="text/css" href="css/custom-theme/jquery-ui-1.9.0.custom.css" rel="stylesheet" />
    
</head>
<body>
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
