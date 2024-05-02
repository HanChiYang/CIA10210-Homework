package HW9;

public class FastEater {
	public static void main(String[] args) {
		FastEaterBun bun = new FastEaterBun();
		Thread bunThread = new Thread(bun);
		FastEaterJames james = new FastEaterJames();
		Thread jamesThread = new Thread(james);

		System.out.println("----大胃王快食比賽開始！----");

		bunThread.start();
		jamesThread.start();

		// 等待兩個執行緒結束
		try {
			bunThread.join();
			jamesThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("----大胃王快食比賽結束！----");

	}
}

class FastEaterBun implements Runnable {
	int count = 1;

	public FastEaterBun() {
	}

	public void run() {
		while (count <= 10) {
			System.out.println("饅頭人吃第" + count + "碗飯");

			try {
				Thread.sleep((long) (Math.random() * 2500) + 500); // 隨機暫停500-3000ms
				if (count == 10) {
					System.out.println("饅頭人吃完了!");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
		}
	}
}

class FastEaterJames implements Runnable {
	int count = 1;

	public FastEaterJames() {
	}

	public void run() {
		while (count <= 10) {
			System.out.println("詹姆士吃第" + count + "碗飯");

			if (count == 10) {
				System.out.println("詹姆士吃完了!");
			}

			try {
				Thread.sleep((long) (Math.random() * 2500) + 500); // 隨機暫停500-3000ms
			} catch (Exception e) {
				e.printStackTrace();
			}
			count++;
		}
	}
}
