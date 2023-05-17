import java.util.Scanner;

public class VoteEligiblety {

}


public class VoteProgramm {
    static Scanner scanner = new Scanner(System.in);


    public static void eligibleForVote() {
        //acknowledge the user what to enter
        System.out.println("please enter your age in inter value");

        // storing age in variable using scanner object
        int age =scanner.nextInt();
        if (age >= 18) {
            System.out.println("you are eligible for vote as you age is :" + age);


        } else {
            System.out.println("you are not eligible for vote as your age is :" + age);
        }

    }


    public static void main(String[] args) {
        // creating class object to call static method in static area
        VoteProgramm voteProgramm = new VoteProgramm();
        //calling method using class object
        VoteProgramm.eligibleForVote() ;}}