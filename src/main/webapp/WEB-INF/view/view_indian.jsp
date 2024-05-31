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
            background-image: url("<c:url value="/Resources/img/cream.jpg" />");
            background-size: cover;
            background-position: center;
            font-family: Arial, sans-serif;
        }
        .container {
            position: relative;
            width: 100%;
            height: 100vh;
            display: flex;
            flex-direction: column;
            justify-content: flex-start;
            align-items: center;
            padding-top: 50px; /* Added padding to adjust from the top */
        }
        .search-form {
            margin-bottom: 20px;
            width: 80%; /* Set the width to 80% */
            max-width: 500px; /* Max width for the search bar */
        }
        .input-group {
            display: flex;
        }
        .input-group input[type="text"] {
            flex: 1;
            border-radius: 5px 0 0 5px;
            padding: 10px;
            border: 1px solid #ced4da;
            border-right: none;
        }
        .input-group button[type="submit"] {
            border-radius: 0 5px 5px 0;
            padding: 10px 20px;
            background-color: #333;
            color: #fff;
            border: 1px solid #333;
            cursor: pointer;
        }
        .add-recipe-form {
            background-color: rgba(255, 255, 255, 0.6);
            padding: 20px;
            border-radius: 10px;
            width: 80%;
            max-width: 1000px;
            margin-top: 50px; /* Adjusted margin to move the box further down */
        }
        .btn-brown {
            background-color:  #333333;
            color: white;
        }
    </style>
</head>
<body>
    <%@include file="/WEB-INF/Resources/Component/navbar_login.jsp"%>
    <div class="container">
        <form class="search-form" action="${pageContext.request.contextPath}/user/search_in" method="GET">
            <div class="input-group">
                <input type="text" class="form-control" name="query" placeholder="Search for Indian recipes">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </form>
        <div class="add-recipe-form">
            <h4 class="text-center">Indian</h4>
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
                                <form action="${pageContext.request.contextPath}/user/likeIndian" method="POST">
                                    <input type="hidden" name="recipeId" value="${n.id}">
                                    <button type="submit" class="btn btn-brown" style="background-color: transparent; border: none;">
                                        <span style="font-size: 24px; color: black;"><i class="fa-solid fa-thumbs-up"></i></span>
                                        <span style="display: block; font-size: 14px; color: black;">Like</span>
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>
