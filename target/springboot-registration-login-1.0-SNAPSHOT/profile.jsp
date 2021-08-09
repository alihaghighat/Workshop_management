<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>home</title>
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
                                           <span class=" fas fa-school"></span>
                                           
                                           <span class="mini-click-non">Role</span>
                                        </a>
                                    <ul class="submenu-angle" aria-expanded="true">
                                        <li><a title="Dashboard v.1" href="${context}/home"><span class="mini-sub-pro">adminstor</span></a></li>
                                    </ul>
                                </li>

                                <li class="">
                                    <a class="has-arrow" href="${context}/home">
                                           <span class=" fas fa-school"></span>
                                             <span class="mini-click-non">workshop</span>
                                        </a>
                                    <ul class="submenu-angle" aria-expanded="true">
                                        <li><a title="Dashboard v.1" href="${context}/home"><span class="mini-sub-pro">my work shop</span></a></li>
                                        <li><a title="Dashboard v.1" href="${context}/home"><span class="mini-sub-pro">all work shop</span></a></li>
                                        <li><a title="Dashboard v.1" href="${context}/home"><span class="mini-sub-pro">add new shop</span></a></li>
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
                                                <li class="nav-item"><a href="#" class="nav-link">Home</a>
                                                </li>
                                                <li class="nav-item"><a href="#" class="nav-link">About</a>
                                                </li>
                                                <li class="nav-item"><a href="#" class="nav-link"></a>
                                                </li>
                                                
                                                <li class="nav-item"><a href="#" class="nav-link"></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="col-lg-5 col-md-5 col-sm-12 col-xs-12">
                                        <div class="header-right-info">
                                            <ul class="nav navbar-nav mai-top-nav header-right-menu">
                                                
                                            
                                                
                                                <li class="nav-item">
                                                    <a href="#" data-toggle="dropdown" role="button" aria-expanded="false" class="nav-link dropdown-toggle">
															<img src="${context}/resources/img/product/pro4.jpg" alt="" />
															<span class="admin-name">${pageContext.request.userPrincipal.name}</span>
															<i class="fa fa-angle-down edu-icon edu-down-arrow"></i>
														</a>
                                                    <ul role="menu" class="dropdown-header-top author-log dropdown-menu animated zoomIn">

                                                        <li><a href="#"><span class="edu-icon edu-user-rounded author-log-ic"></span>My Profile</a>
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
            
            <div class="breadcome-area">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                            <div class="breadcome-list">
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="breadcome-heading">
                                            <form role="search" class="sr-input-func">
                                                <input type="text" placeholder="Search..." class="search-int form-control">
                                                <a href="#"><i class="fa fa-search"></i></a>
                                            </form>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <ul class="breadcome-menu">
                                            <li><a href="#">Home</a> <span class="bread-slash"></span>
                                            </li>
                                            
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
        <div class="courses-area mg-b-15">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-7 col-md-7 col-sm-7 col-xs-12">
                        <div class="sparkline8-list mt-b-30">
                            <div class="sparkline8-hd">
                                <div class="main-sparkline8-hd">
                                    <h1>personal information</h1>
                                </div>
                            </div>
                            <div class="sparkline8-graph">
                                <div class="basic-login-form-ad">
                                    <div class="row">
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                            <div class="basic-login-inner">
                                                <p>You can change your personal information</p>
                                                <form action="#">
                                                    <div class="form-group-inner">
                                                        <label>first name</label>
                                                        <input type="text" class="form-control" placeholder="first name" />
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>last name</label>
                                                        <input type="text" class="form-control" placeholder="last name" />
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>BirthDate</label>
                                                        <input type="date" path="" autofocus="" class="form-control" id=""/>
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>National code</label>
                                                        <input type="text" class="form-control" placeholder="National code" />
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>Nationaly</label>
                                                        <input type="text" class="form-control" placeholder="Nationaly" />
                                                    </div>
                                                    <div class="login-btn-inner">
                                                        <div class="inline-remember-me">
                                                            <button class="btn btn-sm btn-primary pull-right login-submit-cs" type="submit">save</button>
                                                            <label>
																	
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                            <div class="basic-login-inner">
                                                <h3 style="color: #ffff;"> ali</h3>
                                                <form action="#">
                                                    <div class="form-group-inner">
                                                        <label>Email</label>
                                                        <input type="email" class="form-control" placeholder="email" />
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>phone number</label>
                                                        <input type="text" class="form-control" placeholder="phone number" />
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>Address</label>
                                                        <input type="text" class="form-control" placeholder="Address" />
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>your,s father number</label>
                                                        <input type="text" class="form-control" placeholder="your,s father number" />
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <label>Gender</label>
                                                        <input type="text" class="form-control" placeholder="Gender" />
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
                        <div class="sparkline9-list responsive-mg-b-30">
                            
                            <div class="sparkline9-graph">
                                <div class="basic-login-form-ad">
                                    
                                    <div class="row">
                                        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                            <div class="basic-login-inner">
                                                <h3>User profile</h3>
                                                <p>change your userprofile</p>
                                                <form action="#">
                                                    <div class="form-group-inner">
                                                        <div class="row">
                                                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                                                <label class="login2">User</label>
                                                            </div>
                                                            <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                                                <input type="email" class="form-control" placeholder="Enter Email" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <div class="row">
                                                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                                                <label class="login2">Password</label>
                                                            </div>
                                                            <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                                                <input type="password" class="form-control" placeholder="password" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="form-group-inner">
                                                        <div class="row">
                                                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                                                <label class="login2">secuirty question</label>
                                                            </div>
                                                            <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                                                <input type="email" class="form-control" placeholder="your best firnds name" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                        <div class="dropzone-pro mg-tb-30">
                                                            <div id="dropzone1" class="multi-uploader-cs">
                                                                <label class="login2">profile pictur</label>
                                                                <form action="/upload" class="dropzone dropzone-custom needsclick" id="demo1-upload">
                                                                    <div class="dz-message needsclick download-custom">
                                                                        <i class="fa fa-download" aria-hidden="true"></i>
                                                                        <h2>Drop files here or click to upload.</h2>
                                                                        <p><span class="note needsclick">(This is just a demo dropzone. Selected files are <strong>not</strong> actually uploaded.)</span>
                                                                        </p>
                                                                    </div>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="login-btn-inner">
                                                        <div class="row">
                                                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
                                                            <div class="col-lg-8 col-md-8 col-sm-8 col-xs-12">
                                                                <div class="i-checks">
                                                                    <label>
																			
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="row">
                                                            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12"></div>
                                                           
                                                        </div>
                                                    </div>
                                                </form>
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
                            <p>Java lesson project</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

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
        <script src="${context}/resources/js/tawk-chat.js"></script>
    </body>
</html>
