<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>

<title>Calculator</title>

</head>

<body>

<h2>Spring MVC Calculator</h2>

<h1> Calculator Deployement </h1>



<form:form action="calculate" method="post" modelAttribute="calculator">

Number 1 :

<form:input path="number1"/>

<br><br>

Number 2 :

<form:input path="number2"/>

<br><br>

Operation :

<form:select path="operation">

<form:option value="add">Addition</form:option>

<form:option value="sub">Subtraction</form:option>

<form:option value="mul">Multiplication</form:option>

<form:option value="div">Division</form:option>

</form:select>

<br><br>

<input type="submit" value="Calculate">

</form:form>

</body>

</html>