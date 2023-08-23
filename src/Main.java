import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int x,y,z,n;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        n=sc.nextInt();
        calculate(x,y,z,n);
    }
    static void calculate(int l1,int l2,int l3,int n)
    {
        if(Math.abs(l1-n)<=Math.abs(l2-n) && Math.abs(l1-n)<=Math.abs(l3-n) && n<=l1)
        {
            System.out.println("L1");
        }
        else if(Math.abs(l2-n)<=Math.abs(l1-n) && Math.abs(l2-n)<=Math.abs(l3-n) && n<=l2)
        {
            System.out.println("L2");
        }
        else if(Math.abs(l3-n)<=Math.abs(l1-n) && Math.abs(l3-n)<=Math.abs(l2-n) && n<=l3)
        {
            System.out.println("L3");
        }
        else
        {
            System.out.println("Students can't be fitted");
        }
    }
}