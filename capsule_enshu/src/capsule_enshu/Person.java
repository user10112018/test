package capsule_enshu;

public class Person {

	private String name = null;
	private int age = 0;

    // コンストラクタ
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

    // カプセル化部分
	public String getName(){
		return this.name;
	}

    // カプセル化部分
	public void setName(String name){
		this.name = name;

		System.out.println(this.name);

	}



}
