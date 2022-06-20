package Recursion;
import java.util.Scanner;
public class ComputeFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
    public static long factorial(int n){ return n == 0 ? 1 : n * factorial(n-1); }
}