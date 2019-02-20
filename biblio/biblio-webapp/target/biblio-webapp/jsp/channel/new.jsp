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

        <h2><s:text name="nav.newChannel" /></h2>

        <s:form action="channel_new">
            <s:textfield name="channel.name" label="Nom du Channel" requiredLabel="true" />
            <s:submit value="OK"/>
        </s:form>

</div>
</body>
</html>