package enshu;

import java.util.HashMap;
import java.util.Map;

public class SampleMap {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, String>map = new HashMap<String,String>();
		
		// 値のセットはputメソッドを利用
		map.put("key1","value1");
		map.put("key2","value2");
		map.put("key3","value3");
		map.put("key4","value4");
		map.put("key5","value5");
		
		
		// 値の取得
		String value = map.get("key1"); // value1 が取得できる
		System.out.println(value);
		
		String valueNull = map.get("key6"); // 存在しないkeyの場合はnull
		System.out.println(valueNull);
		
		// map に該当するkeyが存在するか否かチェック
		if(map.containsKey("key1")){
			System.out.println("key1 は存在します");
		}else{
			System.out.println("key1 は存在しません");
		}
		
		// 拡張for文を利用してすべて情報を取得する
		for(Map.Entry<String, String> e : map.entrySet()){
			System.out.println(e.getKey() + ":" + e.getValue());
		}

	}

}
