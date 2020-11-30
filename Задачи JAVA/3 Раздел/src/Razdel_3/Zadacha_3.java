package Razdel_3;

public class Zadacha_3
{
    public static boolean ProverkaIdeal(int s)
    {
        int Sum = 0;
        int f = 1;
        while (f <= s / 2)
        {
            if (s % f == 0)
            {
                Sum += f;
            }
            f += 1;
        }
        if (Sum == s)
        {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(ProverkaIdeal(7));
    }
}
