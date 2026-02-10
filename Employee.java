import java.util.*;
class Employee
{
    int id;
    String name;
    float salary;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Monthly Salary:");
        salary = sc.nextFloat();
    }
    public void display()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);

    }
    public static void main(String[]args)
    {
        Employee e=new Employee();
        e.get();
        e.display();

        Employee e1=new Employee();
        e1.get();
        e1.display();

        Employee e2=new Employee();
        e2.get();
        e2.display();
    }
}
