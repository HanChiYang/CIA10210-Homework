package HW5;

//請另外建立一個MyRectangleMain類別，此類別只有main方法

public class MyRectangleMain {
	public static void main(String[] args) {
		//以無參數建構子建立物件並計算面積
		MyRectangle mr1 = new MyRectangle();
		mr1.setWidth(10);
		mr1.setDepth(20);
		System.out.println("面積為:" + mr1.getArea());

		//以有參數建構子建立物件並計算面積
		MyRectangle mr2 = new MyRectangle(10, 20);
		mr2.getArea();
		System.out.println("面積為:" + mr2.getArea());

	}
}
