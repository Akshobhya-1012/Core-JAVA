package Lab5;

import java.util.Scanner;
 
class Doctor {
    String name;
    String specialty;
 
    Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }
}
 
class Patient {
    String name;
    String problem;
 
    Patient(String name, String problem) {
        this.name = name;
        this.problem = problem;
    }
}
 
public class Q4_DoctorPatientSystem {
 
    static final int MAX = 100;
    static Doctor[] doctors = new Doctor[MAX];
    static Patient[] patients = new Patient[MAX];
    static int doctorCount = 0;
    static int patientCount = 0;
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n====== Doctor & Patient Information System ======");
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Patient");
            System.out.println("3. View Doctors");
            System.out.println("4. View Patients");
            System.out.println("5. Update Doctor");
            System.out.println("6. Update Patient");
            System.out.println("7. Delete Doctor");
            System.out.println("8. Delete Patient");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline
 
            switch (choice) {
                case 1 -> addDoctor();
                case 2 -> addPatient();
                case 3 -> viewDoctors();
                case 4 -> viewPatients();
                case 5 -> updateDoctor();
                case 6 -> updatePatient();
                case 7 -> deleteDoctor();
                case 8 -> deletePatient();
                case 9 -> System.out.println("Exiting the system.");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 9);
    }
 
    static void addDoctor() {
        if (doctorCount < MAX) {
            System.out.print("Enter Doctor Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Specialty: ");
            String specialty = sc.nextLine();
            doctors[doctorCount++] = new Doctor(name, specialty);
            System.out.println("Doctor added successfully!");
        } else {
            System.out.println("Doctor list is full.");
        }
    }
 
    static void addPatient() {
        if (patientCount < MAX) {
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Problem: ");
            String problem = sc.nextLine();
            patients[patientCount++] = new Patient(name, problem);
            System.out.println("Patient added successfully!");
        } else {
            System.out.println("Patient list is full.");
        }
    }
 
    static void viewDoctors() {
        if (doctorCount == 0) {
            System.out.println("No doctors available.");
        } else {
            System.out.println("----- Doctors List -----");
            for (int i = 0; i < doctorCount; i++) {
                System.out.println((i + 1) + ". Name: " + doctors[i].name + ", Specialty: " + doctors[i].specialty);
            }
        }
    }
 
    static void viewPatients() {
        if (patientCount == 0) {
            System.out.println("No patients available.");
        } else {
            System.out.println("----- Patients List -----");
            for (int i = 0; i < patientCount; i++) {
                System.out.println((i + 1) + ". Name: " + patients[i].name + ", Problem: " + patients[i].problem);
            }
        }
    }
 
    static void updateDoctor() {
        viewDoctors();
        System.out.print("Enter doctor number to update: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();
        if (idx >= 0 && idx < doctorCount) {
            System.out.print("Enter new name: ");
            doctors[idx].name = sc.nextLine();
            System.out.print("Enter new specialty: ");
            doctors[idx].specialty = sc.nextLine();
            System.out.println("Doctor updated.");
        } else {
            System.out.println("Invalid doctor number.");
        }
    }
 
    static void updatePatient() {
        viewPatients();
        System.out.print("Enter patient number to update: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();
        if (idx >= 0 && idx < patientCount) {
            System.out.print("Enter new name: ");
            patients[idx].name = sc.nextLine();
            System.out.print("Enter new problem: ");
            patients[idx].problem = sc.nextLine();
            System.out.println("Patient updated.");
        } else {
            System.out.println("Invalid patient number.");
        }
    }
 
    static void deleteDoctor() {
        viewDoctors();
        System.out.print("Enter doctor number to delete: ");
        int idx = sc.nextInt() - 1;
        if (idx >= 0 && idx < doctorCount) {
            for (int i = idx; i < doctorCount - 1; i++) {
                doctors[i] = doctors[i + 1];
            }
            doctorCount--;
            System.out.println("Doctor deleted.");
        } else {
            System.out.println("Invalid doctor number.");
        }
    }		
 
    static void deletePatient() {
        viewPatients();
        System.out.print("Enter patient number to delete: ");
        int idx = sc.nextInt() - 1;
        if (idx >= 0 && idx < patientCount) {
            for (int i = idx; i < patientCount - 1; i++) {
                patients[i] = patients[i + 1];
            }
            patientCount--;
            System.out.println("Patient deleted.");
        } else {
            System.out.println("Invalid patient number.");
        }
    }
}
 