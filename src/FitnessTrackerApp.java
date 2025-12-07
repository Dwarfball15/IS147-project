/**
 * The "main" class. Responsible for calling all the other classes, running the actual program.
 */
import java.util.Scanner;
import java.util.Random; // Req 19: Random

public class FitnessTrackerApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the UMBC Fitness Tracker!");
        System.out.println("Please create your profile.");

        System.out.print("Enter Name: ");
        String name = scan.nextLine();

        System.out.print("Enter Age: ");
        int age = scan.nextInt();

        System.out.print("Enter Height (inches): ");
        double height = scan.nextDouble();

        System.out.print("Enter Weight (lbs): ");
        double weight = scan.nextDouble();


        User user = new User(name, age, height, weight);


        boolean running = true;


        do {
            System.out.println("\n============================");
            System.out.println("      MAIN MENU");
            System.out.println("============================");
            System.out.println("1. Log Strength Workout (Bench/Squat/Deadlift)");
            System.out.println("2. Log Cardio Workout");
            System.out.println("3. View Progress by Exercise");
            System.out.println("4. View Profile & BMI");
            System.out.println("5. Update Body Weight");
            System.out.println("6. Tip of the Day (Random)");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            int choice = scan.nextInt();
            scan.nextLine();

            //Switch Statement
            switch (choice) {
                case 1:
                    System.out.print("Enter Exercise (Bench/Squat/Deadlift): ");
                    String sName = scan.nextLine();
                    System.out.print("Weight (lbs): ");
                    double w = scan.nextDouble();
                    System.out.print("Sets: ");
                    int sets = scan.nextInt();
                    System.out.print("Reps: ");
                    int reps = scan.nextInt();


                    Activity strength = new StrengthExercise(sName, sets, reps, w);
                    user.logActivity(strength);
                    System.out.println("Strength workout logged!");
                    break;

                case 2:
                    System.out.print("Enter Cardio Type (Running/Cycling): ");
                    String cName = scan.nextLine();
                    System.out.print("Duration (minutes): ");
                    double mins = scan.nextDouble();
                    System.out.print("Distance (miles): ");
                    double miles = scan.nextDouble();

                    Activity cardio = new CardioExercise(cName, mins, miles);
                    user.logActivity(cardio);
                    System.out.println("Cardio workout logged!");
                    break;

                case 3:
                    System.out.print("Enter exercise name to search (e.g., Bench): ");
                    String search = scan.nextLine();
                    user.showProgress(search);
                    break;

                case 4:
                    user.printStats();
                    break;

                case 5:
                    System.out.print("Enter new weight: ");
                    double newW = scan.nextDouble();
                    user.updateProfile(newW);
                    System.out.println("Weight updated.");
                    break;

                case 6:

                    String[] tips = {
                            "Stay hydrated!",
                            "Sleep is key to recovery.",
                            "Don't skip leg day.",
                            "Consistency > Intensity."
                    };
                    Random rand = new Random();
                    int index = rand.nextInt(tips.length);
                    System.out.println("Tip: " + tips[index]);
                    break;

                case 0:
                    running = false;
                    System.out.println("Goodbye! Stay Strong.");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (running);

        scan.close();
    }
}