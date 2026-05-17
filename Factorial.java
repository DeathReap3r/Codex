/*
    Factorial

    Output->
    Enter the number:
    5
    Factorial of 5 is 120
 */
import java.util.*;
class Factorial
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Factorial obj = new Factorial();
        System.out.println("Enter the number: ");
        int n= in.nextInt();
        obj.calc(n);
        in.close();
    }
    void calc(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
            f=f*i;
        System.out.println("Factorial of "+n+" is "+f);
    }
}