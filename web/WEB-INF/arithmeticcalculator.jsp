<%-- 
    Document   : arithmeticcalculator
    Created on : 2023. 1. 24, 11:29:32PM
    Author     : Youngshin Park
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            First: = <input type="text" name="firstNumber" value="${firstNumber}"><br>
            Second: = <input type="text" name="secondNumber" value="${secondNumber}"><br>
            <input type="submit" value="+" name="calculate">
            <input type="submit" value="-" name="calculate">
            <input type="submit" value="*" name="calculate">
            <input type="submit" value="%" name="calculate">
        </form>
            
            <div>Result: ${result}</div>            
            <a href="age">Age Calculator</a>


    </body>
</html>
