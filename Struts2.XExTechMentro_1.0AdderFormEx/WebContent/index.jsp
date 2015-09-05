<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
	<title>
		Struts2.XExTechMentro_1AdderFormEx
	</title>
</head>
<s:form action="adder">
	<s:textfield name="number_1" label="First No."/>
	<s:textfield name="number_2" label="Second No."/>
	<s:submit value="Add"/>
	<s:reset value="Reset"/>
</s:form>
</body>
</html>