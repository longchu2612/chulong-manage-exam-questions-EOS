<%-- 
    Document   : AddQuetionMultichoice.jsp
    Created on : Dec 13, 2022, 1:00:07 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- 
    Document   : forms_multichoice_one
    Created on : Dec 9, 2022, 9:15:18 PM
    Author     : asus
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



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
                    <a href="index.html" class="spur-logo"><i class="fas fa-bolt"></i> <span>Spur</span></a>
                </header>
                <nav class="dash-nav-list">
                    <a href="index.html" class="dash-nav-item">
                        <i class="fas fa-home"></i> Dashboard </a>
                    <div class="dash-nav-dropdown">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-chart-bar"></i>Question</a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="forms.jsp" class="dash-nav-dropdown-item">Add Question</a>
                        </div>
                    </div>
                    <div class="dash-nav-dropdown  show">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-cube"></i>PRJ301</a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="cards.html" class="dash-nav-dropdown-item">Cards</a>
                            <a href="forms.html" class="dash-nav-dropdown-item">Forms</a>
                            <div class="dash-nav-dropdown ">
                                <a href="#" class="dash-nav-dropdown-item dash-nav-dropdown-toggle">Icons</a>
                                <div class="dash-nav-dropdown-menu">
                                    <a href="icons.html" class="dash-nav-dropdown-item">Solid Icons</a>
                                    <a href="icons.html#regular-icons" class="dash-nav-dropdown-item">Regular Icons</a>
                                    <a href="icons.html#brand-icons" class="dash-nav-dropdown-item">Brand Icons</a>
                                </div>
                            </div>
                            <a href="stats.html" class="dash-nav-dropdown-item">Stats</a>
                            <a href="tables.html" class="dash-nav-dropdown-item">Tables</a>
                            <a href="typography.html" class="dash-nav-dropdown-item">Typography</a>
                            <a href="userinterface.html" class="dash-nav-dropdown-item">User Interface</a>
                        </div>
                    </div>
                    <div class="dash-nav-dropdown">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-file"></i> Layouts </a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="blank.html" class="dash-nav-dropdown-item">Blank</a>
                            <a href="content.html" class="dash-nav-dropdown-item">Content</a>
                            <a href="login.html" class="dash-nav-dropdown-item">Log in</a>
                            <a href="signup.html" class="dash-nav-dropdown-item">Sign up</a>
                        </div>
                    </div>
                    <div class="dash-nav-dropdown">
                        <a href="#!" class="dash-nav-item dash-nav-dropdown-toggle">
                            <i class="fas fa-info"></i> About </a>
                        <div class="dash-nav-dropdown-menu">
                            <a href="https://github.com/HackerThemes/spur-template" target="_blank" class="dash-nav-dropdown-item">GitHub</a>
                            <a href="http://hackerthemes.com" target="_blank" class="dash-nav-dropdown-item">HackerThemes</a>
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
                                <a class="dropdown-item" href="login.html">Logout</a>
                            </div>
                        </div>
                    </div>
                </header>
                <div class="container">
                    <form action="add_mutichoice" method="post">
                        <h1>Add Answer</h1>
                        <!--                        <label for="name"></label>
                                                <input type="text" id="name" placeholder="Name">
                                                <label for="email">Email</label>
                                                <input type="email" id="email" placeholder="Email Address">-->
                        <span style="color: red;font-size:25px"></span>
                        <label for="gender">Answer :</label>
                        <input type="text" name="first_answer"/>
                        <label>Answer:</label>
                        <input type="text" name="second_answer"/>
                        <label for="question">Answer:</label>
                        <input type="text" name="third_answer"/>
                        <label for="question">True Answer:</label>
                         <input type="text" name="true_answer"/>
                        <input class="button-10" type="submit" value="Submit">
                        
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
