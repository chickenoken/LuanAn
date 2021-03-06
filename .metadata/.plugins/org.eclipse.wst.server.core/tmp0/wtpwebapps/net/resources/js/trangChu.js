
var app = angular.module("trangChuApp", []);

'use strict'
app.factory('trangChuModel',[ function(){
    var model = [];

    model.form = {
       login : {
           taiKhoan : '',
           matKhau : ''
       }
    }

    return model;
}]);

app.controller("trangChuCtrl",  ['$scope', '$http', '$filter','$rootScope','trangChuModel',
    function($scope, $http, $filter, $rootScope, trangChuModel){

    $scope.model = trangChuModel;

    $scope.download = function(){
        var httpParams = {
                headers: {'X-CSRF-TOKEN': $('meta[name=_csrf]').attr("content")},
                method: 'POST',
                url: 'quanLyNhanVien/downloadExcel'
            };
        $http(httpParams).then(function (okResult){
             },function (error){
             }
         );
     }

}]);