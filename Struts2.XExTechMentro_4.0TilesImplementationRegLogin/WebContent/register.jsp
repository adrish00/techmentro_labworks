<%@taglib uri="/struts-tags" prefix="s"%>
<s:form action="register"> 
	<s:textfield name ="user.name" label="Name"/>
	<s:textfield name ="user.mailId" label="Mail Id"/>
	<s:password name = "user.password" label="Password"/>
	<s:submit value="Sign Up"/>
</s:form>