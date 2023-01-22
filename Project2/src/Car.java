public class Car extends  Trip{
    double fuel;
    double miles;
    double gallons;
    double lpk;
    double mpg;



    public Car(String tripNumber, double distance, double speed, String startTime , double fuel, double gallons , double miles ,double mpg
) {
        super(tripNumber, distance, speed, startTime);
        this.fuel= fuel;
        this.gallons = gallons;
        this.miles=miles;
        this.mpg=mpg;
    }

    public double getFuel() {
        return fuel;
    }

    public double getMiles() {
        return miles;
    }

    public double getGallons() {
        return gallons;
    }

    public double getLpk() {
        return lpk;
    }

    public double getMpg() {
        return mpg;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public void setGallons(double gallons) {
        this.gallons = gallons;
    }

    public void setLpk(double lpk) {
        this.lpk = lpk;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public  void Fuel_Consumption_Calculator(){
       lpk = (fuel/super.getDistance());
       miles = super.getDistance()*0.6214;
        gallons = fuel*0.2642;
       mpg=miles/gallons;
        String lpk1=String.format("%.2f",lpk);
        String mpg1=String.format("%.2f",mpg);
        System.out.println("Liters/100KM"+lpk1);
        System.out.println("Miles/gallons"+mpg1);
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
