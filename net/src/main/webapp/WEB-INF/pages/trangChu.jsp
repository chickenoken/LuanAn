<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js"></script>
<script type="text/javascript" src="<c:url value="/resources/js/login.js" />"></script>
<style>
div.hidden
{
   display: none
}
</style>
   <head>
      <title>Login-Net</title>
      <%@include file="/WEB-INF/views/Header.jsp"%>
  </head>
   <body>
   <div style="height : 445px; width : 90%">
     <div id="page" class="hidden">
       <div ng-app="myApp" ng-controller="myCtrl">
        <a href="<c:url value='/quanLyNhanVien/downloadExcel' />">Download This File (located inside project)</a>

       </div>
     </div>
   </div>
      <%@include file="/WEB-INF/views/Footer.jsp"%>
   </body>
      <script type="text/javascript">
     $(document).ready(function() {
         $("div#page").removeClass("hidden");
     });
   </script>
</html>
