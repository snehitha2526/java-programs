public class Demo
{
    static String name="magic";
    int age=100;
    public static void main(String []args)
    {
        Demo d1=new Demo();
        System.out.println(name);
        System.out.println(d1.age);
        name="logic";
        d1.age=200;
        System.out.println(name);
        System.out.println(d1.age);
    }
}