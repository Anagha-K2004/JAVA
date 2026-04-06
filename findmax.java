import java.awt.*;
import java.awt.event.*;
class findmax extends Frame implements ActionListener
{
    Frame f1=new Frame();
    Label l1=new Label("Enter 1st number:");
    Label l2=new Label("Enter 2nd number:");
    Label l3=new Label("Enter 3rd number:");
    Label l4=new Label("Maximum number:");

    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    TextField t4=new TextField();


    Button b1=new Button("Find Max");
    Button b2=new Button("Cancel");

    findmax()
    {
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setVisible(true);

        l1.setBounds(50,50,100,20);
        t1.setBounds(200,50,100,20);

        l2.setBounds(50,100,100,20);
        t2.setBounds(200,100,100,20);

        l3.setBounds(50,150,100,20);
        t3.setBounds(200,150,100,20);

        l4.setBounds(50,200,100,20);
        t4.setBounds(200,200,100,20);

        b1.setBounds(50,250,80,30);
        b2.setBounds(150,250,80,30);

        f1.add(l1);f1.add(t1);
        f1.add(l2);f1.add(t2);
        f1.add(l3);f1.add(t3);
        f1.add(l4);f1.add(t4);
        f1.add(b1);f1.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)
    {
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        int n3=Integer.parseInt(t3.getText());
        int max=0;
        if(e.getSource()==b1)
        {
            if(n1>n2 && n1>n3)
                max=n1;
            else if(n2>n1 && n2>n3)
                max=n2;
            else
                max=n3;
            t4.setText(String.valueOf(max));
        }
        if(e.getSource()==b2)
        {
            System.exit(0);
        } 
       
}
    public static void main(String args[])
    {
        new findmax();
    }
}