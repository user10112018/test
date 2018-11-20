<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style01.css">

<title>Index</title>



</head>


<body>
<!-- ============== ココカラ =============== -->

<!-- ==== header ===== -->
<header>

<div id="logo">ＭｙＰｒｏｊｅｃｔ</div>



<div id="menu">

<ul>
   <li>ＴＯＰ</li>
   <li>menuＡ</li>
   <li>menuＢ</li>
   <li>menuＣ</li>
</ul>

</div>

</header>

<!-- ==== main ===== -->

<main>

<div id="main-container">

<p>■ テーブル</p>
<table border="1">
     <tr><th colspan="2">項目と内容</th></tr>
     <tr><td>項目①</td><td>中身①</td></tr>
     <tr><td rowspan="2">行の結合</td><td>中身② 文字数多目にする。</td></tr>
     <tr><td>中身②－2</td></tr>
     <tr><td>項目①</td><td>中身③</td></tr>
</table>
https://techacademy.jp/magazine/9428
<br>

<p>■ 修飾</p>
<p>この文章の下に<span style="background:#008080;color:aqua;">水平線</span>が入ります</p>
<!-- 水平線を入れたいときには<hr>タグ -->
<hr>
<p>この文章の上に<span style="background:#008080;color:aqua;">水平線</span>が入ります</p>

<br>

<p>■ jQuery</p>

<a href="jquery.jsp">sample</a>

<br>

<p>■ レイアウトサンプル</p>

<a href="2columns.jsp">２カラムレイアウト</a>
<br>
<a href="3columns.jsp">３カラムレイアウト</a>

<br><br>
<a href="2columns_flexbox.jsp">２カラムレイアウト(flexbox)</a>
<br>
<a href="3columns_flexbox.jsp">３カラムレイアウト(flexbox)</a>




</div>


<p>ここは #main-container の外 *** </p>

</main>

<!-- ==== footer ===== -->
<footer>
<p>This page is written by MoeSuzuki   @ Nov. 2018 .</p>
</footer>

</body>

</html>