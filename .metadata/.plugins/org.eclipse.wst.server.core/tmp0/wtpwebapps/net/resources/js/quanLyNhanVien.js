
var qlnv = angular.module("qlnvApp", ['ui.bootstrap']);

qlnv.factory('quanLyNhanVienModel',[ function(){
    var model = [];

    model.form = {
       search : {
           maNv : '',
           tenNv : ''
       },
       listNhanVien : [],
       listShow : []
    }

    model.hidden = {
        isShow : false,
        pageNum : 0,
        pageSelect : 0
    }

    return model;
}]);

qlnv.controller("quanLyNhanVienCtrl",  ['$scope', '$http', '$filter','$rootScope','quanLyNhanVienModel', '$uibModal',
    function($scope, $http, $filter, $rootScope, quanLyNhanVienModel, $uibModal){

    $scope.model = quanLyNhanVienModel;

    $scope.getPage = function(list){
        var pageTemp = 0;
        for(var i = 0 ; i < list.length; i++){
            if(i % 5 == 0){
                pageTemp++;
            }
        }
        $scope.model.hidden.pageNum = pageTemp;
    }

    $scope.showList = function (page){
        var listTemp = [];
        var startPage = 5 * page;
        var destPage = (5 * page) + 5 > $scope.model.form.listNhanVien.length ? $scope.model.form.listNhanVien.length : (5 * page) + 5;
        for(var i = startPage; i < destPage; i++){
            listTemp.push($scope.model.form.listNhanVien[i]);
        }
        $scope.model.hidden.pageSelect = page;
        $scope.model.form.listShow = listTemp;
    }

    $scope.test = function (){
        for(var i =0 ; i < 17 ; i++){
            var param = {
                maNv : i,
                tenNv : 'test',
                role : 'system',
                taiKhoan : 'test01',
                matKhau : '23'
            };
            $scope.model.form.listNhanVien.push(param);
        }
        $scope.getPage($scope.model.form.listNhanVien);
        $scope.showList(0);
    };

    $scope.test();

    $scope.search = function (param){
        var httpParams = {
                headers: {'X-CSRF-TOKEN': $('meta[name=_csrf]').attr("content")},
                method: 'POST',
                url: 'login/dangNhap',
                data: angular.copy(param)
            };

    };

    $scope.range = function(n) {
        return new Array(n);
    };

    $scope.open = function(row) {
        if(row == ''){
            row = {
                tenNv : '',
                role : 'employ',
                taiKhoan : '',
                matKhau : '',
                matKhauNhap : ''};
        }
        var modalInstance =  $uibModal.open({
            templateUrl: "quanLyNhanVienControl",
            controller: "quanLyNhanVienControlCtrl",
            resolve: {
                data: row
             },
            size: ''
          });
          modalInstance.result.then(function(response){
              if(response == "Ok"){
                  var modalInstance =  $uibModal.open({
                      templateUrl: "ThanhCong",
                      controller: "ThanhCongCtrl",
                      size: '',
                    });
              }
          });

        };

}]);

qlnv.factory('quanLyNhanVienControlModel',[ function(){
    var model = [];

    model.form = {
       control : {
           tenNv : '',
           role : 'employ',
           taiKhoan : '',
           matKhau : '',
           matKhauNhap : ''
       }
    }
    model.hidden = {
        isShow : false
    }

    return model;
}]);

qlnv.controller('quanLyNhanVienControlCtrl', function($scope, $uibModalInstance, quanLyNhanVienControlModel, data) {

    $scope.model = quanLyNhanVienControlModel;

    $scope.ok = function(){
      if($scope.check()){
          $scope.model.hidden.isShow = true;
          return;
      }
      $scope.model.hidden.isShow = false;
      $uibModalInstance.close("Ok");
      $scope.clear();
    }

    $scope.cancel = function(){
      $uibModalInstance.dismiss();
    }

    $scope.check = function(){
        if(StringUtils.isEmpty($scope.model.form.control.tenNv) || StringUtils.isEmpty($scope.model.form.control.taiKhoan)
                || StringUtils.isEmpty($scope.model.form.control.matKhau) || StringUtils.isEmpty($scope.model.form.control.matKhauNhap)){
            return true;
        }
        if($scope.model.form.control.matKhau != $scope.model.form.control.matKhauNhap){
            return true;
        }
        return false;
    };

    $scope.init = function(){
        $scope.model.form.control = data;
        $scope.model.form.control.matKhauNhap = data.matKhau;
    }

    $scope.init();

  });

qlnv.controller('ThanhCongCtrl', function() {

    $scope.cancel = function(){
      $uibModalInstance.dismiss();
    }

  });
