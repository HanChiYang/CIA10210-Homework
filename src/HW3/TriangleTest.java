package HW3;

import java.util.Scanner;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形

public class TriangleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數：");

		int[] data = new int[3];
		for (int i = 0; i <= 2; i++) {
			data[i] = sc.nextInt();
		}

		if (data[0] <= 0 || data[1] <= 0 || data[2] <= 0) {
			System.out.println("不是三角型");
		} else if (data[0] == data[1] && data[1] == data[2]) {
			System.out.println("正三角型");
		} else if (					//(進階功能:加入直角三角形的判斷)
				Math.pow(data[0], 2) + Math.pow(data[1], 2) == Math.pow(data[2], 2) ||
				Math.pow(data[0], 2) + Math.pow(data[2], 2) == Math.pow(data[1], 2) ||
				Math.pow(data[1], 2) + Math.pow(data[2], 2) == Math.pow(data[0], 2)) {
				System.out.println("直角三角型");
		}
		else if (data[0] == data[1] || data[1] == data[2] || data[2] == data[0]) {
			System.out.println("等腰三角型");
		} else {
			System.out.println("其他三角型");
		}
	}
}
