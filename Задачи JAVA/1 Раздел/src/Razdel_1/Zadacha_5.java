package Razdel_1;

public class Zadacha_5
{
    public static void main(String[] args)
    {
        System.out.println(operation(3,9,3));
    }
    public static String operation(int N, int a, int b)
    {
        if (a * b == N)
        {
        return ("multiplied");
        }
        else if (a / b  == N)
        {
        return ("divided");
        }
        else if (a + b == N)
        {
            return ("added");
        }
        else if (a - b == N)
        {
            return ("subtracted");
        }
        else return ("none");
    }
}
