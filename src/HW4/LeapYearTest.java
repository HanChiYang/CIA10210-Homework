package HW4;

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天

import java.util.Scanner;

public class LeapYearTest {
	// 設定每月天數的陣列
	static int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public static void main(String[] args) {

		// 輸入擬計算的日期
		System.out.println("請輸入日期yyyy mm dd");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		// 判定是否為閏年，若為閏年2月天數+1
		if (year % 400 == 0) {
			monthArray[1] += 1;
		} else if (year % 100 == 0) {
			// 非閏年，不做任何動作
		} else if (year % 4 == 0) {
			monthArray[1] += 1;
		} else {
			// 非閏年，不做任何動作
		}

		if (distinguish(month, day) == false) {
			System.out.println("請輸入有效日期");
		} else {
			System.out.print("輸入的日期為該年第" + getDays(month, day) + "天");
		}
	}

	// 判定輸入數據是否合理
	public static boolean distinguish(int month, int day) {
		if (month <= 0 || month > 12 || day > monthArray[month - 1]) {
			return false;
		} else {
			return true;
		}
	}

	// 計算天數方法
	public static int getDays(int month, int day) {
		int countDay = 0;
		for (int i = 0; i < (month - 1); i++) {
			countDay += monthArray[i];
		}
		return countDay += day;
	}

}