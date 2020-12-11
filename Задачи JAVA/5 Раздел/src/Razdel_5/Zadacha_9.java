package Razdel_5;

public class Zadacha_9
{
    public static String igraprest(String stroka)
    {
        String buffer = "", itog = "";
        int a = 0;
        while (a<stroka.length())//Идем по каждому символу строки
        {
            while (stroka.charAt(a) >= 65 && stroka.charAt(a) <= 90 || stroka.charAt(a) >= 97 && stroka.charAt(a) <= 122)//Проверяем на строчные и заглавные буквы
            {
                buffer += stroka.charAt(a);
                a++;
            }
            buffer = buffer.toLowerCase();//Все буквы переводим в нижний регистр
            if (!buffer.equals("and") &&
                    !buffer.equals("the") &&
                    !buffer.equals("of") &&
                    !buffer.equals("in") &&
                    buffer.length() >= 1)
                buffer = buffer.substring(0,1).toUpperCase() + buffer.substring(1,buffer.length());//Переводим 1 букву в верхний регистр и добавляем остальные буквы
            itog += buffer + stroka.charAt(a);//Записываем все слова друг зругом
            buffer = "";//Обнуляем буффер
            a++;
        }
        return itog;
    }
    public static void main(String[] args)
    {
        System.out.println(igraprest("sansa stark, lady of winterfell."));
    }
}
