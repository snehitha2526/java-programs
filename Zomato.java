public class Zomato
{
    static String name = "Magician";
    static int age = 100;

    public static void m1()
    {
        int height = 6;
        m2();
    }

    public static void m2()
    {
        char gender = 'F';
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        System.out.println(name);
        m1();
    }
}