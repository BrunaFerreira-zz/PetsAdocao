<%-- 
    Document   : pets
    Created on : 03/05/2016, 21:52:18
    Author     : Bruna
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" type="text/css" rel="stylesheet">
        <title>Pets</title>
    </head>
    <body>
        <body>
         
        <c:forEach items="${pets}" var="pet">
            <article>
                <div id="direita">
                <img src="${pet.photo}"/>
                </div>
            <div class="esquerda">
                <p id="nomePet">${pet.name}</p>
                <p>${pet.description}</p>
                <p>${pet.age}</p>
                <p>${pet.race}</p>
                <p>${pet.city}</p>
                <p>${pet.state.name}</p>
                <p>${pet.country.name}</p>
            </div>
        </article>
        </c:forEach>
    </body>
    </body>
</html>
