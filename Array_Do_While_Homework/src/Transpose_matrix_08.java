import java.util.Scanner;

public class Traspose_matrix_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many rows you want ?");
        int r = sc.nextInt();
        System.out.println("Enter how many cols you want ");
        int c = sc.nextInt();
        int [][] matA=new int[r][c];
        System.out.println("Enter" + (r*c)+ " vales;");
        // written two for loop bcz 2 dim matrix
        for (int i=0; i<r;i++)
        {
            for (int j=0;j<c; j++)
                matA[i][j]= sc.nextInt();
        }
        System.out.println(" Original Matrix is:");//  two loop outer for ROW & inner for cols
        for (int i=0; i<r;i++)
        {
            for (int j=0;j<c; j++){
                System.out.println(matA[j] [i] + "\t" );
            }
            System.out.println();



    }
}
