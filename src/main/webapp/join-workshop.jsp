<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="context" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>participant</title>
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
        
      <div class="basic-form-area mg-b-15">
        <div class="container-fluid">
            <div class="basic-form-area mg-b-15">
                <div class="container-fluid">
                    
                    <div class="row">
                        <div class="col-lg-812 col-md-12 col-sm-12 col-xs-12">
                            <div class="sparkline10-list mt-b-30">
                                <div class="sparkline10-hd">
                                    <div class="main-sparkline10-hd">
                                        <h1>join workshop <span class="basic-ds-n"></span></h1>
                                    </div>
                                </div>
                                <div class="sparkline10-graph">
                                    <div class="basic-login-form-ad">
                                        <div class="row">
                                            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                                                <div class="basic-login-inner inline-basic-form">
                                                    
                                                        <div class="form-group-inner">
                                                            <div class="row">
                                                                <form method="GET" action="/join-new-workshop">
                                                                
                                                                    <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12">
                                                                        <input type="number" name="id" class="form-control basic-ele-mg-b-10 responsive-mg-b-10" placeholder="Enter No" />
                                                                    </div>
                                                                    
                                                                    Number of Installments : 
                                                                   <select name="install_number" >

                                                                         <option value="1">1</option>
                                                                         <option value="2">2</option>
                                                                         <option value="3">3</option>
                                                                         <option value="4">4</option>
                                                                         <option value="5">5</option>
                                                                         <option value="6">6</option>
  
                                                                    </select>

                                                         

                                                                <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                                                                    <div class="login-btn-inner">
                                                                        <div class="row">
                                                                            
                                                                            <div class="col-lg-6 col-md-5 col-sm-5 col-xs-12">
                                                                                <div class="login-horizental lg-hz-mg"><button class="btn btn-sm btn-primary login-submit-cs" type="submit">add</button></div>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>    
                                                                </form>

                                                                
                                                                
                                                                <div class="col-lg-5 col-md-5 col-sm-5 col-xs-12">
                                                                   

                                                                </div>
                                                                
                                                                
                                                            </div>
                                                        </div>
                                            
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
       <div class="data-table-area mg-b-15">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="sparkline13-list">
                        <div class="sparkline13-hd">
                            <div class="main-sparkline13-hd">
                                <h1>All workshop</h1>
                            </div>
                        </div>
                        <div class="sparkline13-graph">
                            <div class="datatable-dashv1-list custom-datatable-overright">
                                
                                <table id="table" data-toggle="table" data-pagination="true" data-search="true" data-show-columns="true" data-show-pagination-switch="true" data-show-refresh="true" data-key-events="true" data-show-toggle="true" data-resizable="true" data-cookie="true"
                                    data-cookie-id-table="saveId" data-show-export="true" data-click-to-select="true" data-toolbar="#toolbar">
                                    <thead>
                                        <th></th>
                                            <th data-field="id">No</th>
                                            <th >         </th>
                                            <th > Subject</th>
                                            <th  >       </th>
                                            <th >  Info  </th>
                                            <th >       </th>
                                            <th>    time  </th>
                                            
                                            <th ></th>
                                            <th > see pre requier</th>
                                    </thead>
                                    <a href="#">
                                    <tbody>

                                     <c:forEach items="${workshops}" var="workshop" varStatus="myCount">
                                        <a href="#">
                                        <tr>
                                            <td></td>
                                            <td>${workshop.getId()}</td>
                                            <td><a href="#">
                                                   
                                            </a></td>
                                            <td>
                                               ${workshop.getWorkshop().getSubject()}
                                                  
                                            </td>
                                            <td><a href="#">
                                                
                                                </a>

                                            </td>

                                            <td >
                                                ${workshop.getWorkshop().getInfo()}
                                            </td>
                                            <td>
                                                ${dates.get(myCount.index)}
                                            </td>
                                            <td>
                                                                
                                            </td>
                                            
                                            <td>
                                                    

                                            </td>
                                            <td>
                                                <a href="${context}/see-preRequired?id=${workshop.getWorkshop().getId()}" style="color: #000000;;"><button data-toggle="tooltip" title="see"  class="pd-setting-ed"><i class="fa fa-eye" aria-hidden="true"></i></button></a>   

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
                        <p>Java lesson project</p>
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
