package HW7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾

public class DogCatToObject {
	public static void main(String[] args) throws Exception{
		//檢查是否有data資料夾，若沒有則建立之。
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}
		//指定輸出Object.ser的輸出路徑，
		File file = new File("C:\\data\\Object.ser");
		
		//實作狗及貓的物件
		Dog[] dogs = new Dog[2];
		dogs[0] = new Dog("Lucky");
		dogs[1] = new Dog("Little White");
		Cat[] cats = new Cat[2];
		cats[0] = new Cat("Meow");
		cats[1] = new Cat("Black");
		
		//輸出狗及貓的資料
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//輸出狗物件迴圈
		for (int i = 0; i < dogs.length; i++) {
			oos.writeObject(dogs[i]);
		}
		//輸出貓物件迴圈
		for (int i = 0; i < cats.length; i++) {
			oos.writeObject(cats[i]);
		}
		//關閉資源
		oos.close();
		fos.close();
	}
}
