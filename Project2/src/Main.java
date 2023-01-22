public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");

       Car c = new Car("11",171,12,"11:00");
        Airplane a = new Airplane("11",171,12.3,"11:00");
        System.out.println(c.convertMinToHour(120));
         c.CalculateDuration();
         a.CalculateDuration();

    }
}