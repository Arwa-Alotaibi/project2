public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

       Car c = new Car("11",171,12,"11:00",12.5,11.6,11.2,44.6);
        Airplane a = new Airplane("11",171,12.3,"11:00",44.44,42.4,33,33);
        System.out.println(c.convertMinToHour(120));
        c.Fuel_Consumption_Calculator();
         c.CalculateDuration();
         a.CalculateDuration();

    }
}