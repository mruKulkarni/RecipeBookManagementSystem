<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Register</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp" %>

<style>
    .background-image {
        position: relative;
    }
    .register-form {
        position: absolute;
        top: 35%; /* Adjust top position as needed */
        left: 30%; /* Adjust left position as needed */
        transform: translate(-50%, -50%);
        padding: 20px;
        border-radius: 10px;
        width: 600px; /* Adjust the width as needed */
    }
</style>
</head>
<body>
<%@include file="/WEB-INF/Resources/Component/Nav_bar.jsp"%>
<div class="container-fluid p-0 m-0 background-image">
    <img alt="notes_img" src="<c:url value="/Resources/img/register1.jpg" />" width="100%" height="800px">
    <div class="register-form">
        
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <div class="card">
                        <div class="card-header text-center">
                            <h3>Register</h3>
                            <c:if test="${not empty msg }">
                                <p class="fs-3 fw-bold text-success">${msg }</p>
                                <c:remove var="msg" />
                            </c:if>
                        </div>
                        <div class="card-body">
                            <form action="registerUser" method="post">
                                <div class="mb-3">
                                    <label>Enter Full Name</label> <input type="text"
                                        name="fullname" class="form-control">
                                </div>

                                <div class="mb-3">
                                    <label>Enter Email</label> <input type="email" name="email"
                                        class="form-control">
                                </div>

                                <div class="mb-3">
                                    <label>Enter Password</label> <input type="password"
                                        name="password" class="form-control">
                                </div>

                                <button class="btn col-md-12" style="background-color:  #333333; color: white;">Register</button>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>
</html>
