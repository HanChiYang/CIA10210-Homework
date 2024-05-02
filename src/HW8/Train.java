package HW8;

import java.util.Objects;

public class Train implements Comparable<Train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	// 無參數建構子
	public Train() {

	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	// getter
	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	// setter
	public void setNumber(int number) {
		if (number <= 0) {
			System.out.println("請輸入有效班次");
		} else {
			this.number = number;
		}
	}

	public void setType(String type) {
		if (type.equals("")) {
			System.out.println("請輸入有效車種");
		} else {
			this.type = type;
		}
	}

	public void setStart(String start) {
		if (start.equals("")) {
			System.out.println("請輸入有效起始站");
		} else {
			this.start = start;
		}
	}

	public void setDest(String dest) {
		if (start.equals("")) {
			System.out.println("請輸入有效終點站");
		} else {
			this.dest = dest;
		}
	}

	public void setPrice(double price) {
		if (price <= 0) {
			System.out.println("請輸入有效票價");
		} else {
			this.price = price;
		}
	}

	// 改寫toString方法，讓顯示的方式符合需求
	@Override
	public String toString() {
		return ("班次" + number + "，車種：" + type + "，出發地：" + start + "，目的地：" + dest + "，票價：" + price);
	}

//	//覆寫hashCode及equals方法，使HashSet能夠對應相同物件，以避免加入其集合。
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}

	// 覆寫compareTo方法，使ArrayList及TreeSet能依此方法排序。
	@Override
	public int compareTo(Train other) {
		if (this.number > other.number) {
			return 1;
		} else if (this.number < other.number) {
			return -1;
		} else {
			return 0;
		}

	}

}
