<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/WEB-INF/Resources/Component/All_link.jsp"%>
</head>
<body style="background-color: #f0f0f0;">
	<%@include file="/WEB-INF/Resources/Component/navbar_writer.jsp"%>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-10 offset-md-1">
				<div class="card">
					<div class="card-header text-center">
						<h3>Edit your Recipes</h3>
					</div>
					<div class="card-body">
						<form action="updateDes" method="post">
							<div class="mb-3">
								<label>Enter Title</label> <input type="text" name="title"
									class="form-control" value="${recipe.title }">
							</div>

							<div class="mb-3">
								<label>Enter Description</label>
								<textarea rows="6" cols="" class="form-control"
									name="description">${recipe.description }</textarea>
							</div>
							<input type="hidden" name="id" value="${recipe.id}">
						<button class="btn col-md-2" style="background-color:  #333333; color: white;">Update</button>



						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>