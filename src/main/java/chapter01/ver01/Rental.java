package chapter01.ver01;

/**
 * description: 租借bean
 * date: 2018/9/28 21:29
 * @author Lino
 */
public class Rental {
	/** 影片 */
	private Movie movie;
	/** 租期 */
	private int daysRented;

	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	// 重构第1步：方法抽离
	public double getCharge() {
		return getMovie().getCharge(getDaysRented());
	}

	public int getFrequentRenterPoints() {
		return getMovie().getFrequentRenterPoints(getDaysRented());
	}
}
