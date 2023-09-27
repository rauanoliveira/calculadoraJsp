<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
	<h1>Calculadora</h1>
    <form action="calculadora" method="post">
        <label for="numero1">Num1:</label>
        <input type="number" name="numero1" id="numero1" required><br>

        <label for="numero2">Num2:</label>
        <input type="number" name="numero2" id="numero2" required><br>

        <input type="submit" value="Calcular">
    </form>
</body>
</html>
