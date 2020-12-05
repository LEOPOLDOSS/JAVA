package Razdel_4;

public class Zadacha_3
{
    public static String CamelCase(String a)
    {
        String a1 = "";
        char ch;
        int s = 0;
        while (s<a.length())
        {
            ch = a.charAt(s);
            if (ch == '_')
            {
                s++;
                ch = Character.toUpperCase(a.charAt(s));//Ставим вместо нижнего подчеркивания следующий  символ как заглавный
            }
            a1 += ch;//Записываем символ в конечную строку
            s++;
        }
        return a1;
    }
    public static String SnakeCase(String a)
    {
        String a1 = "";
        char ch;
        int s = 0;
        while (s<a.length())
        {
            ch = a.charAt(s);
            if ((int)ch >= 65 && (int)ch <= 90)//Проверка на заглавные символы
            {
                a1 += '_';//Ставим нижнее подчеркивание
                ch = Character.toLowerCase(ch);//Делаем букву строчной
            }
            a1 += ch;//Записываем символ в конечную строку
            s++;
        }
        return a1;
    }
    public static void main(String[] args)
    {
        System.out.println(CamelCase("im_fine_and_you"));
        System.out.println(SnakeCase("imFineThanks"));
    }
}
