/**
 * Created by Gary on 27-Nov-15.
 */
public class Time {
    private int hours;
    private int minutes;
    private float seconds;

    public Time(String time) {
        String[] partitions = time.split(":");
        this.hours = Integer.parseInt(partitions[0]);
        this.minutes = Integer.parseInt(partitions[1]);
        this.seconds = Float.parseFloat(partitions[2]);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public float getSeconds() {
        return seconds;
    }

}
