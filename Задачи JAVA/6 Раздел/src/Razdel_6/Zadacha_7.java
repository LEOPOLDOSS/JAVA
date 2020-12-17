package Razdel_6;

public class Zadacha_7
{
    public static String longestNonrepeatingSubstring(String str)
    {
        String buf = "", res = "";
        for (int i=0; i<str.length()-1; i++)
        {
            buf += str.charAt(i);//Записываем букву
            if (buf.indexOf(str.charAt(i+1)) != -1)//Если в буфере есть следующая буква
            {
                if (res.length() < buf.length())//Сравниваем длинну буфера и результата
                    res = buf;
                buf = "";
            }
        }
        if (str.length() == 1)//На случай одной буквы
            res = str;
        return res;
    }
    public static void main(String[] args)
    {
        System.out.println(longestNonrepeatingSubstring("abcda"));
    }
}
