package chapter01.ver01;

/**
 * package: chapter01.ver01
 * description
 *
 * @author Meif
 * @version 1.0.0
 * date  2018/9/28 22:41
 */
public class ChildrensPrice extends Price {
    @Override
    double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
}
