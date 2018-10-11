<!DOCTYPE html>
<html lang="ja">


<head>
    <meta charset="utf-8">
    <title>4eachblog 掲示板</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    </head>



<body>
    
        <div class="logo">
        <img src="4eachblog_logo.jpg" width="60%">
    </div>
    
    <header>
     <ul>
         <li>トップ</li>
         <li>プロフィール</li>
         <li>4eachについて</li>
         <li>登録フォーム</li>
         <li>問合わせ</li>
     </ul>
    </header>
    
    
    
    
    
         
    <main>
        <!--  ヘッダーとフッターの間全体  -->
        <div class="main-container">
            
            <!--  左：メインコンテンツ  -->
            <div class="left">
                
                <h1>プログラミングに役立つ書籍</h1>
                <br>
  
                
                
                
                
<div>

    <form method="post" action="insert.php">
    <h2>入力フォーム</h2>
        
        <div>
            <label>ハンドルネーム</label>
            <br>
            <input type="text" class="text" size="50" name="handlename">
        </div>
        
        <div>
            <label>タイトル</label>
            <br>
            <input type="text" class="text" size="50" name="title">
        </div>
        
        
        <div>
            <label>コメント</label>
            <br>
            <textarea cols="65" rows="7" name="comments"></textarea>
        </div>
        
        <div>
            <input type="submit" class="submit" value="送信する">
        </div>
    </form>
</div>       

                

<?php
   mb_internal_encoding("utf8");
   $pdo = new PDO("mysql:dbname=lesson01_1;host=localhost;","root","mysql");
   $stmt = $pdo->query("select * from 4each_keijiban");
                
    while ($row = $stmt->fetch()){
                
echo "<div class='box'>";
echo "<label>".$row['title']."</label>" ;           
echo "<div class='contents''>" ;   

echo $row['comments'];
echo "<div class='handlename'> posted by ".$row['handlename']."</div>" ;   
echo "</div>";
echo "</div>";
   
    }
?>             
                
                
            </div>
            
            <!--  右：サイドバー  -->
            <div class="right">
                <h3>人気の記事</h3>
                    <ul class="side">
                        <li>PHP オススメ本</li>
                        <li>PHP MyAdminの使い方</li>
                        <li>今人気のエディタ Top5</li>
                        <li>HTMLの基礎</li>  
                    </ul>
                <h3>オススメリンク</h3>
                    <ul class="side">                 
                        <li>インターノウス株式会社</li>
                        <li>XAMPPのダウンロード</li>
                        <li>Eclipseのダウンロード</li>
                        <li>Bracketsのダウンロード</li>
                    </ul>
                <h3>カテゴリ</h3>
                    <ul class="side">
                        <li>HTML</li>
                        <li>PHP</li>
                        <li>MySQL</li>
                        <li>Java Script</li>
                    </ul>
            </div>
            
        </div>
    </main>     
    
    
    

    
    <footer>
          copyright (c) internous | 4each blog is the one which provides A to Z about programming.
    </footer>
    </body></html>