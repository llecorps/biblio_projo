<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="./_include/head.jsp" %>
</head>

<body>
    <%@ include file="./_include/header.jsp" %>


<div class="container" >
<div class="container" >

    <h2><s:text name="title.login" /></h2>

    <s:if test="#session.utilisateur">

        <li>Login : <s:property value="utilisateur.login" /></li>
        <li>Email : <s:property value="utilisateur.email" /></li>
        <li>Adress : <s:property value="utilisateur.adress" /></li>
        <li>Phone : <s:property value="utilisateur.phone" /></li>
        <li>Location : <s:property value="location.livreId" /> Date: <s:property value="location.expiredate" /> </li>
        <li>Livre : <s:property value="livre.titre" /> Description: <s:property value="livre.description" /> </li>
        <li>Auteur : <s:property value="auteur.prenom" /> <s:property value="auteur.nom" /> </li>

    </s:if>

    <s:else>
    <s:form action="login" class="form-group">

        <s:textfield name="login" label="Identifiant" requiredLabel="true" />
        <s:password name="password" label="Mot de passe" requiredLabel="true" id="passFieldId" />

        <s:submit value="Connexion"/>
    </s:form>

    </s:else>
</div>

    <%@ include file="./_include/scripts.jsp" %>
</body>
</html>