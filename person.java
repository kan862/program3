package program3;

import java.time.LocalDate;
import java.time.Period;

public class person {
    String name;

    // Constructor
    person(String name) {
        this.name = name;
    }

    // Display person's name
    void displayName() {
        System.out.println("Name: " + name);
    }

    // Display person's age from DOB (format: YYYY-MM-DD)
    void displayAge(String dob) {
        LocalDate birthDate = LocalDate.parse(dob);  // expects format YYYY-MM-DD
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        System.out.println("Age: " + age + " years");
    }

    // Main method for testing
    public static void main(String[] args) {
        person p = new person("John");
        p.displayName();
        p.displayAge("2000-01-15"); // Use format YYYY-MM-DD
    }
}

