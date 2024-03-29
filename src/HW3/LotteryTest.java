package HW3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數
public class LotteryTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文你討厭哪個數字？");
		int numChosen = sc.nextInt();

		int n = 0, count = 0;
		System.out.print("數字有：");
		for (int num = 1; num <= 49; num++) {
			if (num - n == numChosen) {
				n += 10;
			} else if (num - (numChosen * 10) >= 0 && num - (numChosen * 10) < 10) {
				continue;
			} else {
				System.out.print(num + " ");
				count++;
			}
		}
		System.out.println("\n總共" + count + "個數字");

	}

}