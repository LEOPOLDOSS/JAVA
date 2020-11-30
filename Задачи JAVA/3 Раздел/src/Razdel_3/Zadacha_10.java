package Razdel_3;

public class Zadacha_10
{
    public static boolean Treug(int x, int y, int z)
    {
        if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2) ||
                Math.pow(x, 2) + Math.pow(z, 2) == Math.pow(y, 2) ||
                Math.pow(y, 2) + Math.pow(z, 2) == Math.pow(x, 2))
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
        System.out.println(Treug(3,4,5));
    }
}
