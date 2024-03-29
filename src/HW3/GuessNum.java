package HW3;

import java.util.Scanner;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//對則顯示正確訊息，如圖示結果：

public class GuessNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		int randomNum = (int) (Math.random() * 9); // 產生隨機0~9的數字

		int guessNum = sc.nextInt();
		while (guessNum != randomNum) { // 條件判斷迴圈
			System.out.println("猜錯囉");
			guessNum = sc.nextInt();
		}
		System.out.println("答對了！答案就是" + randomNum);

	}

}
