package HW7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Output10Num {
	public static void main(String[] args) {
		try {
			//接上FileOutputStream，並將append設置成true
			FileOutputStream fw = new FileOutputStream("c:\\Random10Number.txt", true);
			BufferedOutputStream bw = new BufferedOutputStream(fw);
			//使用PrintStream以在txt中印出內容
			PrintStream ps = new PrintStream(bw);
			//迴圈10次獲得1-1000的隨機整數
			for (int i = 0; i < 10; i++) {
				ps.println((int) (Math.random() * 1000 + 1));
			}
			ps.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
