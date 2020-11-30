package Razdel_3;

public class Zadacha_1
{
    public static int sol(int x, int y, int z) {
        if (Math.pow(y, 2) - 4 * x * z > 0)
        {
            return 2;
        }
        else if (Math.pow(y, 2) - 4 * x * z < 0)
        {
            return 0;
        }
        else return 1;
    }
    public static void main(String[] args)
    {
        System.out.println(sol(1,0,-1));
    }
}
