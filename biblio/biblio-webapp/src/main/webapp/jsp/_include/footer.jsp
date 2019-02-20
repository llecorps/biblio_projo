<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>

<div class="container text-center">
    <hr />
    <div class="row">
        <div class="col-lg-12">
            <div class="col-md-3">
                <ul class="nav nav-pills nav-stacked">
                    <li><a href="#">About us</a></li>

                </ul>
            </div>
            <div class="col-md-3">
                <ul class="nav nav-pills nav-stacked">
                    <li>
                        <s:a action="index">
                            <s:param name="request_locale">en</s:param>
                            [English]
                        </s:a>
                    </li>

                </ul>
            </div>
            <div class="col-md-3">
                <ul class="nav nav-pills nav-stacked">
                    <li>
                        <s:a action="index">
                            <s:param name="request_locale">fr</s:param>
                            [Français]
                        </s:a>
                    </li>

                </ul>
            </div>

        </div>
    </div>
    <hr>

</div>
