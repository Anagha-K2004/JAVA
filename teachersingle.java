import java.util.*;
class employee
{
    int empid;
    String name;
    float salary;
    String address;

    employee()
    {   
    }

    employee(int empid,String name,float salary,String address)
    {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.address=address;
    }
}
class Teacher extends employee
{
    String dept,sub;
    Teacher(int empid,String name,float salary,String address,String dept,String sub)
    {
        super(empid,name,salary,address);
        this.dept=dept;
        this.sub=sub;
    }
    public void display()
    {
        System.out.println("\nTeacher id\n: "+empid);
        System.out.println("\nTeacher Name\n: "+name);
        System.out.println("\nTeacher Salary\n "+salary);
        System.out.println("\nTeacher Address\n: "+address);
        System.out.println("\n Teacher Department\n: "+dept);
        System.out.println("\n Teacher Subject:\n "+sub);
    }
}
public class teachersingle
{
    public static void main(String[]args)
    {
        System.out.println("Enter the details one by one:");
        
        Scanner sc=new Scanner(System.in);
        int tid;
        String name;
        float salary;
        String add;
        String dept,sub;
        
            System.out.println("Enter teacher id:");
            tid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter teacher name:");
            name=sc.nextLine();
            System.out.println("Enter teacher salary:");
            salary=sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter teacher address:");
            add=sc.nextLine();
            System.out.println("Enter teacher department:");
            dept=sc.nextLine();
            System.out.println("Enter teacher subject:");
            sub=sc.nextLine();
            Teacher t1=new Teacher(tid,name,salary,add,dept,sub);
       
        System.out.println("\nDisplaying  teacher details:");
        t1.display();
        
    }
}