/*
    Prime Number

    Output->
    Enter the number:
    23
    Prime
 */
import java.util.*;
class PrimeNumber
{
    public static void main(String args[])
    {
            Scanner in = new Scanner(System.in);
            PrimeNumber obj = new PrimeNumber();
            System.out.println("Enter the number: ");
            int n= in.nextInt();
            obj.check(n);
            in.close();
    }
    void check(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println("Not Prime");
                System.exit(0);
            }
        }
        System.out.println("Prime");
    }
}