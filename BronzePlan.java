public class BronzePlan extends HealthInsurancePlan {
    public BronzePlan() {
        super(0.6); // Set coverage for BronzePlan
    }

    public double computeMonthlyPremium(double salary, int age, boolean smoking) {
        // Calculate premium based on age and smoking status
        double basePremium = salary * 0.08; // 8% of salary
        if (age > 55) {
            basePremium += 2000; // Additional premium for age over 55
        }
        if (smoking) {
            basePremium += 1000; // Additional premium for smoking
        }
        return basePremium;
    }
}
