<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<body>

<br>
	<table border="1">
		<tr bgcolor="grey">
			<td ><b>Name</b></td>
			<td ><b>Email Address</b></td>
		</tr>
		<s:iterator value="users">
			<tr>
				<td><s:property value="name"/> </td>
				<td><s:property value="mailId"/></td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>