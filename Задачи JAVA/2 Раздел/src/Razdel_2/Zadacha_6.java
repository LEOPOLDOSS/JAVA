package Razdel_2;

public class Zadacha_6
{
    public static int Fibo(int m)
    {
        int X = 0;
        int Y = 1;
        int next;
        for (int n = 2; n <= m; ++n)
        {
            next = X + Y;
            X = Y;
            Y = next;
        }
        return Y;
    }
    public static void main(String[] args)
    {
        System.out.println(Fibo(10));
    }
}
