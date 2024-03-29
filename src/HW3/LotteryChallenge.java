package HW3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

//進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複

public class LotteryChallenge {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文你討厭哪個數字？");
		int numChosen = sc.nextInt();
		ArrayList<Integer> numbers = new ArrayList<>();

		int n = 0, count = 0, num = 1;
		System.out.print("數字有：");
		for (num = 1; num <= 49; num++) {
			if (num - n == numChosen) {
				n += 10;
			} else if (num - (numChosen * 10) >= 0 && num - (numChosen * 10) < 10) {
				continue;
			} else {
				System.out.print(num + " ");
				count++;
				numbers.add(num); // 將數字加入陣列中
			}
		}
		System.out.println("\n總共" + count + "個數字");

		Collections.shuffle(numbers); // 打亂陣列中的數字
		System.out.print("選6個號碼: ");
		for (int i = 0; i < 6; i++) { // 取陣列的前6個數字
			System.out.print(numbers.get(i) + " ");
		}

	}

}