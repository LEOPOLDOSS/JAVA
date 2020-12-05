package Razdel_4;

public class Zadacha_2
{
    public static String Skobki(String A)
    {
        String a1 = "[";
        int nach = 0;
        int konez = 0;
        for (int a=0; a<A.length(); a++)
        {
            if (nach == 0)//Ставим открывающую ковычку
            {
                a1 += "\"";
            }
            if (A.charAt(a) == '(')//Считаем открывающие скобки
            {
                nach++;
                a1 += '(';
            }
            else if (A.charAt(a) == ')')//Считаем закрывающие скобки
            {
                konez++;
                a1 += ')';
            }
            if (nach == konez)//При их равенстве ставим закрывающую ковычку
            {
                a1 += "\"";
                if (a+1 != A.length())//Если строка не закончилась ставим запятую
                {
                    a1 += ", ";
                }
                nach = 0;
                konez = 0;
            }
        }
        a1 += "]";
        return a1;
    }
    public static void main(String[] args)
    {
        String str = "((()))(())()()(()())";
        System.out.println(Skobki(str));
    }
}
