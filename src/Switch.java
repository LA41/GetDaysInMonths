public class Switch {
    public static void main(String[] args) {
        // check whether year is a leap one
        System.out.println(isLeapYear(2000));
        // check how many days February had 810 years ago
        System.out.println(getDaysInMonth(2, 1212));
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999)
            return false;
        else
            return ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0));
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999)
            return -1;
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (isLeapYear(year))
                    return 29;
                return 28;
            default:
                return 31;

        }
    }
}
