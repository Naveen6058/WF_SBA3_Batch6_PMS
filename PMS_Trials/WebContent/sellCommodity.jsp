<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sell Commodity</title>
</head>
<body>
	<h3>Username Stock Details</h3>
	<form action="orderConfirmation.jsp">
		<table border=1>
			<tr>
				<th>Select</th>
				<th>Commodity Name</th>
				<th>Current Price</th>
				<th>Quantity</th>
				<th>Quantity to sell</th>
			</tr>
			<tr>
				<td><input type="checkbox" name="chck1" value="chck1"></input></td>
				<td>Commodity Name1</td>
				<td>Rs. 1000</td>
				<td>5</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="quantity"
					id="quantity">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="chck2" value="chck2"></input></td>
				<td>Commodity Name2</td>
				<td>Rs. 2000</td>
				<td>8</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="quantity"
					id="quantity">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="chck3" value="chck3"></input></td>
				<td>Commodity Name3</td>
				<td>Rs. 3000</td>
				<td>5</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="quantity"
					id="quantity">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="chck4" value="chck4"></input></td>
				<td>Commodity Name4</td>
				<td>Rs. 1000</td>
				<td>5</td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="quantity"
					id="quantity">
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
				</select></td>
			</tr>

		</table>
		<br>
		<button type="submit">Sell Selected Commodity</button>
	</form>
</body>
</html>