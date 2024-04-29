package OCP;

public class SeniorCitizenDisc implements Discount{
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}
