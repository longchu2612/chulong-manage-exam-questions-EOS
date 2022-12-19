<%-- 
    Document   : forms_multichoice_one
    Created on : Dec 9, 2022, 9:15:18 PM
    Author     : asus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


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
            [type=text],
            [type=email],
            [type=url],
            select,
            textarea {
                display: block;
                padding: .5rem;
                background: transparent;
                vertical-align: middle;
                width: 100%;
                max-width: 100%;
                border: 1px solid #cdcdcd;
                border-radius: 4px;
                font-size: .95rem;
            }
            [type=text]:focus,
            [type=email]:focus,
            [type=url]:focus,
            select:focus,
            textarea:focus {
                outline: none;
                border: 1px solid #1E6BD6;
            }
            select {
                -webkit-appearance: none;
                -moz-appearance: none;
                background: url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABIAAAAJCAYAAAA/33wPAAAAvklEQVQoFY2QMQqEMBBFv7ERa/EMXkGw11K8QbDXzuN4BHv7QO6ifUgj7v4UAdlVM8Uwf+b9YZJISnlqrfEUZVlinucnBGKaJgghbiHOyLyFKIoCbdvecpyReYvo/Ma2bajrGtbaC58kCdZ1RZ7nl/4/4d5EsO/7nzl7IUtodBexMMagaRrs+06JLMvcNWmaOv2W/C/TMAyD58dxROgSmvxFFMdxoOs6lliWBXEcuzokXRbRoJRyvqqqQvye+QDMDz1D6yuj9wAAAABJRU5ErkJggg==) 100% no-repeat;
                line-height: 1
            }
            label {
                font-weight: 600;
                font-size: .9rem;
                display: block;
                margin: .5rem 0;
            }
            html {
                -webkit-font-smoothing: antialiased;
                padding: 1rem;
            }
            .container {
                max-width: 600px;
                margin: 0 auto;
                padding: 0 1rem;
            }
            [type=submit] {
                display: inline-block;
                vertical-align: middle;
                white-space: nowrap;
                cursor: pointer;
                margin: .25rem 0;
                padding: .5rem 1rem;
                border: 1px solid #1E6BD6;
                border-radius: 18px;
                background: #1E6BD6;
                color: white;
                font-weight: 600;
                text-decoration: none;
                font-family: sans-serif;
                font-size: .95rem;
            }
            .button-10 {
                display: inline-block;
                flex-direction: column;
                align-items: center;
                padding: 6px 14px;
                font-family: -apple-system, BlinkMacSystemFont, 'Roboto', sans-serif;
                border-radius: 6px;
                border: none;

                color: #fff;
                background: linear-gradient(180deg, #4B91F7 0%, #367AF6 100%);
                background-origin: border-box;
                box-shadow: 0px 0.5px 1.5px rgba(54, 122, 246, 0.25), inset 0px 0.8px 0px -0.25px rgba(255, 255, 255, 0.2);
                user-select: none;
                -webkit-user-select: none;
                touch-action: manipulation;
                margin-bottom: 1px;
            }

            .button-10:focus {
                box-shadow: inset 0px 0.8px 0px -0.25px rgba(255, 255, 255, 0.2), 0px 0.5px 1.5px rgba(54, 122, 246, 0.25), 0px 0px 0px 3.5px rgba(58, 108, 217, 0.5);
                outline: 0;
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
                <div class="container">
                    <form action="add_mutichoice" method="post">
                        <h1>Multichoice Question(One Answer)</h1>
                        <!--                        <label for="name"></label>
                                                <input type="text" id="name" placeholder="Name">
                                                <label for="email">Email</label>
                                                <input type="email" id="email" placeholder="Email Address">-->
                        <span style="color: red;font-size:25px">${message}</span>
                        <label for="gender">Mã Môn</label>
                        <select name="subject">
                            <c:forEach items="${list}" var="item">
                                <option <c:if test="${question.getMaMon() == item.getMaMon()}">
                                    selected="selected"
                                </c:if> 
                                    value="${item.getMaMon()}">${item.getMaMon()}</option>
                            </c:forEach>
                        </select>
                        <label>Độ khó</label>
                        <select name="level"> 
                            <option <c:if test="${question.getDoKho() == '1'}">
                                    selected="selected"
                                </c:if> value="1">Dễ</option>
                            <option <c:if test="${question.getDoKho() == '2'}">
                                    selected="selected"
                                </c:if> value="2">Trung Bình</option>
                            <option <c:if test="${question.getDoKho() == '3'}">
                                    selected="selected"
                                </c:if> value="3">Khó</option>
                        </select>
                        <label for="question">Question</label>
                        <textarea id="message" name="question" cols="30" rows="5" placeholder="Message">${question.getNoiDung()}</textarea>
                        <label for="gender">Answer :</label>
                        <input type="text" value="${first_answer}" name="first_answer"/>
                        <label>Answer:</label>
                        <input type="text" value="${second_answer}" name="second_answer"/>
                        <label for="question">Answer:</label>
                        <input type="text" value="${third_answer}" name="third_answer"/>
                        <label for="question">True Answer:</label>
                        <input type="text" value="${true_answer}" name="true_answer"/>
                        <input class="button-10" name="button" type="submit" value="Submit">

                    </form>
                </div>











            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
        <script src="../js/spur.js"></script>
    </body>

</html>