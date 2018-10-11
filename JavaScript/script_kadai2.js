
// 問1

document.write("----- 問1 ------");
document.write("<br>");


var S = function (rad,pi=3.14){
    return rad*rad*pi
}

var rad1 = 5;
var rad2 = 7;
var rad3 = 10;

document.write("半径" + rad1 + "cm: " + S(rad1) + " cm2" + "<br>");
document.write("半径" + rad2 + "cm: " + S(rad2) + " cm2" + "<br>");
document.write("半径" + rad3 + "cm: " + S(rad3) + " cm2" + "<br>");

document.write("<br>");
document.write("-------------");
document.write("<br>");

// 問2

document.write("----- 問2 ------");
document.write("<br>");



var totalPrice = function (group, PriceOtona=500, PriceKodomo=200){
    var numOtona = group[1];
    var numKodomo = group[2];
    
    var Price = numOtona*PriceOtona + numKodomo*PriceKodomo;
    
    return group[0] + " グループの合計金額は " + Price + " 円です。"+ "<br>"
}


var groupA = ["A",2,4];
var groupB = ["B",1,5];
var groupC = ["C",3,7];

document.write(totalPrice(groupA));
document.write(totalPrice(groupB));
document.write(totalPrice(groupC));


document.write("<br>");
document.write("-------------");
document.write("<br>");





