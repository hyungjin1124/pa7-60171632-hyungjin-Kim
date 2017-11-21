//60171632 ������
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40); // ��ǥ ����
		shapes[1] = new Rectangle(30, 30, 10, 10); // ��ǥ ����
		shapes[2] = new Circle(50, 20, 30); // ��ǥ ����

		for (Shape s : shapes) {
			s.calcArea(); //�޼ҵ� ȣ��
			s.calcLength(); //�޼ҵ� ȣ��

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
			d.draw(); //�������̵� 
		}

	}
}
