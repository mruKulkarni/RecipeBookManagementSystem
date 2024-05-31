
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #333333;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><i class="fa-solid fa-mug-hot"></i>
   Gang Of Forks</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
      
        
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/user/addRequest"><i class="fa-solid fa-hand"></i>Request</a>
        </li>
      
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fa-solid fa-bell"></i>
            Subscription
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="#">Upgrade</a></li>
            <li><a class="dropdown-item" href="#">Renew</a></li>
            <li><hr class="dropdown-divider"></li>
           <c:if test="${not empty userObj}">
    <a href="${pageContext.request.contextPath}/deleteAccount" class="btn btn-light me-2" type="submit"><i class="fa-solid fa-delete-left me-2"></i>Cancel</a>
</c:if>

          </ul>
        </li>
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fa-solid fa-bell"></i>
            Categories
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
           
            <c:if test="${not empty userObj }">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/user/view_beverages"><i class="fa-solid fa-mug-hot"></i>Beverages</a></li>
					
				</c:if>
			<c:if test="${not empty userObj }">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/user/view_indian"><i class="fa-solid fa-bowl-rice"></i>Indian</a></li>
					
				</c:if>
			<c:if test="${not empty userObj }">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/user/view_continental"><i class="fa-solid fa-pizza-slice"></i>Continental</a></li>
					
				</c:if>
			<c:if test="${not empty userObj }">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/user/view_fastfood"><i class="fa-solid fa-hotdog"></i>Fast food</a></li>
					
				</c:if>
			<c:if test="${not empty userObj }">
					<li><a class="dropdown-item"
						href="${pageContext.request.contextPath}/user/view_desserts"><i class="fa-solid fa-ice-cream"></i>Desserts</a></li>
					
				</c:if>
            <!--  <li><a class="dropdown-item" href="#">Indian</a></li>-->
            
            <!--  <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/view_indian">Indian</a></li>-->
          </ul>
        </li>
        
        
        
      </ul>
     <form class="d-flex">
				<c:if test="${empty userObj }">
					<a href="${pageContext.request.contextPath}/login" class="btn btn-light me-2" type="submit">Login</a>
					<a href="${pageContext.request.contextPath}/register" class="btn btn-light" type="submit">Register</a>
				</c:if>
				<c:if test="${not empty userObj }">
					<a href="#" class="btn btn-light me-2" type="submit"><i
						class="fa-solid fa-user"></i> ${userObj.fullname }</a>
					<a href="${pageContext.request.contextPath}/home" class="btn btn-light" type="submit"><i class="fa-solid fa-ban me-2"></i>Logout</a>
				</c:if>

			</form>
    </div>
  </div>
</nav>