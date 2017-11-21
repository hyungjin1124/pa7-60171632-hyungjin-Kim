//60171632 김형진
public class Text implements Drawable { // Drawable을 구현하는 클래스
	String st;

	public Text(String st) {
		this.st = st;
	}

	public void draw() { // 오버라이딩
		// TODO Auto-generated method stub
		System.out.println(st);
	}

}
