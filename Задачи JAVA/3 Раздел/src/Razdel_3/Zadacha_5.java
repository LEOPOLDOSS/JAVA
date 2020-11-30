package Razdel_3;

public class Zadacha_5
{
    public static boolean Proverka16(String str)
    {
        if (str.length() != 7 || (int)str.charAt(0) != 35)
        {
            return false;
        }
        for (int a = 1; a<str.length(); a++)
        {
            if ((int)str.charAt(a) < 48 || (int)str.charAt(a) > 57 && (int)str.charAt(a) < 65 ||
                    (int)str.charAt(a) > 90 && (int)str.charAt(a) < 97 || (int)str.charAt(a) > 122)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(Proverka16("#AbC12F"));
    }
}
