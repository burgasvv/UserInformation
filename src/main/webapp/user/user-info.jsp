<jsp:useBean id="city" scope="request" type="java.lang.String"/>
<jsp:useBean id="country" scope="request" type="java.lang.String"/>
<jsp:useBean id="email" scope="request" type="java.lang.String"/>
<jsp:useBean id="name" scope="request" type="java.lang.String"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Data</title>
</head>
<body>
    <div style="margin: 100px">
        <h2>User Information:</h2>
        <p>Name: ${name}</p>
        <p>Email: ${email}</p>
        <p>Country: ${country}</p>
        <p>City: ${city}</p>
        <button onclick="history.back()">Back</button>
    </div>
</body>
</html>
