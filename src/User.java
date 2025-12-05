/**
 * IS 147 Requirement: Encapsulation, Math, Arrays, Overloading
 * This class manages the user profile and the history of workouts.
 */
public class User {

    private static final double INCHES_TO_METERS = 0.0254;
    private static final double LBS_TO_KG = 0.453592;


    public static int userCount = 0;

    private String name;
    private int age;
    private double heightInches;
    private double weightLbs;


    private Activity[] workoutLog;
    private int logCount; // Tracks number of items in array

    public User(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.heightInches = height;
        this.weightLbs = weight;
        this.workoutLog = new Activity[100]; // Fixed size array
        this.logCount = 0;
        userCount++;
    }


    public void updateProfile(double newWeight) {
        this.weightLbs = newWeight;
    }


    public void updateProfile(String newWeightStr) {
        try {
            this.weightLbs = Double.parseDouble(newWeightStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }


    public double calculateBMI() {
        double weightKg = this.weightLbs * LBS_TO_KG;
        double heightM = this.heightInches * INCHES_TO_METERS;

        // BMI = kg / m^2
        return weightKg / Math.pow(heightM, 2);
    }


    public void logActivity(Activity a) {
        if (logCount < workoutLog.length) {
            workoutLog[logCount] = a;
            logCount++;
        } else {
            System.out.println("Log is full!");
        }
    }


    public void showProgress(String filterName) {
        System.out.println("\n--- Progress for: " + filterName + " ---");
        boolean found = false;


        for (int i = 0; i < logCount; i++) {
            if (workoutLog[i].getName().equalsIgnoreCase(filterName)) {
                // Req 23: Printf
                System.out.printf("Date: %s -> %s%n",
                        workoutLog[i].getDate().toString(),
                        workoutLog[i].getDetails());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No records found for this exercise.");
        }
    }


    public void printStats() {
        double bmi = calculateBMI();

        // Req 4: Conditional Operator
        String healthStatus = (bmi >= 18.5 && bmi <= 24.9) ? "Normal Weight" :
                (bmi < 18.5) ? "Underweight" : "Overweight/Obese";

        System.out.println("\n*** USER PROFILE ***");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.printf("BMI: %.2f (%s)%n", bmi, healthStatus);
        System.out.println("Total Workouts Logged: " + logCount);
    }
}