/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.88
 * Generated at: 2019-06-17 10:46:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class quanLyNhanVienControl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal-header\">\r\n");
      out.write("  <h3>Thêm nhân Viên</h3>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal-body\">\r\n");
      out.write("  <div class=\"row m-t-10\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <div class=\"col-md-4\"><span>Tên Nhân Viên</span></div>\r\n");
      out.write("      <div class=\"col-md-8\"><input type=\"text\" ng-model=\"model.form.control.tenNv\" style=\"width : 100%\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row m-t-10\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <div class=\"col-md-4\"><span>Role</span></div>\r\n");
      out.write("      <div class=\"col-md-8\">\r\n");
      out.write("        <div class=\"radio\" >\r\n");
      out.write("          <label class=\"col-md-4\"><input type=\"radio\" name=\"role\" value=\"admin\" ng-model=\"model.form.control.role\">admin</label>\r\n");
      out.write("          <label class=\"col-md-4\"><input type=\"radio\" name=\"role\" value=\"system\" ng-model=\"model.form.control.role\">system</label>\r\n");
      out.write("          <label class=\"col-md-4\"><input type=\"radio\" name=\"role\" value=\"employ\" ng-model=\"model.form.control.role\">employ</label>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    <div class=\"row m-t-10\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <div class=\"col-md-4\"><span>Tài Khoản</span></div>\r\n");
      out.write("      <div class=\"col-md-8\">\r\n");
      out.write("        <input type=\"text\" ng-model=\"model.form.control.taiKhoan\" style=\"width : 100%\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row m-t-10\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <div class=\"col-md-4\"><span>Mật Khẩu</span></div>\r\n");
      out.write("      <div class=\"col-md-8\">\r\n");
      out.write("        <input type=\"password\" ng-model=\"model.form.control.matKhau\" style=\"width : 100%\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row m-t-10\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("      <div class=\"col-md-4\"><span>Nhập Lại Mật Khẩu</span></div>\r\n");
      out.write("      <div class=\"col-md-8\">\r\n");
      out.write("        <input type=\"password\" ng-model=\"model.form.control.matKhauNhap\" style=\"width : 100%\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"row m-t-10\">\r\n");
      out.write("\t  <div class=\"col-md-12\" ng-if=\"model.hidden.isShow\">\r\n");
      out.write("\t    <div class=\"alert alert-danger text-center\">\r\n");
      out.write("\t      <strong>Lỗi !</strong> Nhập đủ thông tin hoặc mật khẩu không trùng\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal-footer\">\r\n");
      out.write("    <button class=\"btn btn-primary\" ng-click=\"ok()\">OK</button>\r\n");
      out.write("    <button class=\"btn btn-warning\" ng-click=\"cancel()\">Cancel</button>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
