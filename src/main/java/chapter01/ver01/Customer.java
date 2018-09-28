package chapter01.ver01;

import java.util.Enumeration;
import java.util.Vector;
/**
 * description: 顾客bean
 * date: 2018/9/28 21:28
 * @author Lino
 */
public class Customer {
	/** 姓名 */
	private String name;
	/** 租借记 */
	private Vector rentals = new Vector();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental arg) {
		rentals.addElement(arg);
	}

	public String getName() {
		return name;
	}

	public String statement() {

		Enumeration rentals = this.rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
            // 取得一笔租借记。
			Rental each = (Rental) rentals.nextElement();
			// show figures for this rental（显示此笔租借记录）
			result += "\t" + each.getMovie().getTitle() + "\t"
					+ String.valueOf(each.getCharge()) + "\n";

		}
		// add footer lines（结尾打印）
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}

    private double getTotalCharge() {
        Enumeration rentals = this.rentals.elements();
        // 总消费金。
        double totalAmount = 0;
        while (rentals.hasMoreElements()) {
            // 取得一笔租借记。
            Rental each = (Rental) rentals.nextElement();
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }

    private int getTotalFrequentRenterPoints() {
        // 常客积点
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            // 取得一笔租借记。
            Rental each = (Rental) rentals.nextElement();
            // determine amounts for each line
            frequentRenterPoints += each.getFrequentRenterPoints();

        }
        return frequentRenterPoints;
    }


}
