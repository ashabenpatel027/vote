import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //to check input  number is prime
        //  number which has only two factor 1 and itself
        int n , count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number");
        n = s.nextInt();

            for ( int i=1; i<=n; i++) {
                if (n % i == 0) {
                    count++;
                }}
               if (count==2){
                System.out.println(" prime number");

            }else{
                    System.out.println( " not prime number");
                }
        }
    }





