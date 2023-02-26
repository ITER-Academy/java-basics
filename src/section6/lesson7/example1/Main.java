package section6.lesson7.example1;

public class Main {

    public static void main(String[] args) {
        double basePrice = 120.34;
        double shippingCost = 10.05;
        double taxRate = 2.5;
        try {
            double calculatedPrice = calculatePrice(basePrice, shippingCost, taxRate);
            System.out.println("Calculated price: " + calculatedPrice);
        } catch (InvalidTaxRateException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double calculatePrice(double basePrice, double shippingCost, double taxRate) throws InvalidTaxRateException {
        if (taxRate < 0 || taxRate > 1) {
            throw new InvalidTaxRateException("Tax rate must be between 0 and 1");
        }
        double tax = basePrice * taxRate;
        return basePrice + shippingCost + tax;
    }
}
