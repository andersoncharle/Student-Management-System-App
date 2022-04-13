<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>student management system</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>

<form action="Register" method="POST">
    <label>
        <input type="text" name="username" placeholder="username">
    </label>
    <label>
        <input type="text" name="fname" placeholder="first name">
    </label>
    <label>
        <input type="text" name="lname" placeholder="last name">
    </label>
    <label>
        <input type="email" name="email" placeholder="email">
    </label>
    <label>
        <input type="password" name="password" placeholder="password">
    </label>
    <label>
        <input type="password" name="confirm" placeholder="confirm password">
    </label>
    <input type="submit" value="submit" name="submit">

</form>


<br/>
<a href="hello">Hello Servlet</a>
<a href="/Register" style="display: block;">register here:</a>
</body>
</html>