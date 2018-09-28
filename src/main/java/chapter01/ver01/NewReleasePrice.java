package chapter01.ver01;

/**
 * package: chapter01.ver01
 * description
 *
 * @author Meif
 * @version 1.0.0
 * date  2018/9/28 22:43
 */
public class NewReleasePrice extends Price {
    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) {
            return 1;
        }
        return 0;
    }
}
