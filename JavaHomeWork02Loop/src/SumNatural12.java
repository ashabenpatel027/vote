public class SumNaturalNumber12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter the number:");
        int number = sc.nextInt();
        int sum =0;

        for ( int i=1; i<=number; ++i) {
            System.out.println(i);
            System.out.println(sum +=i); //sum += i;
        }
        System.out.println(" sum of " + number + " natural number=" +sum);
    }
}
}}
