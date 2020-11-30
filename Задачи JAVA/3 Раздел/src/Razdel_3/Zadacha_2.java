package Razdel_3;

public class Zadacha_2
{
    public static int VozvratZip(String str)
    {
        return str.indexOf("zip", str.indexOf("zip") + 1);
    }
    public static void main(String[] args)
    {
        System.out.println(VozvratZip("all zip files are compressed"));
    }
}
