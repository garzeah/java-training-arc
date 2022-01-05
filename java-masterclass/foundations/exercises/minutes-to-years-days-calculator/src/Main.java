public class Main {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600,
                remainingMinutes = minutes % 525600,
                days = remainingMinutes / 1440;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(1440);
        printYearsAndDays(525600);
    }
}
