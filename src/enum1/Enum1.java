package enum1;

import java.util.Scanner;

public class Enum1 {
    //add, commit, push, fetch, pull, merge and branch

    public static void main(String[] args) {
        // use the enumeration
        System.out.println(Day.MONDAY);

        for (Day d : Day.values()) {
            System.out.println(d);
        }

        Scanner s = new Scanner(System.in);
        System.out.println("enter a day (1-MON, 2-TUE...etc 7-SUN:");
        int day = s.nextInt();

        Day anotherDay = Day.getDay(day);

        switch (anotherDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("sadly it is a weekday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("finally it is a weekend");
                break;
        }
    }

}
// enumeration is a set of named constants
// enumeration is not a class, but it has class syntax
//  enumerations can define data members, have member functions, use constructors
//and use static members as well

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    static Day getDay(int day) {
        Day d = null;
        switch (day) {
            case 1:
                d = MONDAY;
                break;
            case 2:
                d = TUESDAY;
                break;
            case 3:
                d = WEDNESDAY;
                break;
            case 4:
                d = THURSDAY;
                break;
            case 5:
                d = FRIDAY;
                break;
            case 6:
                d = SATURDAY;
                break;
            case 7:
                d = SUNDAY;
                break;
        }
        return d;
    }
}
//google note;

//The enumerated, or enum, data type in Java is used to describe a specific set of values 
//for a variable. They are static or final and type-safe. They can not change or
//be modified. Enum types are reference type,
//meaning they act like a class and can have their own constructors and methods.
