class FibThread implements Runnable
{
    public void run()
    {
        int a=0,b=1,c;
        System.out.printf("FibThread-"+a);
        System.out.printf("FibThread-"+b);
        for(int h=1;h<=7;++h)
        {
            c=a+b;
            System.out.println("FibThread-"+c);
            a=b;
            b=c;
        }
    }
}
class EvenRangeThread implements Runnable
{
    public void run()
    {
        int a=2, b=10;
        for(int k=a;k<=b;k+=2)
        {
            System.out.println("EvenRangeThread-"+k);
        }
    }
}
public class FibEven
{
    public static void main(String[] args)
    {
        FibThread ft=new FibThread();
        EvenRangeThread e1=new EvenRangeThread();
        Thread t1=new Thread(ft);
        Thread t2=new Thread(e1);
        t1.start();
        t2.start();
    }
}