package chapter01.ver01;

/**
 * description: 电影bean
 * date: 2018/9/28 21:30
 * @author Meif
 */
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	private String title;
	private int priceCode;

	public Movie(String title, int priceCode) {
		this.title = title;
		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public String getTitle() {
		return title;
	}

	public void setPriceCode(int priceCode) {
		this.priceCode = priceCode;
	}

}