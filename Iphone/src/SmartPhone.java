
public class SmartPhone extends Mp3Player {

	public void call(){
		System.out.println("電話");
	}

	public void mail(){
		System.out.println("メール");
	}

	public void photo(){
		System.out.println("写真");
	}

	public void internet(){
		System.out.println("インターネット");
	}


	// 親クラスMp3Playerのメソッドを上書き

	public void play(){
		System.out.println("再生 (ハイレゾ機能) ");
	}

}
