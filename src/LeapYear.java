import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a year = ");
        int year = scanner.nextInt();
        boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = ((year % 100 == 0) || (year % 400 == 0));
        if (x && (y || z)){
            System.out.print("leap year");
        }
        else{
            System.out.print("not a leap year");
        }
    }
}
