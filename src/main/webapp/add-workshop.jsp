<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Add a workshop|Workshop</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
       
  
         <style id="clock-animations"></style>
        
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
        <link rel="stylesheet" href="${context}/resources/css/time/time.css">
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
       <!-- Static Table Start -->
      
      <!-- Basic Form Start -->
      <div class="basic-form-area mg-b-15">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="sparkline8-list mt-b-30">
                        <div class="sparkline8-hd">
                            
                        </div>
                        <div class="sparkline8-graph">
                            <div class="basic-login-form-ad">
                               
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="basic-login-inner">
                                            <h3>add workshop</h3>
                                            <p>.</p>
                                            <p>Register User can add workshop here</p>
                                            <form method="GET" action="${content}/add-new-workshop">
                                                <div class="form-group-inner " >
                                                    <label>Location</label>
                                                    <input type="text" name="location" class="form-control" placeholder="Enter address" />
                                                </div>
                                    
                                                <div class="form-group-inner">
                                                    <label>Price</label>
                                                    <input type="number" name="price" class="form-control" placeholder="price" />
                                                </div>
                                           
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                        <div class="basic-login-inner">
                                            <h3></h3>
                                            <p></p>
                                            <div class="form-group-inner">
                                                <label>Begin date</label>
                                                <input type="date" name="beginDate" class="form-control" placeholder="begin date" />
                                            </div>
                                            <div class="form-group-inner">
                                                <label>End date</label>
                                                <input type="date" name="endDate" class="form-control" placeholder="end date" />
                                            </div>
                                            <div class="form-group-inner">
                                                <label>Organizer username</label>
                                                <input type="text" name="organizerUsername" class="form-control" placeholder="organizer username" />
                                            </div>
                                            <div class="form-group-inner">
                                                <label>Subject</label>
                                                <input type="text" name="subject" class="form-control" placeholder="course subject" />
                                            </div>
                                        </div>
                                    </div>
                                        
                                                <div class="login-btn-inner">
                                                    <div class="inline-remember-me">
                                                        <button class="btn btn-sm btn-primary pull-right login-submit-cs" type="submit">add </button>
                                                        <label>
                                                              
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
    <div class="data-table-area mg-b-15">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="sparkline13-list">
                        <div class="sparkline13-hd">
                            <div class="main-sparkline13-hd">
                                <h1>All courses</h1>
                            </div>
                        </div>
                        <div class="sparkline13-graph">
                            <div class="datatable-dashv1-list custom-datatable-overright">
                                <div class="add-product">
                                    <a href="${context}/add-course">Add course</a>
                                </div>
                                <table id="table" data-toggle="table" data-pagination="true" data-search="true" data-show-columns="true" data-show-pagination-switch="true" data-show-refresh="true" data-key-events="true" data-show-toggle="true" data-resizable="true" data-cookie="true"
                                    data-cookie-id-table="saveId" data-show-export="true" data-click-to-select="true" data-toolbar="#toolbar">
                                    <thead>
                                        <th></th>
                                            <th data-field="id">No</th>
                                            <th >subject </th>
                                            <th ></th>
                                            <th  ></th>
                                            <th ></th>
                                            <th>info</th>
                                            <th ></th>
                                            <th></th>
                                            
                                            <th ></th>
                                    </thead>
                                    <a href="#">
                                    <tbody>
                                        
                                        <c:forEach items="${all_courses}" var="course">
                                        <a href="#">
                                        <tr>
                                            <td></td>
                                            <td>${course.getId()}</td>
                                            <td><a href="#">
                                            ${course.getSubject()} 
                                            </a></td>
                                            <td>
                                               
                                                  
                                            </td>
                                            <td><a href="#">
                                                           
                                                </a>

                                            </td>

                                            <td >
                                                
                                            </td>
                                            <td>
                                                  
                                            </td>
                                            <td>
                                               ${course.getInfo()}
                                            </td>
                                            <td>
                                               
                                            </td>
                                            <td>


                                            </td>
                                        </tr>
                                    </c:forEach>
                                                                                 
                                    </tbody>
                                </a>
                                </table>
                               
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </div>
    <div class="data-table-area mg-b-15">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="sparkline13-list">
                        <div class="sparkline13-hd">
                            <div class="main-sparkline13-hd">
                                <h1>All user</h1>
                            </div>
                        </div>
                        <div class="sparkline13-graph">
                            <div class="datatable-dashv1-list custom-datatable-overright">
                                
                                <table id="table" data-toggle="table" data-pagination="true" data-search="true" data-show-columns="true" data-show-pagination-switch="true" data-show-refresh="true" data-key-events="true" data-show-toggle="true" data-resizable="true" data-cookie="true"
                                    data-cookie-id-table="saveId" data-show-export="true" data-click-to-select="true" data-toolbar="#toolbar">
                                    <thead>
                                        <th></th>
                                            <th data-field="id">No</th>
                                            <th >Firstname </th>
                                            <th > Last name</th>
                                            <th  >Username</th>
                                            <th >Phone number</th>
                                            <th >Gender</th>
                                            <th>Email</th>
                                            
                                            <th >See</th>
                                    </thead>
                                    <a href="#">
                                    <tbody>

                                     <c:forEach items="${all_users}" var="user">
                                        <a href="#">
                                        <tr>
                                            <td></td>
                                            <td>${user.getId()}</td>
                                            <td><a href="#">
                                            ${user.getFirstname()} 
                                            </a></td>
                                            <td>
                                               ${user.getLastname()}
                                                  
                                            </td>
                                            <td><a href="#">
                                                ${user.getUsername()}
                                                </a>

                                            </td>

                                            <td >
                                                ${user.getContactPointsPhoneNumber()}
                                            </td>
                                            <td>
                                                ${user.getGender()}
                                            </td>
                                            <td>
                                               ${user.getContactPointsEmail()}
                                            </td>
                                            
                                            <td>
                                                <a href="${context}/administrator-see-all-roles?id=${user.getId()}" style="color: #000000;;"><button data-toggle="tooltip" title="see"  class="pd-setting-ed"><i class="fa fa-eye" aria-hidden="true"></i></button></a>

                                            </td>
                                        </tr>
                                        </a>
                                           </c:forEach>                                      
                                    </tbody>
                                
                                </table>
                               
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
    <!-- mCustomScrollbar JS
        ============================================ -->
    <script src="${context}/resources/js/scrollbar/jquery.mCustomScrollbar.concat.min.js"></script>
    <script src="${context}/resources/js/scrollbar/mCustomScrollbar-active.js"></script>
    <!-- metisMenu JS
        ============================================ -->
    <script src="${context}/resources/js/metisMenu/metisMenu.min.js"></script>
    <script src="${context}/resources/js/metisMenu/metisMenu-active.js"></script>
    <!-- data table JS
        ============================================ -->
    <script src="${context}/resources/js/data-table/bootstrap-table.js"></script>
    <script src="${context}/resources/js/data-table/tableExport.js"></script>
    <script src="${context}/resources/js/data-table/data-table-active.js"></script>
    <script src="${context}/resources/js/data-table/bootstrap-table-editable.js"></script>
    <script src="${context}/resources/js/data-table/bootstrap-editable.js"></script>
    <script src="${context}/resources/js/data-table/bootstrap-table-resizable.js"></script>
    <script src="${context}/resources/js/data-table/colResizable-1.5.source.js"></script>
    <script src="${context}/resources/js/data-table/bootstrap-table-export.js"></script>
    <!--  editable JS
        ============================================ -->
    <script src="${context}/resources/js/editable/jquery.mockjax.js"></script>
    <script src="${context}/resources/js/editable/mock-active.js"></script>
    <script src="${context}/resources/js/editable/select2.js"></script>
    <script src="${context}/resources/js/editable/moment.min.js"></script>
    <script src="${context}/resources/js/editable/bootstrap-datetimepicker.js"></script>
    <script src="${context}/resources/js/editable/bootstrap-editable.js"></script>
    <script src="${context}/resources/js/editable/xediable-active.js"></script>
    <!-- Chart JS
        ============================================ -->
    <script src="${context}/resources/js/chart/jquery.peity.min.js"></script>
    <script src="${context}/resources/js/peity/peity-active.js"></script>
    <!-- tab JS
        ============================================ -->
    <script src="${context}/resources/js/tab.js"></script>
    <!-- plugins JS
        ============================================ -->
    <script src="${context}/resources/js/plugins.js"></script>
    <!-- main JS
        ============================================ -->
    <script src="${context}/resources/js/main.js"></script>
</body>
</html>
