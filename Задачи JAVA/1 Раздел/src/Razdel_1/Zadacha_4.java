package Razdel_1;

public class Zadacha_4
{
    public static void main(String[] args)
    {
        System.out.println(profitableGamble(0.2,50,9));
    }
    public static boolean profitableGamble(double prob, int prize, int pay)
    {
        if (prob * prize > pay)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
