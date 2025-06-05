//Sum of N natural numbres
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int i=1;
        while (i<=num) 
        {
            sum=sum+i;
            i++;
        }
         System.out.println("Sum = " + sum);
    }
}