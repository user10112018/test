/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2018-11-29 04:13:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.36.jar", Long.valueOf(1541049519481L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-suzuki/test/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MyProject/WEB-INF/lib/struts2-core-2.3.36.jar!/META-INF/struts-tags.tld", Long.valueOf(1537588232000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/style01.css\">\r\n");
      out.write("\r\n");
      out.write("<!--   上へ戻るボタン -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!--   これがないとscriptファイルを外部に置いても作動しない -->\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Index</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("hr.hor1 {\r\n");
      out.write("color: maroon;\r\n");
      out.write("}\r\n");
      out.write("hr.hor2 {\r\n");
      out.write("color: indigo;\r\n");
      out.write("}\r\n");
      out.write("hr.hor3 {\r\n");
      out.write("font-size: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- ============== ココカラ =============== -->\r\n");
      out.write("\r\n");
      out.write("<!-- スクリプトファイル指定 -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"./javascript/script.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- ==== header ===== -->\r\n");
      out.write("<header>\r\n");
      out.write("\r\n");
      out.write("<div id=\"logo\">ＭｙＰｒｏｊｅｃｔ</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"menu\">\r\n");
      out.write("\r\n");
      out.write("<ul>\r\n");
      out.write("   <li>ＴＯＰ</li>\r\n");
      out.write("   <li>menuＡ</li>\r\n");
      out.write("   <li>menuＢ</li>\r\n");
      out.write("   <li>menuＣ</li>\r\n");
      out.write("</ul>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<!-- ==== main ===== -->\r\n");
      out.write("\r\n");
      out.write("<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"main-container\">\r\n");
      out.write("\r\n");
      out.write("<p class=\"name\">■ テーブル</p>\r\n");
      out.write("<table border=\"1\">\r\n");
      out.write("     <tr><th colspan=\"2\">項目と内容</th></tr>\r\n");
      out.write("     <tr><td>項目①</td><td>中身①</td></tr>\r\n");
      out.write("     <tr><td rowspan=\"2\">行の結合</td><td>中身② 文字数多目にする。</td></tr>\r\n");
      out.write("     <tr><td>中身②－2</td></tr>\r\n");
      out.write("     <tr><td>項目①</td><td>中身③</td></tr>\r\n");
      out.write("</table>\r\n");
      out.write("<br>\r\n");
      out.write("<p class=\"ref\">参考</p>\r\n");
      out.write("<a href=\"https://techacademy.jp/magazine/9428\">https://techacademy.jp/magazine/9428</a>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<p class=\"name\">■ 修飾</p>\r\n");
      out.write("<br>\r\n");
      out.write("<p>この文章の下に<span style=\"background:#008080;color:aqua;\">水平線</span>が入ります</p>\r\n");
      out.write("<!-- 水平線を入れたいときには<hr>タグ -->\r\n");
      out.write("<hr>\r\n");
      out.write("<p>この文章の上に<span style=\"background:#008080;color:aqua;\">水平線</span>が入ります</p>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p>水平線に装飾を試みる</p>\r\n");
      out.write("\r\n");
      out.write("<hr class=\"hor1\">\r\n");
      out.write("<hr class=\"hor2\">\r\n");
      out.write("<hr class=\"hor3\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<p class=\"ref\">参考</p>\r\n");
      out.write("<a href=\"https://coliss.com/articles/build-websites/operation/css/css-snippets-for-horizontal-rules.html\">ここのはスゴイ</a>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p class=\"name\">■ jQuery</p>\r\n");
      out.write("\r\n");
      out.write("<a href=\"jquery.jsp\">sample</a>\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<p class=\"name\">■ レイアウトサンプル</p>\r\n");
      out.write("\r\n");
      out.write("<a href=\"2columns.jsp\">２カラムレイアウト</a>\r\n");
      out.write("<br>\r\n");
      out.write("<a href=\"3columns.jsp\">３カラムレイアウト</a>\r\n");
      out.write("\r\n");
      out.write("<br><br>\r\n");
      out.write("★ 中央寄せと検索すると高確率でHITするflexboxを使用したversion<br>\r\n");
      out.write("<a href=\"2columns_flexbox.jsp\">２カラムレイアウト(flexbox)</a>\r\n");
      out.write("<br>\r\n");
      out.write("<a href=\"3columns_flexbox.jsp\">３カラムレイアウト(flexbox)</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<p class=\"name\">■ 参考文献</p>\r\n");
      out.write("\r\n");
      out.write("<a href=\"links.jsp\">links</a>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("https://peacepopo.net/ec-netshop-jquery-demo\r\n");
      out.write("<br>\r\n");
      out.write("https://peacepopo.net/ec-netshop-css-javascript-demo\r\n");
      out.write("<br>\r\n");
      out.write("https://www.nxworld.net/tips/ec-convenient-iquery-snippets-plugins.html\r\n");
      out.write("<br>\r\n");
      out.write("https://techracho.bpsinc.jp/hachi8833/2016_10_04/26662\r\n");
      out.write("<br>\r\n");
      out.write("http://placehold.jp\r\n");
      out.write("<br>\r\n");
      out.write("https://app.codegrid.net/entry/2017-flexbox-tips-1\r\n");
      out.write("<br>\r\n");
      out.write("https://webdesignday.jp/inspiration/technique/css/4175/\r\n");
      out.write("<br>\r\n");
      out.write("http://taneppa.net/box-sizing/\r\n");
      out.write("<br>\r\n");
      out.write("http://webst8.com/blog/html-major-basic-tag/\r\n");
      out.write("<br>\r\n");
      out.write("http://webst8.com/blog/css-selector-priority/\r\n");
      out.write("<br>\r\n");
      out.write("http://webst8.com/blog/css-major-basic-property/\r\n");
      out.write("<br>\r\n");
      out.write("https://creive.me/archives/5668/\r\n");
      out.write("<br>\r\n");
      out.write("http://www.webcreatorbox.com/tech/ecsite-design-tips\r\n");
      out.write("<br>\r\n");
      out.write("http://www.sejuku.net/blog/16055\r\n");
      out.write("<br>\r\n");
      out.write("http://serinaishii.hatenablog.com/entry/2015/11/06/%E8%B6%85%E7%B0%A1%E5%8D%98%26%E3%82%B3%E3%83%94%E3%83%9A%E3%81%A7OK%EF%BC%81%E3%83%9A%E3%83%BC%E3%82%B8%E3%83%88%E3%83%83%E3%83%97%E3%81%B8%E6%88%BB%E3%82%8B%E3%83%9C%E3%82%BF%E3%83%B3%E3%81%AE\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("<p class=\"name\">■ Tips</p>\r\n");
      out.write("ブラウザのアドレスバーに<br>\r\n");
      out.write("<input type=\"text\" name=\"XXX\" size=\"50\" value=\"data:text/html, <html contenteditable>\"><br>\r\n");
      out.write("と打ち込むと、ブラウザがメモ帳のようになり、画面にテキストを入力できる\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- 上へ戻るボタン -->\r\n");
      out.write("    <p id=\"pageTop\"><a href=\"#\"><i class=\"fa fa-chevron-up \"></i></a></p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<p>ここは #main-container の外 *** </p>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- ==== footer ===== -->\r\n");
      out.write("<footer>\r\n");
      out.write("<p>This page is written by MoeSuzuki   @ Nov. 2018 .</p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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
