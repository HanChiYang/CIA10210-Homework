package HW5;

//請設計一個類別MyRectangle

public class MyRectangle {
	double width;
	double depth;
	
	//無參數建構子
	public MyRectangle() {
		
	}
	
	//建構子
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	//setter
	void setWidth(double width) {
		if (width <= 0) {
			System.out.println("請輸入大於0的數字");
		} else {
			this.width = width;
		}
	}
	
	//setter
	void setDepth(double depth) {
		if (depth <= 0) {
			System.out.println("請輸入大於0的數字");
		} else {
			this.depth = depth;
		}
	}
	
	//面積計算
	double getArea() {
		double area;
		area = width * depth;
		return area;
	}
}
