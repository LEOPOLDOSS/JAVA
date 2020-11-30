package Razdel_3;

public class Zadacha_4
{
    public static String Stroka(String str)
    {
        if (str.length() < 2)
        {
            return "Несовместимо";
        }
        else if (str.charAt(0) == str.charAt(str.length()-1))
        {
            return "Два это пара";
        }
        else
        {
            return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(Stroka("Volna"));
    }
}
