package Razdel_3;

public class Zadacha_9
{
    public static int SledProst(int a)
    {
        int S;
        while(true)
        {
            S = 0;
            for (int i = 2; i<=Math.sqrt(a); i++)
            {
                if (a % i == 0)
                {
                    S++;
                }
            }
            if (S == 0)
            {
                return a;
            }
            else
            {
                a++;
                continue;
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println(SledProst(24));
    }
}
