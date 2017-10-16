/**
 * Created by Gary on 25-Nov-15.
 */
public class GlobalPosition {
        private double latitude, longitude, elevation;
        private Time time;

        public GlobalPosition(double latitude, double longitude, double elevation, String time) {
                this.latitude = latitude;
                this.longitude = longitude;
                this.elevation = elevation;
                this.time = new Time(time);
        }

        public double getLatitude() {
                return latitude;
        }

        public double getLongitude() {
                return longitude;
        }

        public double getElevation() {
                return elevation;
        }

        public Time getTime() {
                return time;
        }

        @Override
        public String toString() {
                return "GlobalPosition{" +
                        "latitude=" + latitude +
                        ", longitude=" + longitude +
                        ", elevation=" + elevation +
                        ", time=" + time +
                        '}';
        }
}
