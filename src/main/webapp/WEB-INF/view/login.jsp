<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

<style>
    .background-image {
        position: relative;
    }
    .login-form {
        position: absolute;
        top: 35%;
        left: 30%; /* Adjust left position as needed */
        transform: translate(-50%, -50%);
        padding: 20px;
        border-radius: 10px;
        width: 400px; /* Adjust the width as needed */
    }
</style>
</head>
<body>
<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp"%>
<div class="container-fluid p-0 m-0 background-image">
    <img alt="notes_img" src="<c:url value="/Resources/img/login2.jpg" />" width="100%" height="800px">
    <div class="login-form">
        <div class="container mt-5">
            <div class="row">
                <div class="col-md-12">
                    <div class="card">
                        <div class="card-header text-center">
                            <h3>Login</h3>
                            <c:if test="${not empty msg }">
                                <p class="fs-5 fw-bold text-danger">${msg }</p>
                                <c:remove var="msg" />
                            </c:if>
                        </div>
                        <div class="card-body">
                            <form action="loginUser" method="post">

                                <div class="mb-3">
                                    <label>Enter Email</label> <input type="email" name="email"
                                        class="form-control">
                                </div>

                                <div class="mb-3">
                                    <label>Enter Password</label> <input type="password"
                                        name="password" class="form-control">
                                </div>

                                <button class="btn col-md-12" style="background-color:  #333333; color: white;">Login</button>

                            </form>
                        </div>
                        <div class="card-footer text-center">
                            <p class="fs-6">
                                Don't have an account? <a href="${pageContext.request.contextPath}/register"
                                    class="text-decoration-none">register</a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
