package Razdel_4;

public class Zadacha_6
{
    public static int Chislo(int s)
    {
        int Kolvo = 0, c, a;
        String Sum = Integer.toString(s);
        while (Sum.length() > 1)//Проверка что длинна более 1 символа
        {
            c = 1;
            for (a=0; a<Sum.length(); a++)//По очереди берём сначало 1 символ, затем последующий и перемножаем
            {
                c *= Integer.parseInt("" + Sum.charAt(a));
            }
            Sum = Integer.toString(c);
            Kolvo++;
        }
        return Kolvo;
    }
    public static void main(String[] args)
    {
        System.out.println(Chislo(39));
    }
}

