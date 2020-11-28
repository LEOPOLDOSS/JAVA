package Razdel_1;

public class Zadacha_7
{
    public static int addUpTo(int S)
    {
        int sum = 0;
        for (int i=1; i<S+1; i++)
        {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(addUpTo(15));
    }
}
