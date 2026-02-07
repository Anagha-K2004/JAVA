class Student
{
    int id;
    String name;
    float mark;

    void get(int id1, String n, float m)
    {
        id = id1;
        name = n;
        mark = m;
    }

    void show()
    {
        System.out.println("my id is " + id);
        System.out.println("my name is " + name);
        System.out.println("my mark is " + mark);
    }
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.get(1, "Anu", 21);
        s1.show();
    }
}
