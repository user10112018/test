<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>

<title>ItemCreate画面</title>

<style type="text/css">

/* ============= TAG LAYOUT ============= */
body {
margin: 0;
padding: 0;
line-height: 1.6;
letter-spacing: 1px;
font-family: Verdana, Helvetica, sans-serif;
font-size: 12px;
color: #333;
background: #fff;
}

table {
text-align: center;
margin: 0 auto;
}

/* ======== ecsite LAYOUT ==================== */
#top {
width: 780px;
margin: 30px auto;
border: 1px solid #333;
}

#header {
width: 100%;
height: 80px;
background-color: black;
}

#main {
clear: both;
width: 100%;
height: 500px;
text-align: center;
margin: 0 auto;
}

/* #text-center { */
/* display: inline-block; */
/* margin: 0 auto; */
/* text-align: center; */
/* } */

#main-container {
text-align: center;
/* width: 90%; */
/* margin: 0 auto; */
margin-top: 70px;

}

#left {
display: inline-block;
border: 1px solid #333;
width: 40%;
height: 300px;
margin-bottom: 40px;
}

#right {
display: inline-block;
border: 1px solid #333;
width: 40%;
height: 300px;
margin-bottom: 40px;
}


#footer {
clear: both;
width: 100%;
height: 80px;
background-color: black;
}





</style>

</head>


<body>


<div id="header">
<div id="pr">
</div></div>


<div id="main">
<div id="top">

<p>ItemCreate</p>

</div>

<div>


<s:if test="errorMassage !=''">
<s:property value="errorMassage" escape="false"/>
</s:if>

<table>

<s:form action="ItemCreateConfirmAction">

<tr>
<td>
<label>商品名 : </label>
</td>

<td>
<input type="text" name="itemName" value=""/>
</td>
</tr>


<tr>
<td>
<label>商品価格 : </label>
</td>

<td>
<input type="text" name="itemPrice" value=""/>
</td>
</tr>


<tr>
<td>
<label>在庫数 : </label>
<!-- これは余力があればプルダウンを作ってもよい -->
</td>

<td>
<input type="text" name="itemStock" value=""/>
</td>
</tr>

<s:submit value="登録" />
</s:form>


</table>

<div>

<span>管理者画面に戻る場合は</span>
<a href='<s:url action="AdminAction" />'>こちら</a>

</div>

</div>

</div>


<div id="footer">
<div id="pr">
</div>
</div>

</body>
</html>