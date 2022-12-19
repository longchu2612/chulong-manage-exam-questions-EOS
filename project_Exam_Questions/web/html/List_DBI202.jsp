<%-- 
    Document   : List_DBI202
    Created on : Dec 13, 2022, 9:29:49 PM
    Author     : asus
--%>


<%-- 
    Document   : tables
    Created on : Dec 7, 2022, 11:04:27 PM
    Author     : asus
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>

<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.4.1/css/all.css" integrity="sha384-5sAR7xN1Nv6T6+dT2mhtzEpVJvfS3NScPQTrOxhwjIuvcA67KV2R5Jz6kr4abQsz" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Nunito:400,600|Open+Sans:400,600,700" rel="stylesheet">
        <link rel="stylesheet" href="../css/spur.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.bundle.min.js"></script>
        <script src="../js/chart-js-config.js"></script>
        <title>Spur - A Bootstrap Admin Template</title>
        <style>
            .pagination {
                display: inline-block;
            }

            .pagination a {
                color: black;
                float: left;
                padding: 8px 16px;
                text-decoration: none;
                border: 1px solid #ddd;
            }

            .pagination a.active {
                background-color: #4CAF50;
                color: white;
                border: 1px solid #4CAF50;
            }

            .pagination a:hover:not(.active) {
                background-color: #ddd;
            }

            .pagination a:first-child {
                border-top-left-radius: 5px;
                border-bottom-left-radius: 5px;
            }

            .pagination a:last-child {
                border-top-right-radius: 5px;
                border-bottom-right-radius: 5px;
            }
        </style>
    </head>

    <body>
        <div class="dash">
            <div class="dash-nav dash-nav-dark">
                <header>
                    <a href="#!" class="menu-toggle">
                        <i class="fas fa-bars"></i>
                    </a>
                    <a href="" class="spur-logo"><i class="fas fa-bolt"></i> <span>Spur</span></a>
                </header>
                <nav class="dash-nav-list">
                    <a href="" class="dash-nav-item">
                        <i class="fas fa-home"></i> Dashboard </a>
                    <div class="dash-nav-dropdown">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-chart-bar"></i>Question</a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="forms.jsp" class="dash-nav-dropdown-item">Add Question</a>
                        </div>
                    </div>
                    <div class="dash-nav-dropdown">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-cube"></i>DBI202</a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="../html/list_DBI202" class="dash-nav-dropdown-item">List DBI202</a>



                        </div>
                    </div>
                    <div class="dash-nav-dropdown">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-file"></i>PRN211</a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="../html/list_PRN211" class="dash-nav-dropdown-item">List PRN211</a>

                        </div>
                    </div>
                    <div class="dash-nav-dropdown">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-info"></i> PRJ301 </a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="../html/list_PRJ301"  class="dash-nav-dropdown-item">List PRJ301</a>

                        </div>
                    </div>
                </nav>
            </div>
            <div class="dash-app">
                <header class="dash-toolbar">
                    <a href="#!" class="menu-toggle">
                        <i class="fas fa-bars"></i>
                    </a>
                    <a href="#!" class="searchbox-toggle">
                        <i class="fas fa-search"></i>
                    </a>
                    <form class="searchbox" action="#!">
                        <a href="#!" class="searchbox-toggle"> <i class="fas fa-arrow-left"></i> </a>
                        <button type="submit" class="searchbox-submit"> <i class="fas fa-search"></i> </button>
                        <input type="text" class="searchbox-input" placeholder="type to search">
                    </form>
                    <div class="tools">
                        <a href="https://github.com/HackerThemes/spur-template" target="_blank" class="tools-item">
                            <i class="fab fa-github"></i>
                        </a>
                        <a href="#!" class="tools-item">
                            <i class="fas fa-bell"></i>
                            <i class="tools-item-count">4</i>
                        </a>
                        <div class="dropdown tools-item">
                            <a href="#" class="" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-user"></i>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenu1">
                                <a class="dropdown-item" href="#!">Profile</a>
                                <a class="dropdown-item" href="../index.html">Logout</a>
                            </div>
                        </div>
                    </div>
                </header>
                <main class="dash-content">
                    <div class="container-fluid">
                        <h1 class="dash-title">DBI202</h1>



                        <div class="card spur-card">
                            <div class="card-header">
                                <div class="spur-card-icon">
                                    <i class="fas fa-table"></i>
                                </div>
                                <div class="spur-card-title"></div>
                            </div>
                            <div class="card-body ">
                                <table class="table table-hover table-in-card">
                                    <thead>
                                        <tr>

                                            <th>Nội Dung</th>
                                            <th>Đáp Án</th>


                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${list}" var="item">
                                            <tr>

                                                <th>${item.getNoiDung()}</th>
                                                <th>
                                                    <c:if test="${fn:contains(item.getHinhThucCh(), '1')}">
                                                        <input type="radio" name="name"/>${first_answer}<br>
                                                        <input type="radio" name="name"/>${second_answer}<br>
                                                        <input type="radio" name="name"/>${third_answer}<br>
                                                        <input type="radio" name="name"/>${true_answer}<br>
                                                       
                                                    </c:if>
                                                    <c:if test="${fn:contains(item.getHinhThucCh(), '2')}">
                                                        <input type="radio" name="name_1"/>${first_answer}<br>
                                                        <input type="radio" name="name_2"/>${second_answer}<br>
                                                        <input type="radio" name="name_3"/>${third_answer}<br>
                                                        <input type="radio" name="name_4"/>${four_answer}<br>
                                                        
                                                    </c:if>   
                                                    <c:if test="${fn:contains(item.getHinhThucCh(), '3')}">
                                                        <input type="text" name=""/>
                                                     
                                                    </c:if>   
                                                    <c:if test="${fn:contains(item.getHinhThucCh(), '4')}">
                                                        <input type="radio" name="check"/>Yes<br>
                                                        <input type="radio" name="check "/>No<br>
                                                      
                                                       
                                                    </c:if> 
                                                    
                                                </th>

                                            </tr>
                                        </c:forEach>   
                                    </tbody>
                                </table>

                            </div>

                        </div>
                        <div class="pagination">
                            <c:forEach begin="1" end="${endPage}" var="i">
                                <a href="list_DBI202?index=${i}">${i}</a>
                            </c:forEach>
                        </div>

                    </div>
                </main>
            </div>

        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
        <script src="../js/spur.js"></script>
    </body>

</html>

