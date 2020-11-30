package Razdel_3;

public class Zadacha_7
{
    public static boolean ChisKaprekara(int a)
    {
        String stro = Integer.toString((int)Math.pow(a,2));
        String stro1 = stro.substring(0,stro.length()/2);
        String stro2 = stro.substring(stro.length()/2, stro.length());
        int Str1 = Integer.parseInt(stro1);
        int Str2 = Integer.parseInt(stro2);
        if (Str1 + Str2 == a)
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
        System.out.println(ChisKaprekara(45));
    }
}
