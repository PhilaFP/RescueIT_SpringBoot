<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
  <meta charset="utf-8">
  <script type="text/javascript" src='<c:url value="/js/script.js"/>'></script>
  <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css" ></c:url>" >
  
</head>

<body>
  <header>
    <div onclick="myFun3()" id="divmenu"><img src="<c:url value="/css/menu.png" />"></div>
    <div><a href = "http://localhost:8081/main"><img src="http://www.wopr.tarnow.pl/wp-content/uploads/2012/12/WOPR.png"></a></div>
  </header>
<nav id="navMain">
  <ul>
    <li><a href = "http://localhost:8081/show"> Przyjęte zgłoszenia</a> </li>
    <li><a>Jak pomagać?</a></li>
    <li><a>Mapa AED</a></li>
    <li><a>Rejestracja</a></li>
    <li><a>Ustawienia</a></li>
    <li><a>Pomoc</a></li>
  </ul>
</nav>

<section id="sectionMainContent2" class="show">
  <div id="divFormTitle">Podaj dane do logownaia:</div>
    
    <form:form method="POST" modelAttribute="newLogin"> <br>

      <label for="username">Login:</label><br>
      <form:input type="text" path="username"  name="username"  label="username" /> <br>
	  <form:errors path="username" /> <br>
	  
      <label for="password">Hasło:</label><br>
      <form:input type="text" path="password"  name="password"  label="password" /> <br>
      <form:errors path="password" /> <br>
      
      <input type="submit" value="Wyślij">

    </form:form>
</section>

</body>
</html>

