package testProject02;

public class testRoop {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for(int i = 1; i < 10; i++){
			System.out.println(i);
		}

		//  条件演算子
		//  これはJavaではじめて出てきた
		int a = 10;
		String b = a >= 0 ? "プラス" : "マイナス";
		System.out.println(b);

		int x = 35;
        String y = x % 2 ==0 ? "偶数" : "奇数";
        System.out.println(y);

        for(int i=0; i<=5; i++){
        	String star = i % 2 == 0? "☆":"★";
        	System.out.println(star);
        }

        int i = 1;
        while(i <= 5){
        	System.out.println("★");
        	i++;
        }

        //  Java には do while がある
        //  必ず一度は実行させたい処理があるときに使う
        int j = 1;
        do{
        	System.out.println(j);
        	j--;
        } while(j > 1);
        //   後ろのwhile条件に当てはまらない条件をあてると
        //   処理が1回でストップする
	}

}
