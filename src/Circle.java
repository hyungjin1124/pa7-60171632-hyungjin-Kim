//60171632 ������
public class Circle extends Shape { // Shape�� ����ϴ� ���� Ŭ����
	protected double i, j, k;

	public Circle(double i, double j, double k) {
		this.i = i;
		this.j = j;
		this.k = k;
	}

	public void calcArea() { // �������̵�

		area = k * k * Math.PI; // ���� ���

	}

	public void calcLength() { // �������̵�

		length = 2 * k * Math.PI; // ���� ���

	}

	public void draw() { // �������̵�
		System.out.println("Circle center " + "(" + i + "," + j + ")" + "-" + "radius" + "(" + k + ")"); // ���� �߽� ��ǥ��
																											// ������ ���
	}
}
