package HW9;

public class PocketMoney {

	private int bankMoney = 0;

	public static void main(String[] args) {
		PocketMoney pocketMoney = new PocketMoney();
		Mom mom = new Mom(pocketMoney);
		Son son = new Son(pocketMoney);
		Thread tm = new Thread(mom);
		Thread ts = new Thread(son);
		tm.start();
		ts.start();

		while (true) {
			if (Son.isFinished && tm.isAlive()) {
				tm.interrupt();
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			if (Son.isFinished && !tm.isAlive()) {
				break;
			}
		}
	}

	synchronized public void deposit() {
		while (bankMoney > 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("媽媽可以結束匯款");
				return;
			}
			System.out.println("媽媽被要求匯款!");

		}
		bankMoney += 2000;
		System.out.println("零用錢存了2000，帳戶共有：" + bankMoney);
		notify();
	}

	synchronized public void withdraw() {
		while (bankMoney < 1000) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("熊大被媽媽告知帳戶已經有錢");

		}
		bankMoney -= 1000;
		System.out.println("熊大領了1000，帳戶共有" + bankMoney);
		if (bankMoney <= 2000) {
			System.out.println("帳戶少於2000元，通知媽媽存錢");
			notify();
		}

	}
}

class Mom implements Runnable {
	private PocketMoney pocketMoney;

	public Mom(PocketMoney pocketMoney) {
		this.pocketMoney = pocketMoney;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			pocketMoney.deposit();
	}
}

class Son implements Runnable  {
	private PocketMoney pocketMoney;
	public static boolean isFinished = false;

	public Son(PocketMoney pocketMoney) {
		this.pocketMoney = pocketMoney;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			pocketMoney.withdraw();
		}
		isFinished = true;
	}

}
