/**
 * Class is in charge of prompting cardio exercises and duration
 */
public class CardioExercise extends Activity {

    private double durationMinutes;
    private double distanceMiles;

    public CardioExercise(String name, double durationMinutes, double distanceMiles) {
        super(name);
        this.durationMinutes = durationMinutes;
        this.distanceMiles = distanceMiles;
    }

    @Override
    public String getDetails() {
        return String.format("%-15s | Duration: %5.1f min | Distance: %5.1f mi",
                getName(), durationMinutes, distanceMiles);
    }
}