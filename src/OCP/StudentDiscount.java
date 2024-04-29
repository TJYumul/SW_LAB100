package OCP;

public class StudentDiscount implements Discount{
    @Override
    public double calculateDiscount(double amaount) {
        return amaount * 0.05;
    }
}
