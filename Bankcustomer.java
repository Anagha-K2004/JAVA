import java.util.Scanner;

class Bank {
    String bankName;
    String place;

   
    Bank(String name) {
        this.bankName = name;
        
    }

    void displayBank() {
        System.out.println("Bank Name: " + bankName);
       
    }
}


class Customer extends Bank {
    int accno;
    String cusname;

    
    Customer(String name, int accno, String cusname) {
        super(name); 
        this.accno = accno;
        this.cusname = cusname;
    }

    void displayCustomer() {
        System.out.println("Account Number: " + accno);
        System.out.println("Customer Name: " + cusname);
    }
}


public class Bankcustomer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bank Name:");
        String cname = sc.nextLine();

        System.out.println("Enter Account Number:");
        int accno = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String cusname = sc.nextLine();

       
       
        Customer c = new Customer(cname, accno, cusname);

        
        System.out.println("\n ---customer Details ---");
        c.displayBank();
        c.displayCustomer();
    }
}
