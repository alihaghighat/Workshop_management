<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>organizer</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        
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
        <!-- colender2

            ============================================ -->
        <link rel="stylesheet" href="${context}/resources/css/colonder.css">
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
       
        
        <div class="traffic-analysis-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu">
                            <i class="fa fa-clone"></i>
                            <div class="social-edu-ctn">
                                <h3>Forms</h3>
                                <p>You can build the form and complete the form.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu twitter-cl res-mg-t-30 table-mg-t-pro-n">
                            <i class="fa fa-user-circle"></i>
                            <div class="social-edu-ctn">
                                <h3>grader</h3>
                                <p>Access to all Grader and Grader appointments</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu linkedin-cl res-mg-t-30 res-tablet-mg-t-30 dk-res-t-pro-30">
                            <i class="fa fa-book"></i>
                            <div class="social-edu-ctn">
                                <h3>workshops</h3>
                                <p>Grouping of graders and participants</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-sm-6 col-xs-12">
                        <div class="social-media-edu youtube-cl res-mg-t-30 res-tablet-mg-t-30 dk-res-t-pro-30">
                            <i class="fa fa-credit-card"></i>
                            <div class="social-edu-ctn">
                                <h3>payments</h3>
                                <p>See all payments and confirm and reject</p>
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
        <script src="${context}/resources/js/colender2/colender2.js"></script>
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
