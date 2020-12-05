package Razdel_4;

public class Zadacha_8
{
    public static boolean doesRhyme(String stroka1, String stroka2)
    {
        int count1 = stroka1.length() - 1;
        int count2 = stroka2.length() - 1;
        String s1 = "", s2 = "";
        while (stroka1.charAt(count1) != ' ')//Ищем последний пробел
        {
            count1--;
        }
        while (stroka2.charAt(count2) != ' ')//Ищем последний пробел
        {
            count2--;
        }
        stroka1 = stroka1.toLowerCase().substring(count1 + 1, stroka1.length());//Вырезаем последние слово из строки и понижаем регистр
        for (int a = 0; a<stroka1.length(); a++)
        {
            if (stroka1.charAt(a) == 'a' || stroka1.charAt(a) == 'e' || stroka1.charAt(a) == 'i' || stroka1.charAt(a) == 'o' || stroka1.charAt(a) == 'u' || stroka1.charAt(a) == 'y')
            {
                s1 += stroka1.charAt(a);
            }
        }
        stroka2 = stroka2.toLowerCase().substring(count2 + 1, stroka2.length());//Вырезаем последние слово из строки и понижаем регистр
        for (int a = 0; a<stroka2.length(); a++)
        {
            if (stroka2.charAt(a) == 'a' || stroka2.charAt(a) == 'e' || stroka2.charAt(a) == 'i' || stroka2.charAt(a) == 'o' || stroka2.charAt(a) == 'u' || stroka1.charAt(a) == 'y')
            {
                s2 += stroka2.charAt(a);
            }
        }
        return s1==s2;//Проверка равенства строк
    }
    public static void main(String[] args)
    {
        System.out.println(doesRhyme("You are off to the races", "a splendid day."));
    }
}
