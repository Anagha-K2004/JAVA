import java.util.*;
public class symmetric 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of  matrix:");
        int p = sc.nextInt();
        int q = sc.nextInt();

        int a[][] = new int[p][q];

        System.out.println("Enter the elements of  matrix:");
          for(int i=0;i<p;i++)
          {
            for(int j=0;j<q;j++)
            {
                a[i][j] = sc.nextInt();
            }
          }
        
        System.out.println("The Matrix is:");
          for(int i=0;i<p;i++)
          {
            for(int j=0;j<q;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
          } 
        
          if(p!=q)
          {
              System.out.println("The matrix is not symmetric");
           }
          else
          {
            boolean isSymmetric = true;
              for(int i=0;i<p;i++)
              {
                for(int j=0;j<q;j++)
                 {
                    if(a[i][j] != a[j][i])
                    {
                        System.out.println("The matrix is not symmetric");
                        return;
                    }
                 }
               }
               System.out.println("The matrix is symmetric");
          }
     }
}