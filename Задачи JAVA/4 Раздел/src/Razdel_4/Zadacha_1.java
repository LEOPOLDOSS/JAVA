package Razdel_4;

public class Zadacha_1
{
    public static String Bessie(int N, int K, String A)
    {
        int Kolvo = 0;
        int LastSpace = 0;
        for (int a=0; a<A.length(); a++)//Просматриваются все символы строки
        {
            if (A.charAt(a) != ' ')//Проверка на пробел
            {
                Kolvo++;
            }
            else
            {
                LastSpace = a;
            }
            if (Kolvo > K && LastSpace != 0)//Перенос на след. строку
            {
                Kolvo = a - LastSpace;
                A = A.substring(0,LastSpace) + "\n" + A.substring(LastSpace+1,A.length());
            }
        }
        return A;
    }
    public static void main(String[] args)
    {
        int N = 10;
        int K = 9;
        String str = "Hello my name is Bessie and this is my essay";
        System.out.println(Bessie(N,K,str));
    }
}
