package chapter01.ver01;

/**
 * package: chapter01.ver01
 * description
 *
 * @author Meif
 * @version 1.0.0
 * date  2018/9/28 22:38
 */
abstract class Price {

    abstract double getCharge(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 0;
    }
}
