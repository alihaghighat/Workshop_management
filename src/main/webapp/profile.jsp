<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Edit information | Workshop</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <script src='https://kit.fontawesome.com/a076d05399.js'></script>
        <!-- favicon
            ============================================ -->
        <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico">
        <!-- Google Fonts
            ============================================ -->
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,900" rel="stylesheet">
        <!-- Bootstrap CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/bootstrap.min.css">
        <!-- Bootstrap CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/font-awesome.min.css">
        <!-- owl.carousel CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/owl.carousel.css">
        <link rel="stylesheet" href="${context}/resources/css/owl.theme.css">
        <link rel="stylesheet" href="${context}/resources/css/owl.transitions.css">
        <!-- animate CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/animate.css">
        <!-- normalize CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/normalize.css">
        <!-- meanmenu icon CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/meanmenu.min.css">
        <!-- main CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/main.css">
        <!-- educate icon CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/educate-custon-icon.css">
        <!-- morrisjs CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/morrisjs/morris.css">
        <!-- mCustomScrollbar CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/scrollbar/jquery.mCustomScrollbar.min.css">
        <!-- metisMenu CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/metisMenu/metisMenu.min.css">
        <link rel="stylesheet" href="${context}/resources/css/metisMenu/metisMenu-vertical.css">
        <!-- calendar CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/calendar/fullcalendar.min.css">
        <link rel="stylesheet" href="${context}/resources/css/calendar/fullcalendar.print.min.css">
        <!-- style CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/style.css">
        <!-- responsive CSS
            ============================================ -->
        <link rel="stylesheet" href="${context}/resourcescss/responsive.css">
        <!-- modernizr JS
            ============================================ -->
        <script src="${context}/resources/js/vendor/modernizr-2.8.3.min.js"></script>
    </head>
    <body>
        <!--[if lt IE 8]>
		<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
	<![endif]-->
    <!-- Start Left menu area -->
    <div class="left-sidebar-pro">
        <nav id="sidebar" class="">
                    <div class="sidebar-header">
                        <a href="${context}/home"><img class="main-logo" src="${context}/resources/img/logo/logo.png" alt="" /></a>
                        <strong><a href="${context}/home"><img src="${context}/resources/img/logo/logosn.png" alt="" /></a></strong>
                    </div>
                    <div class="left-custom-menu-adp-wrap comment-scrollbar">
                        <nav class="sidebar-nav left-sidebar-menu-pro">
                            <ul class="metismenu" id="menu1">
                                <li class="">
                                    <a class="has-arrow" href="${context}/home">
                                           <span class=" fa fa-home"></span>
                                             <span class="mini-click-non">Home</span>
                                        </a>
                                    
                                </li>
                                <li class="">
                                    <a class="has-arrow" href="${context}/profile">
                                           <span class=" fa fa-user"></span>
                                             <span class="mini-click-non">MY Profile</span>
                                        </a>
                                    
                                </li>
                                <li class="active">
                                    <a class="has-arrow" href="${context}/home">
                                           <span class=" fa fa-user"></span>
                                           
                                           <span class="mini-click-non">Role</span>
                                        </a>
                                    <ul class="submenu-angle" aria-expanded="true">
                                        <li><a title="Adminstartor" href="${context}/administrator"><span class="mini-sub-pro">Adminstartor</span></a></li>
                                    </ul>
                                    <ul class="submenu-angle" aria-expanded="true">
                                        <li><a title="participants" href="${context}/user-participant"><span class="mini-sub-pro">Participant</span></a></li>
                                    </ul>
                                    <ul class="submenu-angle" aria-expanded="true">
                                        <li><a title="Organizer" href="${context}/user-organizer"><span class="mini-sub-pro">Organizer</span></a></li>
                                    </ul>
                                    <ul class="submenu-angle" aria-expanded="true">
                                        <li><a title="Grader" href="${context}/user-grader"><span class="mini-sub-pro">Grader</span></a></li>
                                    </ul>
                                </li>

                               
                            </ul>
    
                         
                      
                </nav>
            </div>
        </nav>
    </div>
    <!-- End Left menu area -->
    <!-- Start Welcome area -->
    <div class="all-content-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="logo-pro">
                        <a href="index.html"><img class="main-logo" src="img/logo/logo.png" alt="" /></a>
                    </div>
                </div>
            </div>
        </div>
        <div class="header-advance-area">
            <div class="header-top-area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="header-top-wraper">
                                <div class="row">
                                        
                                    <div class="col-lg-6 col-md-7 col-sm-6 col-xs-12">
                                        
                                        <div class="header-top-menu tabl-d-n">
                                            <ul class="nav navbar-nav mai-top-nav">
                                                <li class="nav-item"><a href="${context}/About-us" class="nav-link">About us</a>
                                                </li>
                                                <li class="nav-item"><a href="#" class="nav-link"></a>
                                                </li>
                                                <li class="nav-item"><a href="#" class="nav-link"></a>
                                                </li>
                                                
                                                <li class="nav-item"><a href="#" class="nav-link"></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-7 col-sm-6 col-xs-12">
                                        <div class="breadcome-heading ">
                                            <form role="search" class="sr-input-func">
                                                <input type="text" placeholder="Search..." class="search-int form-control">
                                                <a href="#"><i class="fa fa-search"></i></a>
                                            </form>
                                        </div>
                                    </div>
                                    
                                    <div class="col-lg-5 col-md-6  col-xs-12">
                                        <div class="header-right-info">
                                            <ul class="nav navbar-nav mai-top-nav header-right-menu">                                    
                                                <li class="nav-item nav-setting-open">
                                                    <a href="" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
															<img src="${context}/resources/img/product/pro4.jpg" alt="" />
															<span class="admin-name">${pageContext.request.userPrincipal.name}</span>
															<i class="fa fa-angle-down edu-icon edu-down-arrow"></i>
														</a>
                                                    <ul role="menu" class="dropdown-header-top author-log dropdown-menu animated zoomIn">

                                                        <li><a href="${context}/profile"><span class="edu-icon edu-user-rounded author-log-ic"></span>My Profile</a>
                                                        </li>
                                                        <c:if test="${pageContext.request.userPrincipal.name != null}">
													        <form id="logoutForm" method="POST" action="${context}/logout">
													            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
													        </form>
													
													   		<li><a onclick="document.forms['logoutForm'].submit()"><span class="edu-icon edu-locked author-log-ic"></span>Log Out</a>
                                                        	</li>
													    </c:if>
                                
                                                        
                                                    </ul>
                                                </li>
                                                
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            
           
        <div class="courses-area mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
                        <div class="sparkline8-list mt-b-30">
                            <div class="sparkline8-hd">
                                <div class="main-sparkline8-hd">
                                    <h1>Edit information</h1>
                                </div>
                            </div>
                             
                            <div class="sparkline8-graph">
                                <div class="basic-login-form-ad">
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="basic-login-inner">
                                                <form:form method="PUT" action="${context}/profileUpdate" modelAttribute="userProfile"  class="form-signup" >
                                                 
                                                <div class="form-group col-lg-6">
                                                    <p>FirstName </p> 
                                                    <spring:bind path="firstname">
										            	 
										                <div class="form-group ${status.error ? 'has-error' : ''}">
										                    <form:input type="text" path="firstname" class="form-control" placeholder="FirstName"
										                                autofocus="true" ></form:input>
										                    <form:errors path="firstname"></form:errors>
										                </div>
                                                    </spring:bind>
                                                    </div>
                                                    <div class="form-group col-lg-6">
                                                        <p> LastName</p> 
										            <spring:bind path="lastname">
										                <div class="form-group ${status.error ? 'has-error' : ''}">
										                    <form:input type="text" path="lastname" class="form-control" placeholder="LastName"
										                                autofocus="true"></form:input>
										                    <form:errors path="lastname"></form:errors>
										                </div>
                                                    </spring:bind>
                                                    </div>
                                                    
                                                    <div class="form-group col-lg-12">
                                                        <p>National code </p>
										            <spring:bind path="nationalCode">
										                <div class="form-group ${status.error ? 'has-error' : ''}">
										                    <form:input type="text" path="nationalCode" class="form-control" placeholder="National Code"
										                                autofocus="true"></form:input>
										                    <form:errors path="nationalCode"></form:errors>
										                </div>
                                                    </spring:bind>
                                                    </div>
                                                    <div class="form-group col-lg-12">
                                                    <label for="ContactPoint">ContactPoint</label>
                                                    
													<spring:bind path="ContactPointsEmail">
												                <div class="form-group ${status.error ? 'has-error' : ''}">
												                    <form:input type="email" class="form-control"  placeholder="Email"
												                                 path="ContactPointsEmail" name="email"></form:input>
												               		
												                </div>
												 				<form:errors cssClass="has-error" path="ContactPointsEmail"></form:errors>
												   </spring:bind>
                                                </div>
                                                <div class="form-group col-lg-6">
                                                    <p>Phone Number </p>
												   <spring:bind path="ContactPointsPhoneNumber">
												                <div class="form-group ${status.error ? 'has-error' : ''}">
												                    <form:input type="text" class="form-control"  placeholder="Phone Number"
												                                 path="ContactPointsPhoneNumber" ></form:input>
												               		
												                </div>
												 				<form:errors cssClass="has-error" path="ContactPointsPhoneNumber"></form:errors>
												   </spring:bind>
                                                    </div>
                                                    <div class="form-group col-lg-6">
                                                        <p>Father's phone Number </p>
                                                    <spring:bind path="ContactPointsFatherPhoneNumber">
												                <div class="form-group ${status.error ? 'has-error' : ''}">
												                    <form:input type="text" class="form-control"  placeholder="Your father's phoneNumber"
												                                 path="ContactPointsFatherPhoneNumber" ></form:input>
												               		
												                </div>
												 				<form:errors cssClass="has-error" path="ContactPointsFatherPhoneNumber"></form:errors>
												   </spring:bind>
                                                    </div>
                                                    <div class="form-group col-lg-12">
                                                    <p>Address</p>
												   <spring:bind path="ContactPointsAddress">
												                <div class="form-group ${status.error ? 'has-error' : ''}">
												                    <form:input type="text" class="form-control"  placeholder="Address"
												                                 path="ContactPointsAddress" ></form:input>
												               		
												                </div>
												 				<form:errors cssClass="has-error" path="ContactPointsAddress"></form:errors>
												   </spring:bind>
                                                    </div>
												   
										            <div class="form-group col-lg-6">
													 <spring:bind path="birthDate">
										            
										                    
										                    <label for="birthDate">BirthDate</label>            
										                    <div class="form-group ${status.error ? 'has-error' : ''}">
										    				
										                        <form:input type="date" path="birthDate" autofocus="true" class="form-control" id="birthDate"/>
										                     
															</div>
										                    <form:errors cssClass="has-error" path="birthDate"></form:errors>
										
                                                    </spring:bind>
                                                     </div>
                                                     <div class="form-group col-lg-6">
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
                                                    </div>
                                                    <div class="form-group col-lg-6">
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
                                                    <div class="form-group col-lg-7">    
										            <spring:bind path="username">
										            <label for="username">User name</label>
										                <div class="form-group ${status.error ? 'has-error' : ''}">
										                    <form:input type="text" path="username" class="form-control" placeholder="Username"
										                                autofocus="true"></form:input>
										                    <form:errors path="username"></form:errors>
										                </div>
										            </spring:bind>
                                                    </div>
                                                    <div class="form-group col-lg-6 hidden">
										            <spring:bind path="password">
										                <div class="form-group ${status.error ? 'has-error' : ''}">
										                    <form:input type="password" path="password" class="form-control" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"></form:input>
										                    <form:errors path="password"></form:errors>
										                </div>
										            </spring:bind>
                                                      </div>
                                                      <div class="form-group col-lg-6 hidden">
										            <spring:bind path="passwordConfirm">
										                <div class="form-group ${status.error ? 'has-error' : ''}">
										                    <form:input type="password" path="passwordConfirm" class="form-contro"
										                                placeholder="Confirm your password"></form:input>
										                    <form:errors path="passwordConfirm"></form:errors>
										                </div>
										            </spring:bind>
                                                      </div>
                                                      <div class="form-group col-lg-12">
										        	<spring:bind path="bestFriendName">
										        	<label for="bestFriendName">security question</label>
										                <div class="form-group ${status.error ? 'has-error' : ''}">
										                    <form:input type="text" path="bestFriendName" class="form-control" placeholder="Your Best Friend Name"
										                                autofocus="true"></form:input>
										                    <form:errors path="bestFriendName"></form:errors>
										                </div>
										            </spring:bind>
                                                      </div>
                                                    <div class="login-btn-inner">
                                                        <div class="inline-remember-me">
                                                            <button class="btn btn-sm btn-primary pull-right login-submit-cs" type="submit">save</button>
                                                        </div>
                                                    </div>
                                                </form:form>
                                            </div>
                                        </div>
                                       
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    
        </div>
        
        <div class="footer-copyright-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer-copy-right">
                            <p>Workshop Management</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div></div>

      <!-- jquery
		============================================ -->
        <script src="${context}/resources/js/vendor/jquery-1.12.4.min.js"></script>
        <!-- bootstrap JS
            ============================================ -->
        <script src="${context}/resources/js/bootstrap.min.js"></script>
        <!-- wow JS
            ============================================ -->
        <script src="${context}/resources/js/wow.min.js"></script>
        <!-- price-slider JS
            ============================================ -->
        <script src="${context}/resources/js/jquery-price-slider.js"></script>
        <!-- meanmenu JS
            ============================================ -->
        <script src="${context}/resources/js/jquery.meanmenu.js"></script>
        <!-- owl.carousel JS
            ============================================ -->
        <script src="${context}/resources/js/owl.carousel.min.js"></script>
        <!-- sticky JS
            ============================================ -->
        <script src="${context}/resources/js/jquery.sticky.js"></script>
        <!-- scrollUp JS
            ============================================ -->
        <script src="${context}/resources/js/jquery.scrollUp.min.js"></script>
        <!-- counterup JS
            ============================================ -->
        <script src="${context}/resources/js/counterup/jquery.counterup.min.js"></script>
        <script src="${context}/resources/js/counterup/waypoints.min.js"></script>
        <script src="${context}/resources/js/counterup/counterup-active.js"></script>
        <!-- mCustomScrollbar JS
            ============================================ -->
        <script src="${context}/resources/js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="${context}/resources/js/scrollbar/mCustomScrollbar-active.js"></script>
        <!-- metisMenu JS
            ============================================ -->
        <script src="${context}/resources/js/metisMenu/metisMenu.min.js"></script>
        <script src="${context}/resources/js/metisMenu/metisMenu-active.js"></script>
        <!-- morrisjs JS
            ============================================ -->
        <script src="${context}/resources/js/morrisjs/raphael-min.js"></script>
        <script src="${context}/resources/js/morrisjs/morris.js"></script>
        <script src="${context}/resources/js/morrisjs/morris-active.js"></script>
        <!-- morrisjs JS
            ============================================ -->
        <script src="${context}/resources/js/sparkline/jquery.sparkline.min.js"></script>
        <script src="${context}/resources/js/sparkline/jquery.charts-sparkline.js"></script>
        <script src="${context}/resources/js/sparkline/sparkline-active.js"></script>
        <!-- calendar JS
            ============================================ -->
        <script src="${context}/resources/js/calendar/moment.min.js"></script>
        <script src="${context}/resources/js/calendar/fullcalendar.min.js"></script>
        <script src="${context}/resources/js/calendar/fullcalendar-active.js"></script>
        <!-- plugins JS
            ============================================ -->
        <script src="${context}/resources/js/plugins.js"></script>
        <!-- main JS
            ============================================ -->
        <script src="${context}/resources/js/main.js"></script>
        <!-- tawk chat JS
            ============================================ -->
        
    </body>
</html>
