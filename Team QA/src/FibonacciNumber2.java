import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Given number n, print Fibonacci number
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        int a=0,b=1,c;
 for ( int i =1;i<=num ;i++)
  {
      c=a+b;
      System.out.println(""+c);
      a=b;
      b=c;

  }


    }
}
