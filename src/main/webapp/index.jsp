<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello visitor</title>
</head>
<body>
    <div style="margin: 100px">
        <h1>Hello visitor</h1>
        <h2>Enter the form below</h2>
        <form action="${pageContext.request.contextPath}/user-servlet" method="post">
            <label for="name"> Name <br>
                <input type="text" id="name" name="name"> <br><br>
            </label>
            <label for="email">Email <br>
                <input type="text" id="email" name="email"> <br><br>
            </label>
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>