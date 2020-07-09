import java.util.Scanner;

public class MatrixStraightLineFinder {


    private static void straightLineFinder(int x1, int y1, int x2, int y2) {

        //Code to verify if a straight line exists
        // BLOCK - 2

        if (x1 == x2)
            System.out.println("Straight Line Exists !!");
        else if(y1 == y2)
            System.out.println("Straight Line Exists !!");
        else{
            if(Math.abs(x2-x1) == Math.abs(y2-y1))
                System.out.println("Straight Line Exists !!");
            else
                System.out.println("Straight Line does not Exist !!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Code to take From and To values,
        // to find whether they for a straight line or not
        // BLOCK - 1

        System.out.println("Enter the From coordinates: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter the From coordinates: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        straightLineFinder(x1, y1, x2, y2);
    }
}
