import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfWeek weekDay = DayOfWeek.TUES;
        // skapat en instans av vårt enum

        /*int weekDayInt = weekDay.ordinal() + 1;
        System.out.println("First: " + weekDay.name().charAt(0)); // T
        System.out.println("Second: " + weekDay.name().substring(1).toLowerCase()); // ues
        System.out.println("Third: " + "day is Day " + weekDayInt);*/ // day is Day 2

        /*String str = "Java is a programming language";
        System.out.println(str.substring(0, 4));*/

        // souf
        /*System.out.printf("Name is %s, Ordinal Value = %d%n",
                weekDay.name(), weekDay.ordinal());*/
        /*
            %s formats strings.
            %d formats decimal integers.
            %f formats floating-point numbers.
            %b formats booleans.
            %c formats characters.
            %t formats date/time values.
            %n results in the platform-specific line separator
         */



        //switchDayOfWeek(weekDay);


        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }



    }

    public static void switchDayOfWeek(DayOfWeek weekDay) {

        int weekDayInt = weekDay.ordinal() + 1;

        switch(weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInt);
            case SAT -> System.out.println("Saturday is Day " + weekDayInt);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInt);
        }
    }

    public static DayOfWeek getRandomDay() {
        // skapa en random integer
        int randomInt = new Random().nextInt(7);
        var allDays = DayOfWeek.values();

        return allDays[randomInt];
    }
















}