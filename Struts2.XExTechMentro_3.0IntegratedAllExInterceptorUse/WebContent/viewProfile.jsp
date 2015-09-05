<%@ taglib uri="/struts-tags" prefix="s" %>
<b>
<br>
<s:form action="updateProfile">
	<s:textfield name="user.name" value="%{#session.user.name}"/>
	<s:textfield name="user.mailId" value="%{#session.user.mailId}"/>
	<s:textfield name="user.password" value="%{#session.user.password}"/>
	<s:submit value="Update" disabled="true"/>
</s:form>
</b>