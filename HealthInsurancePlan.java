public class HealthInsurancePlan {
    private double coverage;

    public HealthInsurancePlan(double coverage) {
        this.coverage = coverage;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    // Default implementation of the monthly premium calculation method
    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        return 0.0;
    }
}
