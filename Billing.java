public class Billing {
    public static double[] computePaymentAmount(Patient patient, double amount, int patientAge, boolean patientSmokes) {
        double[] payments = new double[2]; // Index 0: Insurance payment, Index 1: Patient payment
    
        HealthInsurancePlan insurancePlan = patient.getInsurancePlan();
        if (insurancePlan != null) {
            double coverage = insurancePlan.getCoverage();
            double insurancePayment = amount * coverage;
    
            // Calculate patient's payment by subtracting the insurance payment
            double patientPayment = amount - insurancePayment;
    
            // Apply discounts based on the type of insurance plan
            if (insurancePlan instanceof PlatinumPlan) {
                patientPayment -= 5000.0;
            } else if (insurancePlan instanceof GoldPlan) {
                patientPayment -= 4000.0;
            } else if (insurancePlan instanceof SilverPlan) {
                patientPayment -= 3000.0;
            } else if (insurancePlan instanceof BronzePlan) {
                patientPayment -= 2500.0;
            }
    
            // Ensure the patient payment is not negative
            patientPayment = Math.max(patientPayment, 0.0);
    
            payments[0] = insurancePayment;
            payments[1] = patientPayment;
        } else {
            payments[0] = 0.0; // No insurance plan, so insurance pays nothing
            payments[1] = amount; // Patient pays the full amount
        }
    
        return payments;
    }
    
    public static double calculateMonthlyPremium(Staff staff) {
        HealthInsurancePlan insurancePlan = staff.getInsurancePlan();
        double salary = staff.getSalary();
        
        if (insurancePlan != null) {
            // Calculate and return the monthly premium based on the staff member's salary
            return insurancePlan.computeMonthlyPremium(salary, 0, false);
        } else {
            return 0.0; // No insurance plan, so the premium is zero
        }
    }
}
