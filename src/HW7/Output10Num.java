package HW7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Output10Num {
	public static void main(String[] args) {
		try {
			FileOutputStream fw = new FileOutputStream("c:\\Random10Number.txt", true);
			BufferedOutputStream bw = new BufferedOutputStream(fw);
			PrintStream ps = new PrintStream(bw);

			for (int i = 0; i <= 10; i++) {
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
