<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style01.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<title>jQuery</title>

<style>
#main {
	text-align:center;
	}
</style>

<!-- bxslider -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

  <script>
    $(document).ready(function(){
      $('.bxslider').bxSlider({
    	  auto: true,
    	  mode: 'fade',
    	  speed: 1000,
    	  slideWidth: 400
      });
    });
  </script>
<!-- bxslider -->


</head>


<body>

<!-- スクリプトファイル指定 -->
<script type="text/javascript" src="./javascript/script.js"></script>

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

<div id="main">
<div id="main-container">

<p>■ 文字に対するイベント</p>

<h1>
Click Here !
<br>
</h1>

<div class="samp1">
sample   #samp1
<br>

<div class="samp2">
sample   #samp1 #samp2
<br>
</div>
</div>

sample
<br>


<div class="samp2">
sample  #samp2
</div>
<br>

sample
<br>

<br>
<p>■ 画像に対するイベント</p>

<div class="img">

<div class="click_img">
<img src="./img/bookstore.jpg" width="400px">
<!-- width=400px で下4枚と同じサイズ -->
</div>
<br>

<div class="4imgs">
<img src="./img/pic1.jpg">
<img src="./img/pic4.jpg">
<img src="./img/pic6.jpg">
<img src="./img/pic8.jpg">
</div>

<br>
<br>
<p>■ スライドショー</p>

  <div class="bxslider">
    <img src="./img/jQuery_image1.jpg">
    <img src="./img/jQuery_image2.jpg">
    <img src="./img/jQuery_image3.jpg">
    <img src="./img/jQuery_image4.jpg">
    <img src="./img/jQuery_image5.jpg">
  </div>

</div>

<br>
<a href='jquery.jsp'>pageRenew</a><br>
<br>
<a href='index.jsp'>goToHome</a>
</div>



<!-- ======================= ココマデ ===================================== -->
</div>

<!-- ==== footer ===== -->
<footer>
<p>This page is written by MoeSuzuki   @ Nov. 2018 .</p>
</footer>

</body>
</html>