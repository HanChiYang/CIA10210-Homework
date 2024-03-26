package HW1;

public class HW1 {
	public static void main(String[] args) {

		// 1. 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int num1 = 12, num2 = 6;
		int sum = num1 + num2;
		int multi = num1 * num2;
		System.out.println("6與12的和為" + sum);
		System.out.println("6與12的積為" + multi);

		// 2. 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int eggNum = 200;
		final int DOZEN = 12;
		int dozenNum = eggNum / DOZEN;
		int dozenRemain = eggNum % DOZEN;
		System.out.println("200顆為" + dozenNum + "打，剩" + dozenRemain + "顆");

		// 3. 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		double totalSec = 256559;
		double dayInSec = 60 * 60 * 24; // 每天有幾秒
		double hourInSec = 60 * 60; // 每小時有幾秒
		double minInSec = 60; // 每分鐘有幾秒
		System.out.printf("256559秒為%.2f天，%.2f小時，%.2f分鐘\n", totalSec / dayInSec, totalSec / hourInSec,
				totalSec / minInSec);

		// 4. 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		double circum = 2 * PI * r; // 圓周長公式：2 * 𝝿 * r
		double area = Math.pow(r, 2) * PI; // 圓面積公式：r^2 * 𝝿
		System.out.printf("圓面積為%.2f，圓周長為%.2f\n", area, circum);

		// 5. 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
		// 金加利息共有多少錢(用複利計算，公式請自行google)
		int principal = 1_500_000;
		double interest = 0.02;
		int investYear = 10;
		// 複利公式：
		// 本金和 = 本金 * (1 + 年利率)^年數
		int total = (int) (principal * Math.pow(1 + interest, investYear));
		System.out.println("10年後總金額為" + total);

		// 6. 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		// 並請用註解各別說明答案的產生原因
		System.out.println(5 + 5); // 數值直接相加，得10。
		System.out.println(5 + '5'); // 為數值5，與字元5的unicode十進位數53相加，得58。
		System.out.println(5 + "5"); // 為數值與字串串接，故為55，回傳值型別為字串。
	}
}