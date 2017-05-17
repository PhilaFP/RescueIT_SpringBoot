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
        <li><a href = "http://localhost:8081/register">Rejestracja</a></li>
        <li><a>Ustawienia</a></li>
        <li><a>Pomoc</a></li>
    </ul>
</nav>


<section id="SectionTable">
    <div id="TitleTable">
        Zgłoszenia w systemie:
    </div>
    <table>
        <tr>
            <th>id</th>
            <th>Typ</th>
            <th>Data</th>
            <th>Zgłaszający</th>
            <th>Ratownik</th>
        </tr>
    <c:forEach items="${reports}" var="report">
            <tr>
                <td>${report.id}</td> <td> ${report.message}</td> <td>${report.reportTime}</td> <td>${report.idUser}</td> <td>${report.idLifeguard}</td>
            </tr>
    </c:forEach>
    </table>
</section>


</body>
</html>