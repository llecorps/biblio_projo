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


        <ul class="list-group list-group-flush">
        <s:iterator value="listEmprunt">
        <li class="list-group-item d-flex justify-content-between align-items-center">
            <s:property value="nom"/>
            <s:property value="titre"/>
            <s:property value="description"/>
            <s:property value="genre"/>
            <s:property value="expiredate"/>
            <s:submit value="Prolongation" class="btn btn-outline-success"/>
        </li>
        </s:iterator>
        </ul>

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
    <%@ include file="./_include/footer.jsp" %>
</body>
</html>