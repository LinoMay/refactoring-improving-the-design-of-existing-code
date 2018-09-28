package chapter01.ver01;

/**
 * package: chapter01.ver01
 * description
 *
 * @author Meif
 * @version 1.0.0
 * date  2018/9/28 22:42
 */
public class RegularPrice extends Price {
    @Override
    double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}
