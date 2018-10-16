package instance_enshu;

public class Person {

	public String name = null;
	public int age = 0;
	public String phoneNumber = null;
	public String address = null;
	public String email = null;
	public String job = null;

	public void talk(){
		System.out.println(this.name + "が話す");
	}
	public void explain(){
		System.out.println(this.name + "がご説明します");
	}
	public void live(){
		System.out.println(this.name + "は" + this.address + "に住んでいます");
	}
}
