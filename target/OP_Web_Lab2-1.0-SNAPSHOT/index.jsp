<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>LAB2</title>
    <style>
        #task4 {
            position: absolute; top: -10px;
        }
        #task5 {
            position: absolute; left: 300px; bottom: 200px; top: -10px;
        }
        #task6 {
            position: absolute; left: 600px; bottom: 390px; top: -10px;
        }
    </style>
</head>
<body>
<form id="task4" action="Task4Servlet">
    <h1>Task4</h1>
    a: <input type="text" name="a" value="${a2}" /> <br>
    b: <input type="text" name="b" value="${b2}" /> <br>
    c: <input type="text" name="c" value="${c2}" /> <br>
    d: <input type="text" name="d" value="${d2}" /> <br>
    <input type="submit" value="Count"/><br>
    Ответ:<input type="text"  value="${res2}" /> <br>
</form>
<form id="task5" action="Task5Servlet">

    <h1>Task5</h1>
    a: <input type="text" name="a" value="${a1}" /> <br>
    b: <input type="text" name="b" value="${b1}" /> <br>
    c: <input type="text" name="c" value="${c1}" /> <br>
    d: <input type="text" name="d" value="${d1}" /> <br>
    <input type="submit" value="Count"/><br>
    Ответ:<input type="text"  value="${res1}" /> <br>
</form>
<form id="task6" action="Task6Servlet">
    <h1>Task6</h1>
    a: <input type="text" name="a" value="${a}" /> <br>
    b: <input type="text" name="b" value="${b}" /> <br>
    c: <input type="text" name="c" value="${c}" /> <br>
    d: <input type="text" name="d" value="${d}" /> <br>
    <input type="submit" value="Count"/><br>
    Ответ:<input type="text"  value="${res}" /> <br>
</form>



</body>
</html>