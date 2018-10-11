<? php


$ a = 35960;
echo $ a;
  

$ b = 15;
if ($ b > 10){
    echo "A";}
elseif ($ b == 10){
    echo "B";}
else{
    echo "C";}


$ c = 20;
if ($ c > 20){
    if ($ c % 2==0){
        echo "A";}
    else{
        echo "B";}
}


$ color = "青";
switch($ color){
    case "赤":
        echo "赤組";
        break;
    case "青":
        echo "白組";
        break;
    default:
        echo "エラー";
}


$ numArray = array(24, 45, 67, "加藤");
$ numArray[] = "abc";
unset($ numArray[2]);
echo $ numArray;



$ country = array("日本","アメリカ","フランス");
$ country = array("asia"=>"日本",
                  "america"=>"アメリカ",
                  "europe"=>"フランス");
echo $ country["europe"];    //  添え字は変えられる  


//  多次元配列
$ dimArray = array(
               array(3,4),
               array(5,6),
               array(7,8));
echo $ dimArray[0][1];


//  多次元連想配列
$ num1 = array(3,4);
$ num2 = array(10,20);
$ numbers = array($ num1, $ num2);
echo $ numbers[1][1];
    

//  文字列の連結
$ char = "abc";
echo $ char."de";


//   コメントアウト
/*   コメントアウト  
*/

for($ i = 0; $ i < 5; $ i++){
    echo $ i;
    echo "<br>";
}


$ numArray2 = array(10,20,30);
foreach($ numArray2 as $ value){
    echo $ value;
    echo "<br>";
}
//   【 配列に格納した順に】ループ処理したときにforeach構造にする
//    習慣的に$valueとする

$ numArray3 = array("A" => 10,
                    "B" => 20,
                    "C" => 30);
foreach($ numArray2 as $ key => $ value){
    echo $ key.$ value;
    echo "<br>";
}
//    これで多次元連想配列もforeachで処理できる
//    名前（文字列）の入れ子ができる
//    ソートもできる

sort();  //  昇順  
rsort(); //  降順
ksort(); //  keyを昇順
//  ほか多数



?>