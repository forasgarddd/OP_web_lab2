<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>LAB2</title>
    <style>
        #task4 {
            position: relative; top: -10px;
        }
        #task5 {
            position: relative; left: 250px; bottom: 200px;
        }
        #task6 {
            position: relative; left: 500px; bottom: 390px;
        }
    </style>
</head>
<body>
<form id="task4" action="Task4Servlet">
    <h1>Task4</h1>
    a: <input type="text" name="a" value="" onclick="this.value = ''"/> <br>
    b: <input type="text" name="b" value="" onclick="this.value = ''"/> <br>
    c: <input type="text" name="c" value="" onclick="this.value = ''"/> <br>
    d: <input type="text" name="d" value="" onclick="this.value = ''"/> <br>
    <input type="submit" value="Count"/>

</form>
<form id="task5" action="Task5Servlet">

    <h1>Task5</h1>
    a: <input type="text" name="a" value="" onclick="this.value = ''"/> <br>
    b: <input type="text" name="b" value="" onclick="this.value = ''"/> <br>
    c: <input type="text" name="c" value="" onclick="this.value = ''"/> <br>
    d: <input type="text" name="d" value="" onclick="this.value = ''"/> <br>
    <input type="submit" value="Count"/>

</form>
<form id="task6" action="Task6Servlet">
    <h1>Task6</h1>
    a: <input type="text" name="a" value="" onclick="this.value = ''"/> <br>
    b: <input type="text" name="b" value="" onclick="this.value = ''"/> <br>
    c: <input type="text" name="c" value="" onclick="this.value = ''"/> <br>
    d: <input type="text" name="d" value="" onclick="this.value = ''"/> <br>
    <input type="submit" value="Count"/>
</form>
</body>
</html>