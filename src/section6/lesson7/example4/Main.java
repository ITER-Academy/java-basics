package section6.lesson7.example4;

public class Main {

    public static void main(String[] args) {
        try {
            divide(5, 0);
        } catch (FinancialCalculationException e) {
            System.out.println("Exception in type: " + e.getCalculationType());
            System.out.println("Exception step: " + e.getCalculationStep());
            System.out.println("Exception message: " + e.getMessage());
        }
    }

    private static void divide(int a, int b) throws FinancialCalculationException {
        if (b == 0) {
            throw new FinancialCalculationException("Can not divide by zero", "division", 1);
        }
        int result = a / b;
        System.out.println(result);
    }
}
