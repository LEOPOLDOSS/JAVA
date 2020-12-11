package Razdel_5;

import java.security.MessageDigest;

public class Zadacha_8
{
    public static String Cahirovanie(String stroka)
    {
        try//Проверка на исключения
        {
            MessageDigest dig = MessageDigest.getInstance("SHA-256");//Создаем MessageDigest обьект и используем алгоритм SHA-256
            byte[] hash = dig.digest(stroka.getBytes("UTF-8"));//Переводим в биты используя алгоритм UTF-8
            StringBuffer hexStr = new StringBuffer();
            for (int a = 0; a < hash.length; a++)
            {
                String temp = Integer.toHexString(0xff & hash[a]);//Переводим байты в символы
                if(temp.length() == 1)
                    hexStr.append('0');
                hexStr.append(temp);
            }
            return hexStr.toString();
        }
        catch(Exception exc)
        {
            throw new RuntimeException(exc);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(Cahirovanie("Cahirovanie"));
    }
}
