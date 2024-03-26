package HW2;

public class HW2 {
	public static void main(String[] args) {
		// 1. 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum = 0;
		for (int a = 2; a <= 1000; a += 2) {
			sum += a;
		}
		System.out.println("總和為" + sum);

		// 2. 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int product1 = 1;
		for (int b = 1; b <= 10; b++) {
			product1 *= b;
		}
		System.out.println("總和為" + product1);

		// 3. 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int product2 = 1;
		int c = 1;
		while (c <= 10) {
			product2 *= c;
			c++;
		}
		System.out.println("總和為" + product2);

		// 4. 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		System.out.print("數字如右：");
		for (int d = 1; d <= 10; d++) {
			int square = (int) Math.pow(d, 2);
			System.out.print(square + " ");
		}
		System.out.println();

		// 5. 阿文很熱衷大樂透(1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int n = 0, count = 0;
		System.out.print("數字有：");
		for (int num = 1; num <= 49; num++) {
			if (num - n == 4) {
				n += 10;
			} else if (num - 40 >= 0) {
				continue;
			} else {
				System.out.print(num + " ");
				count++;
			}
		}
		System.out.println("\n總共" + count + "個數字");

		// 6. 請設計一隻Java程式，輸出結果為以下：
		// 1 2 3 4 5 6 7 8 9 10
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7 8
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		System.out.println("\n輸出如下：");
		for (int e = 10; e >= 1; e--) {
			for (int f = 1; f <= e; f++) {
				System.out.print(f + " ");
			}
			System.out.println();
		}
		
		// 7. 請設計一隻Java程式，輸出結果為以下：
		// A
		// BB
		// CCC
		// DDDD
		// EEEEE
		// FFFFFF
		System.out.println("\n輸出如下：");
		int i = 65;	//參考'A'的unicode為65
		for (int g = 1; g <= 6; g++) {
			for (int h = 1; h <= g; h++) {
				char letter = (char)i; //轉為字元
				System.out.print(letter);
			}
			i++;
			System.out.println();
		}
	}

}
