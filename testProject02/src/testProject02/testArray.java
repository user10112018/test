package testProject02;

public class testArray {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		   String[] name = new String[3];
		   name[0] = "おはよう";
		   name[1] = "こんにちは";
		   name[2] = "こんばんは";
		   System.out.println(name[1]);

		   String[] name2 = {"あけまして","おめでとう","ございます"};
		   System.out.println(name2[1]);

		   char[] abc = {'a','b','c'};
		   System.out.println(abc[2]);

		   int[] i = {35, 67, 256};
		   System.out.println(i[0]);


    //  多次元配列

		   String[][] countries =
			   {
					   {"日本","タイ"},
					   {"アメリカ","ブラジル"},
					   {"フランス","ロシア"}
			   };
		   System.out.println(countries[0][0]);
		   System.out.println(countries[0][1]);
		   System.out.println(countries[1][0]);
		   System.out.println(countries[2][1]);

		   //  先に配列の大きさを決めるときは
		   String[][] testArray = new String[4][3];

	}

}
