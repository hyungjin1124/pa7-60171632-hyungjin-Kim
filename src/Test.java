//60171632 김형진
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40); // 좌표 대입
		shapes[1] = new Rectangle(30, 30, 10, 10); // 좌표 대입
		shapes[2] = new Circle(50, 20, 30); // 좌표 대입

		for (Shape s : shapes) {
			s.calcArea(); //메소드 호출
			s.calcLength(); //메소드 호출

			System.out.printf("Area: %.1f", s.getArea());
			System.out.println();
			System.out.printf("Length: %.1f", s.getLength());
			System.out.println();
		}
		Drawable[] drawables = new Drawable[4];
		for (int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];
		}
		drawables[3] = new Text("Sample Text");
		for (Drawable d : drawables) {
			d.draw(); //오버라이딩 
		}

	}
}
