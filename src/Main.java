import java.util.Scanner;
public class Main {
    public static void main(String[] args)

    {
        double sideA = 0;
        double sideB= 0;
        double sideC = 0;
        double sideD = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of sideA");
        if(in.hasNextDouble())
        {
            sideA = in.nextDouble();
            in.nextLine();
        }
        else
        {
                trash = in.nextLine();
                System.out.println("/n You said your side was " + trash);
                System.out.println("Run the program again and enter a valid amount");
                System.exit(0);
        }
        System.out.print("Enter the length of sideB");
        if(in.hasNextDouble())
        {
            sideB = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("/n You said your side was " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }
        System.out.print("Enter the length of sideC");
        if(in.hasNextDouble())
        {
            sideC = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("/n You said your side was " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }
        System.out.print("Enter the length of sideD");
        if(in.hasNextDouble())
        {
            sideD = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("/n You said your side was " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }

        area = sideA * sideB;
        perimeter = sideA + sideB + sideC + sideD;
        diagonal = Math.sqrt((sideA * sideA + sideB * sideB));
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal of the rectangle is " + diagonal);
    }
}