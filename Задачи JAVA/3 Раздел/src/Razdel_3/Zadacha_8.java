package Razdel_3;

public class Zadacha_8
{
    public static String StrokaZero(String str)
    {
        int Max = 0;
        int Zero = 0;
        for (int a=0; a<str.length(); a++)
        {
            if (str.charAt(a) == '0')
            {
                Zero++;
            }
            else
            {
                if (Zero>Max)
                {
                    Max = Zero;
                    Zero = 0;
                }
            }
            if (Zero>Max && a == str.length()-1)
            {
                Max = Zero;
                Zero = 0;
            }
        }
        String Sum = "";
        for (int i = 0; i<Max; i++)
        {
            Sum += "0";
        }
        return Sum;
    }
    public static void main(String[] args)
    {
        System.out.println(StrokaZero("01100110111"));
    }
}
