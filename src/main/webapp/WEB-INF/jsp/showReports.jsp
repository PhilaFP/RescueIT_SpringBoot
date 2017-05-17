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
    <div><img src="http://www.wopr.tarnow.pl/wp-content/uploads/2012/12/WOPR.png"></div>
</header>
<nav id="navMain">
    <ul>
        <li>Jak pomagać?</li>
        <li>Mapa AED</li>
        <li>Rejestracja</li>
        <li>Ustawienia</li>
        <li>Pomoc</li>
    </ul>
</nav>

<div id="TitleList">
   <p>Zgłoszenia w systemie:</p>
</div>

<section id = "SectionList">
   <c:forEach items="${reports}" var="report">
        <ul>
           <li> ${report.id} ${report.message} ${report.reportTime} ${report.idUser} ${report.idLifeguard}</li>
        </ul>
    </c:forEach>
</section>


</body>
</html>