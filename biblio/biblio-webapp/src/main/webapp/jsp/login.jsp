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

            <s:if test="prolongation=='true'">
                <s:a action="prolonger" class="btn btn-outline-success">Prolonger
                    <s:param name="id" value="livre.id" />
                </s:a>
            </s:if>
            <s:else>
                <span class="badge-danger">Pas de prolongation possible</span>
            </s:else>
        </li>
        </s:iterator>
        </ul>


    </s:if>

    <s:else>

    <div class="container">
        <div id="login-row" class="row justify-content-center align-items-center">
            <div id="login-column" class="col-md-6">
                <div class="box">
                    <div class="shape1"></div>
                    <div class="shape2"></div>
                    <div class="shape3"></div>
                    <div class="shape4"></div>
                    <div class="shape5"></div>
                    <div class="shape6"></div>
                    <div class="shape7"></div>
                    <div class="float">

    <s:form action="login" class="form-group">

        <s:textfield name="login" label="Identifiant" requiredLabel="true" class="form-control"/>
        <s:password name="password" label="Mot de passe" requiredLabel="true" id="passFieldId" class="form-control" />

        <s:submit value="Connexion" class="btn btn-info btn-md"/>
    </s:form>

                    </div>
                </div>
            </div>
        </div>
    </div>
    </s:else>
</div>

    <%@ include file="./_include/scripts.jsp" %>
    <%@ include file="./_include/footer.jsp" %>
</body>
</html>