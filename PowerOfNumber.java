import java.util.*;  
public class PowerOfNumber  
{  
public static void main(String args[])   
{   
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the base: ");  
int base=sc.nextInt();  
System.out.print("Enter the exponent: ");  
int exponent=sc.nextInt();  
int expo ;
expo=exponent;  
long power = 1;  
while (exponent != 0)   
{  
power = power * base;  
--exponent;  
}  
System.out.println(base +" to the power " +expo + " is: "+power);  
}  
}  