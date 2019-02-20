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

    <h2><s:text name="title.login" /></h2>



    <s:form action="login" class="form-group">

        <s:textfield name="login" label="Identifiant" requiredLabel="true" />
        <s:password name="password" label="Mot de passe" requiredLabel="true" id="passFieldId" />

        <s:submit value="Connexion"/>
    </s:form>

</div>

    <%@ include file="./_include/scripts.jsp" %>
</body>
</html>