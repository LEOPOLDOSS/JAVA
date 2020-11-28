package Razdel_2;

public class Zadacha_8
{
    public static boolean ParaStrok(String stroka1, String stroka2)
    {
        if (stroka1.charAt(0) == stroka2.charAt(stroka2.length()-1) && stroka2.charAt(0) == stroka1.charAt(stroka1.length()-1))
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
        System.out.println(ParaStrok("abcdef", "fbcdea"));
    }
}
