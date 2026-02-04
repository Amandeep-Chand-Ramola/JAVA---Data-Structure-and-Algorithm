import java.util.Scanner;

public class MulTable {

    // Main method
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Taking a number as input.
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        // Looping for 10 times to get 10 multiple of number
        for(int i = 1; i <= 10; i++){
            System.out.println(n+" X "+ i +" = " + n*i);    // Printing respective multiple
        }
        sc.close();
    }
}
