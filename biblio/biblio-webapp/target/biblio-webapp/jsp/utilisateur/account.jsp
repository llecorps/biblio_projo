<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
    <%@ include file="../_include/head.jsp" %>
</head>
<body>
    <%@ include file="../_include/header.jsp" %>


<div class="container" >

    <h2><s:text name="nav.account" /></h2>

    <s:if test="#session.utilisateur">
        <s:a action="logout">Vous êtes déja connectés !</s:a>
    </s:if>
    <s:else>

        <s:form action="account">

            <s:textfield name="utilisateur.pseudo" label="Pseudo" requiredLabel="true" />

            <s:submit value="OK"/>

        </s:form>
    </s:else>


</div>
</body>
</html>