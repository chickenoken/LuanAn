<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<script type="text/javascript" src="<c:url value="/resources/jsLib/angular.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/quanLyNhanVien.js" />"></script>
<style>
div.hidden {
  display: none
}
</style>
<head>
<title>QuanLyNhanVien-Net</title>
<%@include file="/WEB-INF/views/Header.jsp"%>
</head>
<body style="background-color: #80ced6">
  <div id="qlnv" class="EXEX-Content-Body" ng-controller="quanLyNhanVienCtrl" ng-app="qlnvApp" >
    <div id="page" class="EXEXPageContent hidden" style="height : 580px; width : 100%">
      <div class="container" style="height : 100%">
        <div class="portlet light" style="height : 100%">
          <div class="portlet-body">

          </div>
        </div>
      </div>
    </div>
  </div>
</body>
<script type="text/javascript">
     $(document).ready(function() {
         $("div#page").removeClass("hidden");
         angular.bootstrap(document.getElementById("qlnv"), ['qlnvApp']);
     });
   </script>
<script type="text/javascript" src="<c:url value="/resources/jsLib/StringUtils.js" />"></script>
</html>

