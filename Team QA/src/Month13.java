import java.util.Scanner;

public class SwitchProgram {
    Scanner sc = new Scanner(System.in);
    // no return // no parameter
    void switchmonth() {
        System.out.println(" Enter any number 1 to 12");
        int number= sc.nextInt();
        switch (number)
        {case 1:
                System.out.println(" This month is January  " );
                break;
            case 2: System.out.println("February");
                break;
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("Sepember");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid");
        }}

    public static void main(String[] args) {
        SwitchProgram switchProgram = new SwitchProgram();
        switchProgram.switchmonth();

    }
}
