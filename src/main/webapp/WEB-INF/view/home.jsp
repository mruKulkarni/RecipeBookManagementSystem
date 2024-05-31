<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recipe Book</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

<style>
    .center-box {
        position: absolute;
        top: 50%;
        right: 5%;
        transform: translateY(-50%);
        background-color: rgba(51, 161, 201, 0.5);
        width: 300px;
        height: 200px;
        border: 2px solid #000000;
        border-radius: 10px;
        text-align: center;
        padding: 20px;
        box-sizing: border-box;
        cursor: pointer;
        display: flex;
        align-items: center;
        justify-content: center;
        font-weight: bold;
        font-size: 24px;
        color: black;
    }

    .center-box:hover {
        background-color: rgba(224, 224, 224, 0.7);
    }
</style>
</head>
<body>

<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp" %>
<div class="container-fluid p-0 m-0">
    <img alt="notes_img" src="<c:url value="/Resources/img/home_3.jpg" />" width="100%" height="800px">
    <a href="${pageContext.request.contextPath}/non_sub" class="center-box" type="submit">View Samples!</a>
</div>
</body>
</html>
