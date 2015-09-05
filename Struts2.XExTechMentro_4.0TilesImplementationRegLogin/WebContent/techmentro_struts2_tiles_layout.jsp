<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
<head>
	<title>
		<tiles:getAsString name="title"/>
	</title>
	<link rel="stylesheet" type="text/css" href="css/mystyle.css">
</head>
<body>
	<table border="1" style="width: 100%;height: 100%">
		<tr>
			<td style="height: 15%;">
				<tiles:insertAttribute name="header"/>
			</td>
		</tr>
		<tr>
			<td style="height: 70%;">
				<hr>
				<div style="color : White;font-style: bold;font-size: 25px; background-color: orange;">
					<marquee behavior="alternate">Techmentro Example Menu</marquee>
				</div>
				<hr><br>
				<tiles:insertAttribute name="content"/>
				<br><br><br><br><br>
				<br><br><br><br><br>
			</td>
		</tr>
		<tr>
			<td style="height: 15%;">
				<tiles:insertAttribute name="footer"/>
			</td>
		</tr>
	</table>
</body>
</html>