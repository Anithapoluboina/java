//sum for even or odd
import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        while (n != 0) 
        {
            int rem = n % 10;
            if(rem%2==0)
            even+=rem;
            else
            odd+=rem;
            n=n/10;
        }
        System.out.println(+even);
        System.out.println(+odd);
    }
}
