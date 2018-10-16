package constructor_enshu;


public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);


		Person saburo = new Person("saburo");
		System.out.println(saburo.name + "," + saburo.age);

		Person noname = new Person(25);
		System.out.println(noname.name + "," + noname.age);

		Person hanako = new Person(17, "hanako");
		System.out.println(hanako.name + "," + hanako.age);
	}
}




