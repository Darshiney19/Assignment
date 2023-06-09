import java.util.*;
import java.lang.*;

class Cabs
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int X=sc.nextInt();
            int Y=sc.nextInt();
            if(X<Y)
            {
                System.out.println("FIRST");
            }
            else if (X==Y)
            {
                System.out.println("ANY");
            }
            else
            {
                System.out.println("SECOND");
            }
        }
    }
}
