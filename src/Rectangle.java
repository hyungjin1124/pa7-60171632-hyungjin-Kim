//60171632 김형진
public class Rectangle extends Shape { // Shape를 상속하는 서브클래스
	protected double i, j, k, l;

	public Rectangle(double i, double j, double k, double l) {
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}

	public void calcArea() { // 오버라이딩
		area = k * l; // 넓이 계산
	}

	public void calcLength() { // 오버라이딩
		length = (k + l) * 2; // 둘레 계산

	}

	public void draw() { // 오버라이딩
		System.out.println("Rectangle " + "(" + i + "," + j + ")" + "-" + "(" + (i + k) + "," + (j + l) + ")"); // 좌표 출력
	}
}
