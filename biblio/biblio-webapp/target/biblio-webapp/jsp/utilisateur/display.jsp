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
                        Nom:&nbsp<s:property value="nom"/>
                        Titre&nbsp<s:property value="titre"/>
                        Description:&nbsp<s:property value="description"/>
                        Genre:&nbsp<s:property value="genre"/>
                        Date d'expiration:&nbsp<s:property value="expiredate"/>


                        <s:if test="prolongation=='true'">
                        <s:a action="prolonger" class="btn btn-outline-success">Prolonger
                            <s:param name="id" value="id" />
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
            <s:form action="login" class="form-group">

                <s:textfield name="login" label="Identifiant" requiredLabel="true" />
                <s:password name="password" label="Mot de passe" requiredLabel="true" id="passFieldId" />

                <s:submit value="Connexion"/>
            </s:form>

        </s:else>
    </div>

    <%@ include file="../_include/scripts.jsp" %>
    <%@ include file="../_include/footer.jsp" %>
</body>
</html>