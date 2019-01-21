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

    <h2><s:property value="channel.name" /></h2>
<div class="row">
    <div class="col-2">
        <s:a action="action_ajax" class="btn btn-primary">
            <s:param name="channel"><s:property value="name" /></s:param>
           <s:text name="nav.refresh" />
        </s:a>

     </div>
    <div id="channel-messages">
        <s:iterator value="listMessage">
            <div class="media mb-3 message">
                <i class="far fa-user fa-2x m-1 mr-3"></i>
                <div class="media-body">
                    <h5 class="mt-1 mb-0 user"><s:property value="author.pseudo" /></h5>
                    <span class="text"><s:property value="message" /></span>
                </div>
            </div>
        </s:iterator>
    </div>
</div>
</div>
</div>
<s:debug />
</body>
</html>
