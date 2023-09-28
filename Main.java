public class Main {
    public static void main(String[] args) {
        // Create HealthInsurancePlan objects
        HealthInsurancePlan platinumPlan = new PlatinumPlan();
        HealthInsurancePlan goldPlan = new GoldPlan();
        HealthInsurancePlan silverPlan = new SilverPlan();
        HealthInsurancePlan bronzePlan = new BronzePlan();
        
        // Create a Patient with insurance plan
        Patient patientWithInsurance = new Patient();
        patientWithInsurance.setPatientId(1234);
        patientWithInsurance.setInsured(true);
        patientWithInsurance.setInsurancePlan(platinumPlan);
        
        // Create a Patient without insurance plan
        Patient patientWithoutInsurance = new Patient();
        patientWithoutInsurance.setPatientId(5678);
        patientWithoutInsurance.setInsured(false);
        
        // Set patient age and smoking status
        int patientAge = 40; // Set the age of the patient
        boolean patientSmokes = true; // Set the smoking status of the patient
        
        // Calculate payment amount for patients with age and smoking status
        double[] paymentWithInsurance = Billing.computePaymentAmount(patientWithInsurance, 80000, patientAge, patientSmokes);
        double[] paymentWithoutInsurance = Billing.computePaymentAmount(patientWithoutInsurance, 80000, patientAge, patientSmokes);
        
        // Print payment details
        System.out.println("Patient 1 (with insurance) Payment Details:");
        System.out.println("Insurance Pay: " + paymentWithInsurance[0]);
        System.out.println("Patient Pay: " + paymentWithInsurance[1]);
        
        System.out.println("\nPatient 2 (without insurance) Payment Details:");
        System.out.println("Insurance Pay: " + paymentWithoutInsurance[0]);
        System.out.println("Patient Pay: " + paymentWithoutInsurance[1]);
        
        // Create a Doctor
        Doctor doctor = new Doctor();
        doctor.setDoctorId(1);
        doctor.setFirstName("Shaun");
        doctor.setLastName("Mendes");
        doctor.setGender("Male");
        doctor.setEmail("shaunkmmendes@gmail.com");
        doctor.setYearsOfExperience(10);
        doctor.setSalary(80000.0);
        doctor.setSpecialization("Surgeon");
        
        // Create a Nurse
        Nurse nurse = new Nurse();
        nurse.setNurseId(2);
        nurse.setFirstName("Jayden");
        nurse.setLastName("Colaco");
        nurse.setGender("Male");
        nurse.setEmail("jaydencolaco@gmail.com");
        nurse.setYearsOfExperience(5);
        nurse.setSalary(50000.0);
        
        // Print Doctor and Nurse details
        System.out.println("\nDoctor Details:");
        System.out.println("Doctor ID: " + doctor.getDoctorId());
        System.out.println("Doctor Name: " + doctor.getFirstName() + " " + doctor.getLastName());
        System.out.println("Specialization: " + doctor.getSpecialization());
        System.out.println("Salary: " + doctor.getSalary());
        
        System.out.println("\nNurse Details:");
        System.out.println("Nurse ID: " + nurse.getNurseId());
        System.out.println("Nurse Name: " + nurse.getFirstName() + " " + nurse.getLastName());
        System.out.println("Salary: " + nurse.getSalary());
    }
}



//Menu-Driven Code

// import java.util.Scanner;

// public class Main {
    //     public static void main(String[] args) {
        //         Scanner sc = new Scanner(System.in);
        //         System.out.print("Enter maximum capacity for patients: ");
        //         int maxPatients = sc.nextInt();
        
        //         System.out.print("Enter maximum capacity for doctors: ");
        //         int maxDoctors = sc.nextInt();
        
        //         System.out.print("Enter maximum capacity for nurses: ");
        //         int maxNurses = sc.nextInt();
        
        //         System.out.print("Enter maximum capacity for staff: ");
        //         int maxStaff = sc.nextInt();
        
        //         // Create an instance of HealthCareSystem with user-specified maximum capacities
        //         HealthCareSystem healthCareSystem = new HealthCareSystem(maxPatients, maxDoctors, maxNurses, maxStaff);
        
        //         while (true) {
            //             System.out.println("\nHealthcare System Menu");
            //             System.out.println("1. Add Patient");
            //             System.out.println("2. Add Doctor");
            //             System.out.println("3. Add Nurse");
            //             System.out.println("4. Calculate Payment");
            //             System.out.println("5. Exit");
            //             System.out.print("Enter your choice: ");
            
            //             int choice = sc.nextInt();
            //             sc.nextLine(); // Consume the newline character
            
            //             switch (choice) {
                //                 case 1:
                //                 addPatient(sc, healthCareSystem);
                //                 break;
                //                 case 2:
                //                 addDoctor(sc, healthCareSystem);
                //                 break;
                //                 case 3:
                //                 addNurse(sc, healthCareSystem);
                //                 break;
                //                 case 4:
                //                 calculatePayment(sc, healthCareSystem);
                //                 break;
                //                 case 5:
                //                 System.out.println("Exiting the program. Goodbye!");
                //                 sc.close();
                //                 System.exit(0);
                //                 default:
                //                 System.out.println("Invalid choice. Please enter a valid option.");
                //             }
                //         }
                //     }
                
                //     private static void addPatient(Scanner sc, HealthCareSystem healthCareSystem) {
                    //         System.out.print("Enter Patient ID: ");
                    //         long patientId = sc.nextLong();
                    //         sc.nextLine(); // Consume the newline character
                    
                    //         System.out.print("Enter Patient First Name: ");
                    //         String firstName = sc.nextLine();
                    
                    //         System.out.print("Enter Patient Last Name: ");
                    //         String lastName = sc.nextLine();
                    
                    //         System.out.print("Enter Patient Gender: ");
                    //         String gender = sc.nextLine();
                    
                    //         // Create a patient and set their details
                    //         Patient patient = new Patient();
                    //         patient.setPatientId(patientId);
                    //         patient.setFirstName(firstName);
                    //         patient.setLastName(lastName);
                    //         patient.setGender(gender);
                    
                    //         // Add the patient to the system
                    //         healthCareSystem.addPatient(patient);
                    
                    //         System.out.println("Patient added successfully!");
                    //     }
                    
                    //     private static void addDoctor(Scanner sc, HealthCareSystem healthCareSystem) {
                        //         System.out.print("Enter Doctor ID: ");
                        //         long doctorId = sc.nextLong();
                        //         sc.nextLine(); // Consume the newline character
                        
                        //         System.out.print("Enter Doctor First Name: ");
                        //         String firstName = sc.nextLine();
                        
                        //         System.out.print("Enter Doctor Last Name: ");
                        //         String lastName = sc.nextLine();
                        
                        //         System.out.print("Enter Doctor Gender: ");
                        //         String gender = sc.nextLine();
                        
                        //         System.out.print("Enter Doctor Email: ");
                        //         String email = sc.nextLine();
                        
                        //         System.out.print("Enter Doctor Years of Experience: ");
                        //         int yearsOfExperience = sc.nextInt();
                        //         sc.nextLine(); // Consume the newline character
                        
                        
                        //         System.out.print("Enter Doctor Salary: ");
                        //         double salary = sc.nextDouble();
                        //         sc.nextLine(); // Consume the newline character
                        
                        //         System.out.print("Enter Doctor Specialization: ");
                        //         String specialization = sc.nextLine();
                        
                        //         // Create a doctor and set their details
                        //         Doctor doctor = new Doctor();
                        //         doctor.setDoctorId(doctorId);
                        //         doctor.setFirstName(firstName);
                        //         doctor.setLastName(lastName);
                        //         doctor.setGender(gender);
                        //         doctor.setEmail(email);
                        //         doctor.setYearsOfExperience(yearsOfExperience);
                        
                        //         doctor.setSalary(salary);
                        //         doctor.setSpecialization(specialization);
                        
                        //         // Add the doctor to the system
                        //         healthCareSystem.addDoctor(doctor);
                        
                        //         System.out.println("Doctor added successfully!");
                        //     }
                        
                        //     private static void addNurse(Scanner sc, HealthCareSystem healthCareSystem) {
                            //         System.out.print("Enter Nurse ID: ");
                            //         long nurseId = sc.nextLong();
                            //         sc.nextLine(); // Consume the newline character
                            
                            //         System.out.print("Enter Nurse First Name: ");
                            //         String firstName = sc.nextLine();
                            
                            //         System.out.print("Enter Nurse Last Name: ");
                            //         String lastName = sc.nextLine();
                            
                            //         System.out.print("Enter Nurse Gender: ");
                            //         String gender = sc.nextLine();
                            
                            //         System.out.print("Enter Nurse Email: ");
                            //         String email = sc.nextLine();
                            
                            //         System.out.print("Enter Nurse Years of Experience: ");
                            //         int yearsOfExperience = sc.nextInt();
                            //         sc.nextLine(); // Consume the newline character
                            
                            
                            
                            //         System.out.print("Enter Nurse Salary: ");
                            //         double salary = sc.nextDouble();
                            //         sc.nextLine(); // Consume the newline character
                            
                            //         // Create a nurse and set their details
                            //         Nurse nurse = new Nurse();
                            //         nurse.setNurseId(nurseId);
                            //         nurse.setFirstName(firstName);
                            //         nurse.setLastName(lastName);
                            //         nurse.setGender(gender);
                            //         nurse.setEmail(email);
                            //         nurse.setYearsOfExperience(yearsOfExperience);
                            
                            //         nurse.setSalary(salary);
                            
                            //         // Add the nurse to the system
                            //         healthCareSystem.addNurse(nurse);
                            
                            //         System.out.println("Nurse added successfully!");
                            //     }
                            
                            //     private static void calculatePayment(Scanner sc, HealthCareSystem healthCareSystem) {
                                //         System.out.print("Enter Patient ID: ");
                                //         long patientId = sc.nextLong();
                                
                                //         // Retrieve the patient from the system based on their ID
                                //         Patient patient = healthCareSystem.getPatientById(patientId);
                                
                                //         if (patient != null) {
                                    //             System.out.print("Enter Bill Amount: ");
                                    //             double billAmount = sc.nextDouble();
                                    
                                    //             // Capture patient age and smoking status here...
                                    //             System.out.print("Enter Patient Age: ");
                                    //             int patientAge = sc.nextInt();
                                    
                                    //             System.out.print("Is the Patient a Smoker? (true/false): ");
                                    //             boolean patientSmokes = sc.nextBoolean();
                                    
                                    //             // Calculate payment amount for the patient
                                    //             double[] payments = Billing.computePaymentAmount(patient, billAmount, patientAge, patientSmokes);
                                    
                                    //             // Display payment details
                                    //             System.out.println("Insurance Payment: " + payments[0]);
                                    //             System.out.println("Patient Payment: " + payments[1]);
                                    //         } else {
                                        //             System.out.println("Patient not found!");
                                        //         }
                                        //     }
                                        // }
                                        