package HW4;

//有個字串陣列如下(八大行星)：
//{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

public class EightPlanetsTest {
	public static void main(String[] args) {

		String[] solar = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		// 將整個字串陣列內容轉為一個字串
		String planet = "";
		for (int i = 0; i < solar.length; i++) {
			planet += solar[i];
		}

		// 將整合後的字串依字母轉為陣列
		char[] planetArray = planet.toCharArray();

		// 將字母陣列以迴圈檢查是否為aeiou，並統計。
		int count = 0;
		for (int i = 0; i < planetArray.length; i++) {
			switch (planetArray[i]) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}
		}
		// 印出結果
		System.out.print("母音的數量有" + count + "個");
	}
}
