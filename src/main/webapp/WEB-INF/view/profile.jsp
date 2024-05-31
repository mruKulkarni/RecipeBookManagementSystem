<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>
<style>
    .background-image {
        position: relative;
    }
    .content {
        position: absolute;
        top: 40%;
        left: 75%;
        transform: translate(-50%, -50%);
        color: white;
        text-align: center;
        font-size: 24px; /* Adjust the font size as needed */
        background-color: rgba(255, 255, 255, 0.3); /* Semi-transparent white background */
        padding: 20px; /* Add padding to the container */
        border-radius: 10px; /* Add border radius for rounded corners */
    }
</style>
</head>
<body>
<%@include file="/WEB-INF/Resources/Component/navbar_login.jsp"%>
<div class="container-fluid p-0 m-0 background-image">
    <img alt="notes_img" src="<c:url value="/Resources/img/profile3.jpg" />" width="100%" height="800px">
    <div class="content">
        <p>Welcome to Gang of Forks Recipe Book.</p>
        <p>To suggest any new recipes, contact fixed@example.com</p>
    </div>
</div>
</body>
</html>
