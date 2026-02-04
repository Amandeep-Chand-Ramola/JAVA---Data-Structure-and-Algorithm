import java.util.Scanner;

public class leapYear {

    // Function for checking leap year.
    public static boolean isLeapYear(int y){

        // Checking year is divisible by 100 or not
        if(y % 100 == 0){

            // if it is divisible by 100 checking for it's divisibility by 400
            if(y % 400 == 0){
                return true;    // if it is divisible by 400 it is leap year.
            } else {
                return false;   // otherwise it is not leap year.
            }
        }
        // if it is not divisible by 100.
        else if (y % 4 == 0){
            return true;    // divisible by 4 it is leap year.
        } else {
            return false;   // otherwise it is not leap year.
        }
    }

    // Main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Input year from the user
        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

        // Output to user
        if(isLeapYear(year)){
            System.err.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        sc.close();
    }
}
