var headerApp = angular.module("headerApp", []);

headerApp.factory('headerModel',[ function(){
    var model = [];

    model.form = {
       header : {
           loginId : ''
       }
    }

    model.hidden = {
        isAdmin : false,
        isSign : false
    }

    return model;
}]);

headerApp.controller("headerCtrl",  ['$scope', '$http', '$filter','$rootScope','headerModel',
    function($scope, $http, $filter, $rootScope, headerModel){

    $scope.model = headerModel;

    $scope.init = function(){
        var param = {
                taiKhoan : 'chicuong'
        };
        sessionStorage.setItem("session", JSON.stringify(param));
       var session = angular.fromJson(sessionStorage.getItem("session"));
       if(!StringUtils.isEmpty(session)){
           $scope.model.form.header.loginId = session.taiKhoan;
           $scope.model.hidden.isAdmin = true;
           $scope.model.hidden.isSign = true;
       }
    };

    $scope.init();

}]);