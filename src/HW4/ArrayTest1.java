package HW4;

//有個一維陣列如下：
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素

public class ArrayTest1 {
	public static void main(String[] args) {

		int[] iArray = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		int arraySum = 0;
		for (int i = 0; i < iArray.length; i++) {
			arraySum += iArray[i];
		}
		double arrayAvg = arraySum / iArray.length;
		System.out.print("平均為：" + arrayAvg + "\n大於平均的值有：");

		for (int i = 0; i < iArray.length; i++) {
			if (iArray[i] > arrayAvg) {
				System.out.print(iArray[i] + " ");
			}
		}

	}

}
