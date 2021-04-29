import java.util.*;
public class AnyBasetoDecimal
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int b=s.nextInt();
        int d=anybasetodecimal(n,b);
        System.out.println(d);
    }
    public static int anybasetodecimal(int n,int b)
    {
        int rv=0;
        int power=1;
        while(n>0)
        {
         int dig=n%10;
         n=n/10;
         rv+=power*dig;
         power=power*b;
        }
        return rv;
    }
}
