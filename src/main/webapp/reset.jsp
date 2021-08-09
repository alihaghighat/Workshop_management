<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Check your account</title>

      <link href="${context}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${context}/resources/css/common.css" rel="stylesheet">
  </head>

  <body>
<%--
    <div class="container">
      <form method="POST" action="${context}/check" class="form-signin">
        <h2 class="form-heading"></h2>

        <div class="form-group ${error != null ? 'has-error' : ''}">
            <span>${message}</span>
            <input name="username" type="text" class="form-control" placeholder="Username"/>
            <input name="bestFriendName" type="text" class="form-control" placeholder="Your Best Friend Name "/>
            <span>${error}</span>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Check</button>
            <h4 class="text-center"><a href="${context}/login" >Log in</a></h4>
        </div>
      </form>
    </div>
 --%>
 
 		<h2>Well Mamad</h2>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${context}/resources/js/bootstrap.min.js"></script>
  </body>
</html>
