public class Car extends  Trip{



    public Car(String tripNumber, double distance, double speed, String startTime
) {
        super(tripNumber, distance, speed, startTime);

    }



    public int CalculateDuration() {

        double time = super.getDistance()/super.getSpeed();
        // Converting Double data to String data
        String timestr = Double.toString(time);
        //The substring() method extracts characters, between two indices (positions), from a string, and returns the substring.
        String hour = timestr.substring(0,2);
        String min = timestr.substring(3,5);
        int hoursint = Integer.valueOf(hour);
        int minint = Integer.valueOf(min)*60;
        String journeytime = hoursint +":"+ minint;
        System.out.println(journeytime);
        return  0;
    }


}
