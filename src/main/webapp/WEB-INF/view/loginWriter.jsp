<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Writer Login</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

<style>
    .background-image {
        position: relative;
    }
    .register-form-container {
        position: absolute;
        top: 35%;
        left: 30%; /* Adjust left position as needed */
        transform: translate(-50%, -50%);
        padding: 20px;
        border-radius: 10px;
        width: 500px; /* Adjust the width as needed */
    }
    .register-form {
        width: 100%; /* Make form width 100% of container */
    }
</style>
</head>
<body>
<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp"%>
<div class="container-fluid p-0 m-0 background-image">
    <img alt="notes_img" src="<c:url value="/Resources/img/writer1.jpg" />" width="100%" height="800px">
    <div class="register-form-container">
        <div class="container mt-5">
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header text-center">
                            <h3>Writer Login</h3>
                            <c:if test="${not empty msg }">
                                <p class="fs-5 fw-bold text-danger">${msg }</p>
                                <c:remove var="msg" />
                            </c:if>
                        </div>
                        <div class="card-body register-form">
                            <form action="loginUserWriter" method="post">

                                <div class="mb-3">
                                    <label>Enter Email</label> <input type="email" name="email"
                                        class="form-control">
                                </div>

                                <div class="mb-3">
                                    <label>Enter Password</label> <input type="password"
                                        name="password" class="form-control">
                                </div>

                                <button class="btn col-md-12" style="background-color: #333333; color: white;">Login</button>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
