import domain.GDate;

public class Main {
    public static void main(String[] args) {
        GDate date1 = new GDate();
        int day1 = 60;

        System.out.println("GDate():\t\t\t" + date1);
        GDate date2 = new GDate(2000, 1, 1);

        System.out.println("GDate(2000, 1, 1):\t" + date1);
        GDate date3 = new GDate(date1);

        GDate date4 = new GDate(2451545);
        System.out.println("GDate(date1):\t\t" + date3);

        GDate date5 = date1.copy();
        System.out.println("Copy of date1:\t\t" + date5);

        GDate date6 = new GDate(2451546);
        GDate date7 = new GDate(2451911);
        GDate date8 = new GDate(2452276);


        System.out.print(date1);
        System.out.print(date1.equals(date3)  ? " = " : " !=" );
        System.out.println(date3);

        System.out.print(date1);
        System.out.print(date1.equals(date6) ? " = " : " != ");
        System.out.println(date6);

        System.out.print(date1);
        System.out.print(date1.greaterThan(date6) ? " > " : " <= " );
        System.out.println(date6);

        System.out.print(date6);
        System.out.print(date6.greaterThan(date1) ? " > " : " <= " );
        System.out.println(date1);

        System.out.print(date7 + " - " + (date3) + " = ");
        System.out.println(date7.diff(date3) + " days");

        System.out.print(date8 + " - " + (date7) + " = ");
        System.out.println(date8.diff(date7) + " days");

        System.out.print(date3 + " + " + (day1) + " days = ");
        System.out.println(date3.add(day1));

        System.out.print(date7 + " + " + (day1) + " days = ");
        System.out.println(date7.add(day1));

        System.out.print("Year of " + (date2) + " = ");
        System.out.println(date2.year());

        System.out.print("Month of " + (date2) + " = ");
        System.out.println(date2.month());

        System.out.print("Day of " + (date2) + " = ");
        System.out.println(date2.day());

        System.out.print("JDN of " + (date2) + " = ");
        System.out.println(date2.julianDay());



    }
}