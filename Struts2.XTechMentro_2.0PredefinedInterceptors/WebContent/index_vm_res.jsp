<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
	<title>
		Struts2.XExTechMentro_2.0ArchtectureAnalysis
	</title>
</head>
<body>
Velocity Input<br>
<hr>
<s:form action="simple1">
	<s:textfield name="message" label="Message:"/>
	<s:submit value="Submit"/>
	<s:reset value="Reset"/>
</s:form>
</body>
</html>