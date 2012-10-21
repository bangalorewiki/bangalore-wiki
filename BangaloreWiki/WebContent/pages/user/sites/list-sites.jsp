<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <style type="text/css">
    	#format{
    		border-bottom: 1px solid #7FBB07;
    		text-align: left;
    	}
    	#sites-form{
    		padding: 20px 0;
    	}
    </style>
    <script src="../script/jquery-ui-1.9.0.custom.min.js"></script>
	<link type="text/css" href="../css/custom-theme/jquery-ui-1.9.0.custom.css" rel="stylesheet" />
    <script type="text/javascript">
    $(function() {
        $("#search-submit1").button();

        $("#format").buttonset();
        $("#records-section").load("bwiki/sites/display");

        $("#format input").click(function(){
        	$("#records-section").load("bwiki/sites/"+$(this).attr("id"));
        });
    });
    </script>
    
 <div id="sites-form">
 	<p class="records-header">Travel Places in Karnataka</p>
	<table class="records-table">
		<tr><td class="records-cell-label">Name :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td class="records-cell-label">Place Type :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td class="records-cell-label">With-In :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td class="records-cell-label">Period-From :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td class="records-cell-label">Period-To :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td><td style="text-align: right;"><input value="Filter" id="search-submit1" type="button" class="bwiki-search-submit"/>
	</table>
   </div>

    
	<div id="format">
        <input type="radio" id="nearest" name="radio" /><label for="nearest">Nearest First</label>
        <input type="radio" id="popular" name="radio" checked="checked" /><label for="popular">Popular</label>
        <input type="radio" id="type" name="radio" /><label for="type">Type</label>
    </div>
   
	<div id="records-section">
	</div>

