import java.util.Scanner;

public class Sum {

    // Function which will perform addition of two numbers.
    public static int add(int n, int m){
        return n + m;   // return sum of number provided.
    }

    // Main function.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // input two numbers.
        System.out.print("Enter Two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Getting sum from add funtion.
        int sum = add(a, b);

        // Output sum.
        System.out.println("Sum of " + a +", " + b + " is " + sum);
        sc.close();
    }
}
