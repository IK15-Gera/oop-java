package de.benklett.aufgabe2;

public class Aufgabe2 {
    public static void run(String[] args) {
        String day = dateToDayOfWeek(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

        System.out.println("Der " + args[0] + "." + args[1] + "." + args[2] + " ist ein "+ day);
    }

    static String dateToDayOfWeek(int day, int month, int year) {

        int d = day;
        int m = month;
        int y = year % 100;
        int c = year - y;

        if (m < 3) {
            if (m == 1)
                m = 13;
            else if (m == 2)
                m = 14;
        }

        int dayOfWeek = d;
        dayOfWeek += (26 * (m + 1))/10;
        dayOfWeek += (5 * y)/4;
        dayOfWeek += c / 4;
        dayOfWeek += 5 * c;
        dayOfWeek -= 1;
        dayOfWeek %= 7;

        switch (dayOfWeek) {
            case 0:
                return "Sonntag";
            case 1:
                return "Montag";
            case 2:
                return "Dienstag";
            case 3:
                return "Mittwoch";
            case 4:
                return "Donnerstag";
            case 5:
                return "Freitag";
            case 6:
                return "Samstag";
            default:
                return "fail";
        }
    }
}
