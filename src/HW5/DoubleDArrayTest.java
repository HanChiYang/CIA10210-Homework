package HW5;


//利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//可以找出二維陣列的最大值並回傳

public class DoubleDArrayTest {
	public static void main(String[] args) {
		FindMax fm = new FindMax();
		int [][] intArray = fm.intArray;
		double[][] doubleArray = fm.doubleArray;
		System.out.println(fm.maxElement(intArray));
		System.out.println(fm.maxElement(doubleArray));
	}
}
class FindMax {
	int[][] intArray = {
			{1, 6, 3},
			{9, 5, 2}
	};
	double[][] doubleArray = {
			{1.2, 3.5, 2.2},
			{7.4, 2.1, 8.2}
	};
	
	public int maxElement(int x[][]){
		int maxIntNum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxIntNum < x[i][j]) {
					maxIntNum = x[i][j];
				}
			}
		}
		return maxIntNum;
	}
	
	public double maxElement(double x[][]){
		double maxDoubleNum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (maxDoubleNum < x[i][j]) {
					maxDoubleNum = x[i][j];
				}
			}
		}
		return maxDoubleNum;
	}
}

