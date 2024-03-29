package HW3;

import java.util.Scanner;

//進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)

public class Guess100Num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧！");
		int randomNum = (int) (Math.random() * 101); // 產生隨機0~100的數字
		int guessNum = sc.nextInt();

		while (randomNum != guessNum) { // 條件判斷迴圈
			if (randomNum > guessNum) { // 判定大小
				System.out.println("數字大於輸入值");
			} else {
				System.out.println("數字小於輸入值");
			}
			guessNum = sc.nextInt();
		}
		System.out.println("答對了！答案就是" + randomNum);

	}

}
