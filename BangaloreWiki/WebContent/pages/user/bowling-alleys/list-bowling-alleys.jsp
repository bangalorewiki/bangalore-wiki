<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <style type="text/css">
    	#format{
    		border-bottom: 1px solid #7FBB07;
    		text-align: left;
    	}
    	#sites-form{
    		padding: 20px 0;
    	}
    </style>
    <script type="text/javascript">
    $(function() {
        $("#search-submit1").button();

        $("#format").buttonset();
        $("#records-section").load("../bwiki/bowling-alleys/display");

    });
    </script>
    
	<div id="theatres-form">
	<p class="records-header">Movie Theatres</p>
	<table class="records-table">
		<tr><td class="records-cell-label">Name :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td class="records-cell-label">Pincode :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td class="records-cell-label">Language :</td><td class="records-cell-value"><input id="search" type="text" class="bwiki-input-search"/></td>
		<tr><td><td style="text-align: right;"><input value="Filter" id="search-submit1" type="button" class="bwiki-search-submit"/>
	</table>
	</div>
   <div id="format">
       <input type="radio" id="nearest" name="radio" /><label for="nearest">Pincode</label>
       <input type="radio" id="popular" name="radio" checked="checked" /><label for="popular">Popular</label>
       <input type="radio" id="type" name="radio" /><label for="type">Language</label>
   </div>
	<div id="records-section">
	</div>

