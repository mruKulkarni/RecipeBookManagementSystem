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
           .background-image-container {
        position: relative;
    }
    .add-recipe-form {
        position: absolute;
        top: 20%;
        left:50%;
        transform: translate(-50%, -50%);
        background-color: rgba(255, 255, 255, 0.6); /* Semi-transparent white background */
        padding: 20px;
        border-radius: 10px;
        width: 1000px; /* Adjust the width as needed */
    }
</style>
</head>
<body style="background-color: #f0f0f0;">
	<%@include file="/WEB-INF/Resources/Component/navbar_login.jsp"%>
	 <div class="container mt-5 background-image-container">
	 
        <img alt="notes_img" src="<c:url value="/Resources/img/blue.jpg" />" width="100%" height="800px">
	<div class="container-fluid p-2 add-recipe-form">
	
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-10 offset-md-1">
				<div class="card">
					<div class="card-header text-center">
						<h3>Add Request</h3>
						<c:if test="${not empty msg }">
							<p class="fs-3 fw-bold text-success">${msg }</p>
							<c:remove var="msg" />
						</c:if>
					</div>
					<div class="card-body">
						<form action="saveRequest" method="post">
							<div class="mb-3">
								<label>Enter Recipe Name</label> <input type="text" name="title"
									class="form-control">
							</div>

							

							<button class="btn col-md-2" style="background-color:  #333333; color: white;">Save</button>



						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
