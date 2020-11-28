package Razdel_1;

public class Zadacha_10
{
    public static boolean what(int a, int b, int c)
    {
        if (a * Math.pow(2,b) % c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(what(6,3,2));
    }
}
