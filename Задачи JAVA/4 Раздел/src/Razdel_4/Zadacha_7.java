package Razdel_4;

public class Zadacha_7
{
    public static String StrokaZvezd(String stroka)
    {
        String itog = "";
        char prev = (char) 0;
        int kolvo = 0;
        for (int a = 0; a<stroka.length(); a++)//Идем по символам строки
        {
            if (prev != stroka.charAt(a))//Если предыдущий символ не равен нынешнему
            {
                if (kolvo > 1)//И если этот символ был несколько раз до этого заканчиваем подсчет
                {
                    itog += "*" + kolvo;
                }
                prev = stroka.charAt(a);
                itog += prev;
                kolvo = 1;
            }
            else//Если символы одинаковы
                {
                    kolvo++;
                if (a == stroka.length() - 1 && kolvo > 1)//Если символ последний, то заканчиваем расчет
                {
                    itog += "*" + kolvo;
                }
                }
        }
        return itog;
    }
    public static void main(String[] args)
    {
        System.out.println(StrokaZvezd("faaaabbbccddddf"));
    }
}
