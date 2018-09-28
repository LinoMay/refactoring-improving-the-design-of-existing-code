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
	private Price price;

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}


	public String getTitle() {
		return title;
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
			case REGULAR:
				price = new RegularPrice();
				break;
			case NEW_RELEASE:
				price = new NewReleasePrice();
				break;
			case CHILDRENS:
				price = new ChildrensPrice();
				break;
			default:
				throw new IllegalArgumentException("没有此价格！");
		}
	}

	public double getCharge(int daysRented) {

		return price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return price.getFrequentRenterPoints(daysRented);
	}

}