<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="modal-header">
  <h3>Thêm nhân Viên</h3>
</div>
<div class="modal-body">
  <div class="row m-t-10">
    <div class="form-group">
      <div class="col-md-4"><span>Tên Nhân Viên</span></div>
      <div class="col-md-8"><input type="text" ng-model="model.form.control.tenNv" style="width : 100%"></div>
    </div>
  </div>
  <div class="row m-t-10">
    <div class="form-group">
      <div class="col-md-4"><span>Role</span></div>
      <div class="col-md-8">
        <div class="radio" >
          <label class="col-md-4"><input type="radio" name="role" value="admin" ng-model="model.form.control.role">admin</label>
          <label class="col-md-4"><input type="radio" name="role" value="system" ng-model="model.form.control.role">system</label>
          <label class="col-md-4"><input type="radio" name="role" value="employ" ng-model="model.form.control.role">employ</label>
        </div>
      </div>
    </div>
  </div>
    <div class="row m-t-10">
    <div class="form-group">
      <div class="col-md-4"><span>Tài Khoản</span></div>
      <div class="col-md-8">
        <input type="text" ng-model="model.form.control.taiKhoan" style="width : 100%">
      </div>
    </div>
  </div>
  <div class="row m-t-10">
    <div class="form-group">
      <div class="col-md-4"><span>Mật Khẩu</span></div>
      <div class="col-md-8">
        <input type="password" ng-model="model.form.control.matKhau" style="width : 100%">
      </div>
    </div>
  </div>
  <div class="row m-t-10">
    <div class="form-group">
      <div class="col-md-4"><span>Nhập Lại Mật Khẩu</span></div>
      <div class="col-md-8">
        <input type="password" ng-model="model.form.control.matKhauNhap" style="width : 100%">
      </div>
    </div>
  </div>

  <div class="row m-t-10">
	  <div class="col-md-12" ng-if="model.hidden.isShow">
	    <div class="alert alert-danger text-center">
	      <strong>Lỗi !</strong> Nhập đủ thông tin hoặc mật khẩu không trùng
	    </div>
	  </div>
  </div>

</div>
<div class="modal-footer">
    <button class="btn btn-primary" ng-click="ok()">OK</button>
    <button class="btn btn-warning" ng-click="cancel()">Cancel</button>
</div>