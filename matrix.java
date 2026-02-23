import java.util.*;
public class matrix 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of 1st matrix:");
        int p = sc.nextInt();
        int q = sc.nextInt();

        System.out.println("Enter the number of rows and columns of 2nd matrix:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int[p][q];
        int b[][] = new int[m][n];
        int c[][] = new int[p][n];
        if(p==m && q==n)
        {
          System.out.println("Enter the elements of 1st matrix:");
          for(int i=0;i<p;i++)
          {
            for(int j=0;j<q;j++)
            {
                a[i][j] = sc.nextInt();
            }
          }

          System.out.println("Enter the elements of 2nd matrix:");
          for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                b[i][j] = sc.nextInt();
            }
          }

          System.out.println("The First Matrix is:");
          for(int i=0;i<p;i++)
          {
            for(int j=0;j<q;j++)
            {
                System.out.println(a[i][j] + " ");
            }
          } 

          System.out.println("The Second Matrix is:");
          for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
                System.out.println(b[i][j] + " ");
            }
          }

          for(int i=0;i<p;i++)
          {
            for(int j=0;j<n;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
          } 

          System.out.println("Resultant matrix is:");
          for(int i=0;i<p;i++)
          {
            for(int j=0;j<n;j++)
            {
                System.out.println(c[i][j] + " ");
            }
          }
        }
        else
        {
            System.out.println("Matrix addition is not possible");
        }
     }
}