class Multiple5 extends Thread
{
    public void run()
    {
        int num=5;
        for(int i=1;i<=10;++i)
            System.out.printf("Thread1-Table5:%d*%d=%d\n",num,i,num*i);
    }
}
class primeN extends Thread
{
    public void run()
    {
        int ct=0,n=0,i=1,j=1;
        while(n<5)
        {
            j=1;ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;j++;
            }
            if(ct==2)
            {
                System.out.printf("Thread2-Prime Number:%d\n",i);
                n++;
            }
            i++;
        }
    }
}
public class ThreadClassExp
{
    public static void main(String[]args)
    {
        Multiple5 m5 = new Multiple5();
        primeN pn = new primeN();
        pn.start();
        m5.start();
        
    }
}