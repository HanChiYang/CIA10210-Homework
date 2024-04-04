package HW4;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有5個,其員工編號與身上現金列表如下：
//員工編號		25		32		8		19		27
//現金		2500	800		500		1000	1200
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;
//統計有錢可借的總人數:
//例如輸入1000就顯示「有錢可借的 員工編號: 25 19 27 共 3 人!」

import java.util.Scanner;

public class LotteryTest {
	public static void main(String[] args) {

		// 將員工及擁有金額宣告為二維陣列
		int[][] twoDA = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };

		// Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文要借多少錢?");
		int borrowCash = sc.nextInt();

		// 比較阿文要借的錢及同事擁有現金
		System.out.print("有錢可借的員工編號:");
		int count = 0;
		for (int i = 0; i < twoDA[0].length; i++) {
			if (twoDA[1][i] >= borrowCash) {
				count++;
				System.out.print(twoDA[0][i] + " ");
			}
		}
		System.out.print("共 " + count + " 人!");
	}
}
