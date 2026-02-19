import java.util.Scanner;
class shape
{
    void calculateArea(float side)
    {
        System.out.println("Area of Square:" + (side*side));
    }
    void calculateArea(int length, int breadth)
    {
        System.out.println("Area of Rectangle:" + (length*breadth));
    }
    void calculateArea(double radius)
    {
        double area = 3.14 * radius *radius;
        System.out.println("Area of Circle:" + area);
    }
     public static void main(String arg[])
     {
        shape s = new shape();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Side of Square:");
        float side = sc.nextFloat();
        s.calculateArea(side);

        System.out.println("Enter the Length and Breadth of Rectangle:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        s.calculateArea(length,breadth);

        System.out.println("Enter the Raius of the Circle:");
        double radius = sc.nextDouble();
        s.calculateArea(radius);
     }
}