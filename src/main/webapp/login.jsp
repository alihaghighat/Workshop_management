<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Login </title>

      <link href="${context}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${context}/resources/css/login.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">
       <form method="POST" action="${context}/login" class="form-signin">
         <img src="\resources\images\login.png" class="icon-login" alt="Smiley face" > 
        <h2 class="form-heading">Log in</h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            
            <span>${message}</span>
            <input name="username" type="text" class="form-control" placeholder="Username" />
            <input name="password" type="password" class="form-control" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" placeholder="Password" required/>
            <span id="error" class="has-error">Your username or password is incorrect</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            
    
            <button class="form-control"  onclick="myFunction()" type="submit">Log In</button>
            <h4 class="text-center"><a href="${context}/registration" >Create an account</a></h4>
            
        
        	
        	
        </div>
      </form>

    </div>
	<script>
	
	myFunction();
	
	function myFunction() {
	
		  var x = document.getElementById("error");
		  if (window.location.href.includes("error")) {
		    x.style.display = "block";
		  } else {
		    x.style.display = "none";
		  }
		}
	
	
	</script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${context}/resources/js/bootstrap.min.js"></script>
  </body>
</html>
