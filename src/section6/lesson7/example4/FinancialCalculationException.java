package section6.lesson7.example4;

public class FinancialCalculationException extends Exception {

    private String calculationType;
    private int calculationStep;

    public FinancialCalculationException(String message, String calculationType, int calculationStep) {
        super(message);
        this.calculationType = calculationType;
        this.calculationStep = calculationStep;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public int getCalculationStep() {
        return calculationStep;
    }
}
