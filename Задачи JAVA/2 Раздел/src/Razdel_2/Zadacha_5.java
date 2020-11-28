package Razdel_2;

public class Zadacha_5
{
    public static int getDecimalPlaces(String a)
    {
        return a.split("\\.")[1].length();
    }
    public static void main(String[] args)
    {
        System.out.println(getDecimalPlaces("721.863"));
    }
}
