import java.util.Scanner;
public class IntegerNum
{
    public static class InvalidNumberException extends Exception
    {
        public InvalidNumberException()
        {
            super("Please provide a valid number!");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c,num,sum=0;
        double avg;
        System.out.println("ENter the Count:");
        c=sc.nextInt();
        System.out.println("Enter the Number:");
        for(int i=0;i<c;i++)
        {
            try
            {
                num=sc.nextInt();
                if(num>0)
                {
                    sum+=num;
                }
                else
                {
                    i--;
                    throw new InvalidNumberException();
                }
            }
            catch(InvalidNumberException e)
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Sum is "+sum);
        System.out.println("avg is "+sum/c);
    }
}