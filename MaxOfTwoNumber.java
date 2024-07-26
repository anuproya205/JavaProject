import java.util.Scanner;
public class MaxOfTwoNumber {
    public static void main(String[] args) {
        /* create a scanner object to read input*/
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number: ");
        int num1= sc.nextInt();
        System.out.println("enter the second number: ");
        int num2= sc.nextInt();
        /* use ternary operator to the find maximum number*/
        int max= (num1>num2)?num1:num2;
        System.out.println("ethe maximum number is "+ max);
        /* close the scanner*/
        sc.close();
    }
}
