import java.text.Format;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract  class Trip {
    private String tripNumber ;

    private double distance ;

    private  double speed ;

    private String startTime ;



    public Trip(String tripNumber , double distance , double speed ,String startTime ) {
        this.tripNumber = tripNumber;
        this.distance = distance ;
        this.speed = speed ;
        this.startTime = startTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public double getDistance() {
        return distance;
    }

    public double getSpeed() {
        return speed;
    }


    //Time = Distance / Speed
    public  abstract int CalculateDuration();

    public  static double convertMinToHour(int min){
        double hour = min/60;
        return hour ;
    }



    public  String CalculateArrivalTime( ){
        double time = distance/speed;
        // Converting Double data to String data
        String timestr = Double.toString(time);
        //The substring() method extracts characters, between two indices (positions), from a string, and returns the substring.
        String hour = timestr.substring(0,2);
        String min = timestr.substring(3,5);
        int hoursint = Integer.valueOf(hour);
        int minint = Integer.valueOf(min)*60;
        String journeytime = hoursint +":"+ minint;
        return  journeytime;
    }




}


