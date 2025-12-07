/**
 * Class responsible for things like date and activity name
 */
import java.util.Date;

public abstract class Activity {

    private Date date;
    private String name;

    //Constructor
    public Activity(String name) {
        this.name = name;

        this.date = new Date();
    }


    public String getName() {
        return this.name;
    }

    public Date getDate() {
        return this.date;
    }


    public abstract String getDetails();
}