import java.util.Arrays;
import java.util.Scanner;
public class StringSort
{
    public static void main(String[] args)
    {
        int count=0;
        String tmp;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter~number~of~strings~to~sort:");
        count=scan.nextInt();
        String str_list[]=new String[count];
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter~your~strings:");
        for(int i=0;i<count;i++)
            str_list[i]=scan1.nextLine();
            System.out.println("choose~1~or~2~from~the~menu~below");
            System.out.println("1:~inbuilt~sort()");
            System.out.println("2:~user~defined~sorting~logic()");
            int choice;
            choice=scan.nextInt();
            switch(choice)
            {
                case 1:Arrays.sort(str_list);
                    System.out.println(Arrays.toString(str_list));
                break;
                case 2:for(int i=0;i<count-1;i++)
                for(int j=i+1;j<str_list.length;j++)
                    if(str_list[i].compareTo(str_list[j])>0)
                    {
                        tmp=str_list[i];
                        str_list[i]=str_list[j];
                        str_list[j]=tmp;
                    }
                    System.out.println(Arrays.toString(str_list));
                break;
            }
    }
}
