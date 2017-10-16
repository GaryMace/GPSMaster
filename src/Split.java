/**
 * Created by Gary on 04/01/2016.
 */
public class Split {
    private double split;
    private double time;
    private boolean isProjectedSplit;
    private double elevation;

    public Split(double time, double split, double elev, boolean isProjectedSplit) {
        this.time = time;
        this.split = split;
        this.isProjectedSplit = isProjectedSplit;
        this.elevation = elev;
    }

    public Split(double time, double split, double elev) {
        this.time = time;
        this.split = split;
        this.isProjectedSplit = false;
        this.elevation = elev;
    }
    private String getSpeed() {
        double speed = (split/split)/(time/60/60);
        return String.format("%.2f", speed);
    }

    private String getPace() {
        double secsToMins = time/60;
        int mins = 0;

        while(secsToMins > 1) {
            mins += 1;
            secsToMins -= 1;
        }
        secsToMins *= 60;

        //add leading zero if int is less than 10
        return mins+":"+((secsToMins < 10) ? ("0" + (int)secsToMins) : (int)secsToMins);
    }

    public double getTime() {
        return time;
    }

    public double getSplit() {
        return split;
    }

    public boolean isProjectedSplit() {
        return isProjectedSplit;
    }

    public String getElevation() {
        return String.format("%.2f",elevation);
    }

    //TODO: get elevation
    public String toString() {
        if(isProjectedSplit) {
            return "(P)"+getSpeed()+","+"(P)"+getPace()+","+getElevation();
        }
        else {
            return getSpeed()+","+getPace()+","+getElevation();
        }
    }
}
