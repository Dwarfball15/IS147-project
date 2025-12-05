/**
 * IS 147 Requirement: Inheritance
 * Represents lifting exercises (Bench, Squat, Deadlift).
 */
public class StrengthExercise extends Activity {


    private int sets;
    private int reps;
    private double weight;

    public StrengthExercise(String name, int sets, int reps, double weight) {

        super(name);
        this.sets = sets;
        this.reps = reps;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }


    @Override
    public String getDetails() {

        return String.format("%-15s | Weight: %6.1f lbs | %d Sets x %d Reps",
                getName(), weight, sets, reps);
    }
}