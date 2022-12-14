import java.util.*;
class Factorial
{
    public static void main (String[] args)
    {
        double a = 1;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial number- ");
        int c = sc.nextInt();
        while(b <= c)
        {
            a = a*b;
            b++;
        }
        System.out.println("Factorial of " + c +" is- " +a);
    }
}