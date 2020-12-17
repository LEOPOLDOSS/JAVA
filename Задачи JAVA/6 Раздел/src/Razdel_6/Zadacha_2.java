package Razdel_6;

public class Zadacha_2
{
    public static String translateWord(String str)//Работает со словом
    {
        int i = 0;
        if (str.length() > 0)
        {
            if (str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' ||//Если первая буква гласная то добляем yay
                    str.charAt(0) == 'o' || str.charAt(0) == 'u' || str.charAt(0) == 'y' ||
                    str.charAt(0) == 'A' || str.charAt(0) == 'E' || str.charAt(0) == 'I' ||
                    str.charAt(0) == 'O' || str.charAt(0) == 'U' || str.charAt(0) == 'Y')
                str += "yay";
            else
                {
                i = 1;//Ищем первую гласную в слове
                while (i<str.length() && str.charAt(i) != 'a' && str.charAt(i) != 'e' &&
                        str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'y')
                    i++;
                }
            if (i != 0)
            {
                if (str.charAt(0) >= 65 && str.charAt(0) <= 90)//Если первая буква заглавная
                {
                    str = str.toLowerCase();//Понижаем регистр
                    str = str.substring(0, i) + str.substring(i,i+1).toUpperCase() + str.substring(i+1,str.length());//Повышаем регитср гласной
                }
                str = str.substring(i, str.length()) + str.substring(0, i) + "ay";//Расставляем в нужном порядке
            }
        }
        return str;
    }
    public static String translateSentence(String str)
    {
        int i = 0;
        String buf = "", str2 = "";
        while (i < str.length())//translateWoПроходим все предложение
        {
            while (str.charAt(i) >= 65 && str.charAt(i) <= 90 ||
                    str.charAt(i) >= 97 && str.charAt(i) <= 122)//Если нам попадаются буквы
            {
                buf += str.charAt(i);//Записываем их в буффер
                i++;
            }
            str2 += rd(buf) + str.charAt(i);//Вызываем функцию для слова
            buf = "";//Очищаем буффер
            i++;
        }
        return str2;
    }
    public static void main(String[] args)
    {
        System.out.println(translateWord("flag"));
        System.out.println(translateSentence("Do you think it is going to rain today?"));
    }
}
