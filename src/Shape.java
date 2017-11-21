//60171632 김형진
public abstract class Shape implements Drawable { // Drawable을 구현하는 abstract class
	protected double area; // 면적을 저장할 변수
	protected double length; // 둘레를 저장할 변수

	public double getArea() { // 면적 값을 알려주는 메소드
		return area;
	}

	abstract public void calcArea(); // 도형의 면적을 구하기 위한 추상메소드

	public double getLength() { // 둘레 값을 알려주는 메소드
		return length;
	}

	abstract public void calcLength(); // 도형의 둘레를 구하기 위한 추상메소드
}
