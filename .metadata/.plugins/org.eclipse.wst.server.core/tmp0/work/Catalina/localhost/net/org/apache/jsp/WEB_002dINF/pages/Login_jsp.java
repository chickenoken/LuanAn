/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.88
 * Generated at: 2019-06-17 11:13:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/Header.jsp", Long.valueOf(1560769589733L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.7.8/angular.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("div.hidden\r\n");
      out.write("{\r\n");
      out.write("   display: none\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("   <head>\r\n");
      out.write("      <title>Login-Net</title>\r\n");
      out.write("      ");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f7(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f8(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f9(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"");
      if (_jspx_meth_c_005furl_005f10(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f11(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f12(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f13(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f14(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("div.hidden\r\n");
      out.write("{\r\n");
      out.write("   display: none\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<div ng-app=\"headerApp\" ng-controller=\"headerCtrl\" id=\"page\" class=\"hidden\">\r\n");
      out.write("\t<nav class=\"navbar navbar-inverse\">\r\n");
      out.write("\t  <div class=\"container-fluid\">\r\n");
      out.write("\t    <div class=\"navbar-header\">\r\n");
      out.write("\t      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t        <span class=\"icon-bar\"></span>\r\n");
      out.write("\t      </button>\r\n");
      out.write("\t      <a class=\"navbar-brand\" href=\"login\">Net</a>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("\t      <ul class=\"nav navbar-nav\">\r\n");
      out.write("\t        <li class=\"active\"><a href=\"trangChu\">Home</a></li>\r\n");
      out.write("\t        <li> <a href=\"DichVu\">Dịch Vụ</a></li>\r\n");
      out.write("\t        <li ng-if=\"model.hidden.isAdmin\"><a href=\"quanLyNhanVien\">Quản Lý Nhân Viên</a></li>\r\n");
      out.write("\t        <li ng-if=\"model.hidden.isAdmin\"><a href=\"quanLyDatPhong\">Đặt Phòng</a></li>\r\n");
      out.write("\t        <li ng-if=\"model.hidden.isAdmin\"><a href=\"yeuCau\">Yêu Cầu</a></li>\r\n");
      out.write("\t      </ul>\r\n");
      out.write("\t      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t        <li ng-if=\"!model.hidden.isSign\"><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>Đăng Ký</a></li>\r\n");
      out.write("          <li ng-if=\"model.hidden.isSign\"><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span>{{model.form.header.loginId}}</a></li>\r\n");
      out.write("\t        <li ng-if=\"!model.hidden.isSign\"><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span>Đăng Nhập</a></li>\r\n");
      out.write("\t        <li ng-if=\"model.hidden.isSign\"><a href=\"login\"><span class=\"glyphicon glyphicon-log-in\"></span> Đăng Xuất</a></li>\r\n");
      out.write("\t      </ul>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("     $(document).ready(function() {\r\n");
      out.write("         $(\"div#page\").removeClass(\"hidden\");\r\n");
      out.write("     });\r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("   <body>\r\n");
      out.write("   <div style=\"height : 445px; width : 90%\">\r\n");
      out.write("     <div id=\"page\" class=\"hidden\">\r\n");
      out.write("\t     <div id=\"login\" ng-app=\"myApp\" ng-controller=\"myCtrl\">\r\n");
      out.write("\t       <div class=\"row\" style=\"padding-top : 160px;\">\r\n");
      out.write("\t         <div class=\"col-md-offset-4 col-md-6\" ng-if=\"model.hidden.isShow\">\r\n");
      out.write("             <div class=\"alert alert-danger text-center\">\r\n");
      out.write("               <strong>Lỗi !</strong> Sai tên đăng nhập hoặc mật khẩu\r\n");
      out.write("             </div>\r\n");
      out.write("           </div>\r\n");
      out.write("\t         <div clas=\"form-group col-xs-5 col-md-7 col-lg-9 vcenter\" >\r\n");
      out.write("\t           <div class=\"col-md-offset-5 col-md-7\">\r\n");
      out.write("\t             <div class=\"col-md-2\"><label>Tài Khoản</label></div>\r\n");
      out.write("\t             <div class=\"col-md-10\"><input type=\"text\" ng-model=\"model.form.login.taiKhoan\" placeholder=\"Tên Đăng Nhập\" ></div>\r\n");
      out.write("\t           </div>\r\n");
      out.write("\t           <div class=\"col-md-offset-5 col-md-7 p-t-10\">\r\n");
      out.write("\t             <div class=\"col-md-2\"><label>Mật Khẩu</label></div>\r\n");
      out.write("\t             <div class=\"col-md-10\"><input type=\"password\" ng-model=\"model.form.login.matKhau\" placeholder=\"Mật Khẩu\" ></div>\r\n");
      out.write("\t           </div>\r\n");
      out.write("\t         </div>\r\n");
      out.write("\t         <div class=\"form-group col-md-offset-6 col-md-6 p-t-10 p-l-30\">\r\n");
      out.write("\t           <div class=\"col-md-2\">\r\n");
      out.write("\t             <button class=\"btn btn-primary\" ng-click=\"dangNhap()\">Đăng Nhập</button>\r\n");
      out.write("\t           </div>\r\n");
      out.write("\t           <div class=\"col-md-3 p-l-30\">\r\n");
      out.write("\t             <button class=\"btn btn-warning\" ng-click=\"troVe()\">Trở Về</button>\r\n");
      out.write("\t           </div>\r\n");
      out.write("\t         </div>\r\n");
      out.write("\t       </div>\r\n");
      out.write("\t     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("     </div>\r\n");
      out.write("   </body>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"");
      if (_jspx_meth_c_005furl_005f15(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("   <script type=\"text/javascript\">\r\n");
      out.write("\t   $(document).ready(function() {\r\n");
      out.write("\t       $(\"div#page\").removeClass(\"hidden\");\r\n");
      out.write("\t       angular.bootstrap(document.getElementById(\"login\"), ['myApp']);\r\n");
      out.write("\t   });\r\n");
      out.write("   </script>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/pages/Login.jsp(6,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/resources/js/login.js");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /WEB-INF/views/Header.jsp(1,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/resources/css/layout/my-styles.css");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /WEB-INF/views/Header.jsp(2,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/resources/css/layout/blue.css");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f3_reused = false;
    try {
      _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f3.setParent(null);
      // /WEB-INF/views/Header.jsp(3,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f3.setValue("/resources/css/layout/components-md.css");
      int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
      if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      _jspx_th_c_005furl_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f3, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f4_reused = false;
    try {
      _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f4.setParent(null);
      // /WEB-INF/views/Header.jsp(4,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f4.setValue("/resources/css/layout/exexlayout.css");
      int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
      if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      _jspx_th_c_005furl_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f4, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f5_reused = false;
    try {
      _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f5.setParent(null);
      // /WEB-INF/views/Header.jsp(5,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f5.setValue("/resources/css/layout/materialize-icon.css");
      int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
      if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      _jspx_th_c_005furl_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f5, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f6_reused = false;
    try {
      _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f6.setParent(null);
      // /WEB-INF/views/Header.jsp(6,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f6.setValue("/resources/css/layout/plugins-md.css");
      int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
      if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      _jspx_th_c_005furl_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f6, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f7_reused = false;
    try {
      _jspx_th_c_005furl_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f7.setParent(null);
      // /WEB-INF/views/Header.jsp(7,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f7.setValue("/resources/css/layout/vi.css");
      int _jspx_eval_c_005furl_005f7 = _jspx_th_c_005furl_005f7.doStartTag();
      if (_jspx_th_c_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f7);
      _jspx_th_c_005furl_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f7, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f8(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f8 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f8_reused = false;
    try {
      _jspx_th_c_005furl_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f8.setParent(null);
      // /WEB-INF/views/Header.jsp(8,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f8.setValue("/resources/css/layout/vendors.css");
      int _jspx_eval_c_005furl_005f8 = _jspx_th_c_005furl_005f8.doStartTag();
      if (_jspx_th_c_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f8);
      _jspx_th_c_005furl_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f8, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f8_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f9(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f9 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f9_reused = false;
    try {
      _jspx_th_c_005furl_005f9.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f9.setParent(null);
      // /WEB-INF/views/Header.jsp(9,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f9.setValue("/resources/css/layout/new-style.css");
      int _jspx_eval_c_005furl_005f9 = _jspx_th_c_005furl_005f9.doStartTag();
      if (_jspx_th_c_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f9);
      _jspx_th_c_005furl_005f9_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f9, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f9_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f10(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f10 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f10_reused = false;
    try {
      _jspx_th_c_005furl_005f10.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f10.setParent(null);
      // /WEB-INF/views/Header.jsp(10,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f10.setValue("/resources/css/layout/sms-bootstrap.css");
      int _jspx_eval_c_005furl_005f10 = _jspx_th_c_005furl_005f10.doStartTag();
      if (_jspx_th_c_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f10);
      _jspx_th_c_005furl_005f10_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f10, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f10_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f11(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f11 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f11_reused = false;
    try {
      _jspx_th_c_005furl_005f11.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f11.setParent(null);
      // /WEB-INF/views/Header.jsp(12,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f11.setValue("/resources/jsLib/jquery-3.4.0.min.js");
      int _jspx_eval_c_005furl_005f11 = _jspx_th_c_005furl_005f11.doStartTag();
      if (_jspx_th_c_005furl_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f11);
      _jspx_th_c_005furl_005f11_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f11, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f11_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f12(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f12 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f12_reused = false;
    try {
      _jspx_th_c_005furl_005f12.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f12.setParent(null);
      // /WEB-INF/views/Header.jsp(13,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f12.setValue("/resources/jsLib/ui-bootstrap-tpls-2.5.0.min.js");
      int _jspx_eval_c_005furl_005f12 = _jspx_th_c_005furl_005f12.doStartTag();
      if (_jspx_th_c_005furl_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f12);
      _jspx_th_c_005furl_005f12_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f12, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f12_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f13(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f13 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f13_reused = false;
    try {
      _jspx_th_c_005furl_005f13.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f13.setParent(null);
      // /WEB-INF/views/Header.jsp(14,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f13.setValue("/resources/jsLib/ui-bootstrap-tpls-2.5.0.min.js");
      int _jspx_eval_c_005furl_005f13 = _jspx_th_c_005furl_005f13.doStartTag();
      if (_jspx_th_c_005furl_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f13);
      _jspx_th_c_005furl_005f13_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f13, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f13_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f14(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f14 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f14_reused = false;
    try {
      _jspx_th_c_005furl_005f14.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f14.setParent(null);
      // /WEB-INF/views/Header.jsp(15,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f14.setValue("/resources/js/header.js");
      int _jspx_eval_c_005furl_005f14 = _jspx_th_c_005furl_005f14.doStartTag();
      if (_jspx_th_c_005furl_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f14);
      _jspx_th_c_005furl_005f14_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f14, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f14_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f15(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f15 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f15_reused = false;
    try {
      _jspx_th_c_005furl_005f15.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f15.setParent(null);
      // /WEB-INF/pages/Login.jsp(51,39) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f15.setValue("/resources/jsLib/StringUtils.js");
      int _jspx_eval_c_005furl_005f15 = _jspx_th_c_005furl_005f15.doStartTag();
      if (_jspx_th_c_005furl_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f15);
      _jspx_th_c_005furl_005f15_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f15, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f15_reused);
    }
    return false;
  }
}
