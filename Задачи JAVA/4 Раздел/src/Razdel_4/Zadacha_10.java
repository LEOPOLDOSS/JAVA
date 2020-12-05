package Razdel_4;

public class Zadacha_10
{
    public static int countUniqueBooks(String stroka, char simvol)
    {
        int nach = -1, konez = -1, a, b, chet = 0;
        String temp, test;
        for (a=0; a<stroka.length(); a++)
        {
            if (stroka.charAt(a) == simvol)//Поиск открывающего и закрывающего символа
            {
                if (nach == -1)
                {
                    nach = a;
                }
                else
                    {
                    konez = a;
                    }
            }
            if (nach != -1 && konez != -1)
            {
                test = stroka.substring(nach+1, konez);//Записываем строку между началом и концом
                temp = "";//Обьявляем строку для хранения уникальных символов
                for (b = 0; b < test.length(); b++)
                {
                    if (temp.indexOf(test.charAt(b)) < 0)//Проверка на присутствия символа в temp
                        temp = temp + test.charAt(b);
                }
                chet += temp.length();//Записываем кол-во уникальных символов
                nach = -1;
                konez = -1;
            }
        }
        return chet;
    }
    public static void main(String[] args)
    {
        System.out.println(countUniqueBooks("A$A$BBCATT$C$$B$", '$'));
    }
}
