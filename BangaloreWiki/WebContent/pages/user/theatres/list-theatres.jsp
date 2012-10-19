<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<display:table name="theatreList" export="false">
	<display:column property="no" title="#"/>
	<display:column property="name" title="Name"/>
	<display:column property="address" title="Address"/>
	<display:column property="pin_code" title="Pin Code"/>
	<display:column property="contact_number" title="Contact"/>
	<display:column property="contact_person" title="Contact Person"/>
	<display:column property="rating" title="Rating"/>
	<display:column property="language" title="Language"/>
</display:table>