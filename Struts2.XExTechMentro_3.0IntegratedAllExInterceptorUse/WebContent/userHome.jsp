<%@taglib uri="/struts-tags" prefix="s"%>
<b>
	Welcome: <s:property value="#session.user.name"/> 
	<br>
</b>
<a href="viewProfile.jsp">View Profile</a>
<br>
<a href="logout.action">logout</a>
<br>