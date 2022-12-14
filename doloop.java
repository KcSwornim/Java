import java.util.*;
class doloop
{
    public static void main (String [] args)
    {
        int b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number or 0 to Stop! ");
        int a = sc.nextInt();
        do{
            {
                b = b+a;
                System.out.println("Enter any number or 0 to Stop! ");
                a = sc.nextInt(); 
            }
        }
        while (a != 0);
        System.out.println("The sum of numbers = " +b);
    }
}