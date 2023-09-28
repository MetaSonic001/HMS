public class HealthCareSystem {
    private Patient[] patients;
    private Doctor[] doctors;
    private Nurse[] nurses;
    private Staff[] staffList;
    private int patientCount;
    private int doctorCount;
    private int nurseCount;
    private int staffCount;

    public HealthCareSystem(int maxPatients, int maxDoctors, int maxNurses, int maxStaff) {
        patients = new Patient[maxPatients];
        doctors = new Doctor[maxDoctors];
        nurses = new Nurse[maxNurses];
        staffList = new Staff[maxStaff];
        patientCount = 0;
        doctorCount = 0;
        nurseCount = 0;
        staffCount = 0;
    }

    public void addPatient(Patient patient) {
        if (patientCount < patients.length) {
            patients[patientCount] = patient;
            patientCount++;
        } else {
            System.out.println("Patient capacity reached. Cannot add more patients.");
        }
    }

    public void addDoctor(Doctor doctor) {
        if (doctorCount < doctors.length) {
            doctors[doctorCount] = doctor;
            doctorCount++;
        } else {
            System.out.println("Doctor capacity reached. Cannot add more doctors.");
        }
    }

    public void addNurse(Nurse nurse) {
        if (nurseCount < nurses.length) {
            nurses[nurseCount] = nurse;
            nurseCount++;
        } else {
            System.out.println("Nurse capacity reached. Cannot add more nurses.");
        }
    }

    public void addStaff(Staff staff) {
        if (staffCount < staffList.length) {
            staffList[staffCount] = staff;
            staffCount++;
        } else {
            System.out.println("Staff capacity reached. Cannot add more staff.");
        }
    }

    public Patient getPatientById(long patientId) {
        for (int i = 0; i < patientCount; i++) {
            if (patients[i].getPatientId() == patientId) {
                return patients[i];
            }
        }
        return null; // Patient not found
    }

    // Add other methods and getters as needed
}
