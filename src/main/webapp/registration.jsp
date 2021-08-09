<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
  	
      <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">



<script type="text/javascript" src="<c:url value="/resources/spring/Spring-Dojo.js" />"> </script>
      <title>Create an account</title>
      <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${contextPath}/resources/css/singup.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    
<script>
   		
      

    



    </script>
    
      
      
  
  </head>

  <body>
	
    <div class="container ">
      
        <form:form method="POST" modelAttribute="userForm"  class="form-signup form-group" id="userForm">
        	 <img src="\resources\images\Register.png" class="icon-signup" alt="Smiley face" > 
            <h2 class="form-signin-heading">Create your account</h2>
            <div class="form-group col-lg-12">   
            <label for="personalinformation">personal information</label>
            </div>
            <div class="form-group col-lg-6 marj1">     
            <spring:bind path="firstname">
            	 
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="firstname" class="form-control" placeholder="FirstName"
                                autofocus="true" ></form:input>
                    <form:errors path="firstname"></form:errors>
                </div>
            </spring:bind>
            </div>
            <div class="form-group col-lg-6 marj1">   
            <spring:bind path="lastname">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="lastname" class="form-control" placeholder="LastName"
                                autofocus="true"></form:input>
                    <form:errors path="lastname"></form:errors>
                </div>
            </spring:bind>
            </div>
            <div class="form-group col-lg-12 marj1"> 
            <spring:bind path="nationalCode">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="nationalCode" class="form-control" placeholder="National Code"
                                autofocus="true"></form:input>
                    <form:errors path="nationalCode"></form:errors>
                </div>
            </spring:bind>
            </div>
            <div class="form-group col-lg-12 marj1"> 
            <label for="ContactPoint">ContactPoint</label>
            </div>
            <div class="form-group col-lg-12 marj1"> 
			<spring:bind path="ContactPointsEmail">
		                <div class="form-group ${status.error ? 'has-error' : ''}">
		                    <form:input type="email" class="form-control"  placeholder="Email"
		                                 path="ContactPointsEmail" name="email"></form:input>
		               		
		                </div>
		 				<form:errors cssClass="has-error" path="ContactPointsEmail"></form:errors>
		   </spring:bind>
		   </div>
       <div class="form-group col-lg-6 marj1"> 
		   <spring:bind path="ContactPointsPhoneNumber">
		                <div class="form-group ${status.error ? 'has-error' : ''}">
		                    <form:input type="text" class="form-control"  placeholder="Phone Number"
		                                 path="ContactPointsPhoneNumber" ></form:input>
		               		
		                </div>
		 				<form:errors cssClass="has-error" path="ContactPointsPhoneNumber"></form:errors>
		   </spring:bind>
       </div>
       <div class="form-group col-lg-6 marj1"> 
       <spring:bind path="ContactPointsFatherPhoneNumber">
		                <div class="form-group ${status.error ? 'has-error' : ''}">
		                    <form:input type="text" class="form-control"  placeholder="Your father's phoneNumber"
		                                 path="ContactPointsFatherPhoneNumber" ></form:input>
		               		
		                </div>
		 				<form:errors cssClass="has-error" path="ContactPointsFatherPhoneNumber"></form:errors>
		   </spring:bind>
		   </div>
       <div class="form-group col-lg-12 marj1"> 
		   <spring:bind path="ContactPointsAddress">
		                <div class="form-group ${status.error ? 'has-error' : ''}">
		                    <form:input type="text" class="form-control"  placeholder="Address"
		                                 path="ContactPointsAddress" ></form:input>
		               		
		                </div>
		 				<form:errors cssClass="has-error" path="ContactPointsAddress"></form:errors>
		   </spring:bind>
		   </div>
		   
       <div class="form-group col-lg-12 marj1">     
			 <spring:bind path="birthDate">
            
                    
                    <label for="birthDate">BirthDate</label>            
                    <div class="form-group ${status.error ? 'has-error' : ''}">
    				
                        <form:input type="date" path="birthDate" autofocus="true" class="form-control" id="birthDate"/>
                     
					</div>
                    <form:errors cssClass="has-error" path="birthDate"></form:errors>

            </spring:bind>
            </div>
            <div class="form-group col-lg-6 marj1"> 
             <spring:bind path="nationality">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                	<label for="nationality">Nationality</label>
					    <form:select class="form-control" path="nationality" id="nationality" >
						  		<form:option value="AFGHAN"  label="Afghan"/>
						  		<form:option value="AMERICAN" label="American"/>
						  		<form:option value="ARGENTINEAN" label="Argentinean"/>
						  		<form:option value="AUSTRALIAN" label="Australian"/>
						  		<form:option value="AUSTRIAN" label="Austrain"/>
						  		<form:option value="AZERBAIJANI" label="Azerbaijani"/>
						  		<form:option value="BANGLADESHI" label="Bangladeshi"/>
						  		<form:option value="BELGIAN" label="Belgian"/>
						  		<form:option value="BRAZILIAN" label="Branzilian"/>
						  		<form:option value="BRITISH" label="British"/>
						  		<form:option value="CANADIAN" label="Canadian"/>
						  		<form:option value="CENTRAL_AFRICAN" label="Central African"/>
						  		<form:option value="CHILEAN" label="Chilean"/>
						  		<form:option value="CHINESE" label="Chinese"/>
						  		<form:option value="COLOMBIAN" label="Colombian"/>
						  		<form:option value="CZECH" label="Czech"/>
						  		<form:option value="FRENCH" label="French"/>
						  		<form:option value="GERMAN" label="German"/>
						  		<form:option value="GREEK" label="Greek"/>
						  		<form:option value="ICELANDER" label="Icelander"/>
						  		<form:option value="INDIAN" label="Indian"/>
						  		<form:option value="INDONESIAN" label="indonesian"/>
						  		<form:option value="IRANIAN" label="Iranian"/>
						  		<form:option value="IRAQI" label="Iraqi"/>
						  		<form:option value="IRISH" label="Irish"/>
						  		<form:option value="ITALIAN" label="Italian"/>
						  		<form:option value="JAPANESE" label="Japanese"/>
						  		<form:option value="LEBANESE" label="Lebanese"/>
						  		<form:option value="MEXICAN" label="Mexican"/>
						  		<form:option value="MOROCCAN" label="Moroccan"/>
						  		<form:option value="NIGERIAN" label="Nigerian"/>
						  		<form:option value="NORTH_KOREAN" label="North Korean"/>
						  		<form:option value="OMANI" label="Omani"/>
						  		<form:option value="PAKISTANI" label="Pakistani"/>
						  		<form:option value="POLISH" label="Polish"/>
						  		<form:option value="QATARI" label="Qatari"/>
						  		<form:option value="ROMANIAN" label="Romanian"/>
						  		<form:option value="RUSSIAN" label="Russian"/>
						  		<form:option value="SAUDI" label="Saudi"/>
						  		<form:option value="SCOTTISH" label="Scottish"/>
						  		<form:option value="SERBIAN" label="Serbian"/>
						  		<form:option value="SLOVAKIAN" label="Slovakian"/>
						  		<form:option value="SOUTH_AFRICAN" label="South African"/>
						  		<form:option value="SOUTH_KOREAN" label="South Korean"/>
						  		<form:option value="SPANISH" label="Spanish"/>
						  		<form:option value="SWEDISH" label="Swedish"/>
						  		<form:option value="SWISS" label="Swiss"/>
						  		<form:option value="TAJIK" label="Tajic"/>
						  		<form:option value="TURKISH" label="Turkish"/>
						  		<form:option value="UKRAINIAN" label="Ukrainian"/>
						  		<form:option value="URUGUAYAN" label="Uruguayan"/>
						  		<form:option value="UZBEKISTANI" label="Uzbekistani"/>
						  		<form:option value="VENEZUELAN" label="Venezuelan"/>
						  		<form:option value="YEMENITE" label="Yemenite"/>
					    </form:select>
                    
                    <form:errors path="nationality"></form:errors>
                </div>
            </spring:bind>
            </div>
            <div class="form-group col-lg-6 marj1"> 
			 <spring:bind path="gender">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                	<label for="gender">Gender</label>
					    <form:select class="form-control" path="gender" id="gender" >
					  		
					  		<form:option value="MALE" label="Male" />
    						<form:option value="FEMALE" label="Female" />
    						<form:option value="OTHER" label="Other" />
					
					    </form:select>
                    
                    <form:errors path="gender"></form:errors>
                </div>
            </spring:bind>
			     </div>
           <div class="form-group col-lg-12 marj1">
            <spring:bind path="username">
            <label for="username">User Profile</label>
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="username" class="form-control" placeholder="Username"
                                autofocus="true"></form:input>
                    <form:errors path="username"></form:errors>
                </div>
            </spring:bind>
            </div>
            <div class="form-group col-lg-12 marj1">     
            <spring:bind path="password">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="password" class="form-control" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"></form:input>
                    <form:errors path="password"></form:errors>
                </div>
            </spring:bind>
            </div>
            <div class="form-group col-lg-12 marj1"> 
            <spring:bind path="passwordConfirm">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="passwordConfirm" class="form-control"
                                placeholder="Confirm your password"></form:input>
                    <form:errors path="passwordConfirm"></form:errors>
                </div>
            </spring:bind>
            </div>
            <div class="form-group col-lg-12 marj1"> 			
        	<spring:bind path="bestFriendName">
        	<label for="bestFriendName">security question</label>
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="bestFriendName" class="form-control" placeholder="Your Best Friend Name"
                                autofocus="true"></form:input>
                    <form:errors path="bestFriendName"></form:errors>
                </div>
            </spring:bind>
           </div>
           
            <h4 class="text-center" style="color: #fff;"><a href="${context}/login" style="color: aliceblue;">Login</a></h4>
            <button id="submit1"  class="form-control" type="submit">Sign up</button>
        </form:form>
    
 	</div>
    
	
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	
    <script src="${contextPath}/resources/js/bootstrap.min.js">

    </script>
  </body>
</html>
