<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
    <%@include file="/WEB-INF/Resources/Component/All_link.jsp"%>
    <style>
        body {
            margin: 0;
            padding: 0;
            background-image: url("<c:url value="/Resources/img/de.jpg" />");
            background-size: cover;
            background-position: center;
            font-family: Arial, sans-serif;
        }
        .container {
            position: relative;
            width: 100%;
            height: 100vh; /* 100% of viewport height */
            display: flex;
            justify-content: center;
            align-items: flex-start; /* Adjusted to move the box further down */
            padding-top: 100px; /* Adjusted padding to create space from the top */
        }
        .add-recipe-form {
            background-color: rgba(255, 255, 255, 0.6); /* Semi-transparent white background */
            padding: 20px;
            border-radius: 10px;
            width: 90%; /* Increased width */
            max-width: 1000px;
        }
        .btn-brown {
            background-color:  #333333;
            color: white;
            margin-right: 5px;
        }
    </style>
</head>
<body>
    <%@include file="/WEB-INF/Resources/Component/navbar_writer.jsp"%>
    <div class="container">
        <div class="add-recipe-form">
            <h4 class="text-center">Desserts</h4>
            <c:if test="${not empty msg }">
                <p class="fs-5 fw-bold text-success text-center">${msg }</p>
                <c:remove var="msg" />
            </c:if>
            <div class="row">
                <c:forEach items="${list}" var="n">
                    <div class="col-md-10 offset-md-1 mt-2">
                        <div class="card">
                            <div class="card-body">
                                <p>${n.title }</p>
                                <p>${n.description }</p>
                                <div>
                                    <!-- Display thumbs up symbol and likes -->
                                    <span style="font-size: 24px;"><i class="fa-solid fa-thumbs-up"></i></span>
                                    ${n.likes}
                                </div>
                                <div class="text-center">
                                    <a href="editBeverages?id=${n.id}" class="btn btn-brown btn-sm">Edit</a>
                                    <a href="deleteBeverages?id=${n.id}" class="btn btn-brown btn-sm">Delete</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>
