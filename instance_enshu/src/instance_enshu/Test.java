package instance_enshu;

public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		System.out.println(taro.name);
		System.out.println(taro.age);


		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;

		Person moe = new Person();
		moe.name = "鈴木 萌";
		moe.age = 100;
		moe.address = "東京";
		moe.email = "abc@gmail.com";
		moe.job = "teacher";

		System.out.println(moe.name);
		System.out.println(moe.age);
		System.out.println(moe.address);
		System.out.println(moe.email);
		System.out.println(moe.job);

		taro.talk();
		jiro.explain();
		moe.live();


		Robot aibo = new Robot();
		aibo.name = "aibo";
		Robot asimo = new Robot();
		asimo.name = "asimo";
		Robot pepper = new Robot();
		pepper.name = "pepper";
		Robot doraemon = new Robot();
		doraemon.name = "どらえもん";


		aibo.walk();
		asimo.talk();
		pepper.run();
		doraemon.talk();


	}

}
