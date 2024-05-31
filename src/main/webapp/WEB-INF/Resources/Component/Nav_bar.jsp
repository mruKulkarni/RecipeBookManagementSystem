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
          <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/home"><i class="fa-solid fa-house"></i>Home</a>
        </li>
        
       
      
       
        
         
        
        
        
      </ul>
      <form class="d-flex">
         <a href="${pageContext.request.contextPath}/login" class="btn btn-light me-2" type="submit"><i class="fa-solid fa-right-to-bracket me-2"></i>Login</a>
         <br>
        <a href="${pageContext.request.contextPath}/register"  class="btn btn-light me-2" type="submit"><i class="fa-solid fa-address-card me-2"></i>Register</a>
       
        <a href="${pageContext.request.contextPath}/loginWriter"  class="btn btn-light" type="submit"><i class="fa-solid fa-pen me-2"></i>Writer Login</a>
        
           
      </form>
    </div>
  </div>
</nav>