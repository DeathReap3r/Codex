/*
    Even/Odd

    Output->
    Enter the number:
    2
    The number is Even.
 */
import java.util.*;
class OddEven
{
    public static void main(String[] args)
    {
        OddEven obj = new OddEven();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= in.nextInt();
        obj.check(n);
        in.close();
    }
    void check(int n)
    {
        if(n%2==0)
            System.out.println("The number is Even.");
        else
            System.out.println("The number is Odd.");
    }
}