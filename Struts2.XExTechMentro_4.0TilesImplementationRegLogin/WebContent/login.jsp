<%@taglib uri="/struts-tags" prefix="s" %>
<s:form action="login">
	<s:textfield name="user.mailId" label="mailId" required="true"/>
	<s:password name="user.password" label="password" required="true" requiredposition="right"/>
	<s:submit value="Login"/>
</s:form>