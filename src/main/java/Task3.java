import java.time.Year;

public class Task3 {
    /*
    TODO: write a program to check if given year is a leap year
     */
    public static void main(String[] args) {
        solution1(1920);
        solution2(1920);
        solution1(1996);
        solution2(1996);
        solution1(2000);
        solution2(2000);
        solution1(2100);
        solution2(2100);
    }

    public static void solution1(int y) {
        if (y % 400 == 0 ) {
            System.out.println(y+" is a leap year");
        } else if (y % 100 == 0 ) {
            System.out.println(y+ " is not a leap year");
        } else if (y % 4 == 0) {
            System.out.println(y+ " is a leap year");
        } else {
            System.out.println(y+ " is not a leap year");
        }
    }

    public static void solution2(int y) {
        if (Year.isLeap(y)) {
            System.out.println(y+" is a leap year");
        } else {
            System.out.println(y+" is not a leap year");
        }
    }
}
