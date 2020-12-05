package Razdel_4;

public class Zadacha_9
{
    public static boolean povtor(long chislo1, long chislo2)
    {
        int a = 0, b = 0;
        String s1 = Long.toString(chislo1);//Из формата лонг в строку
        String s2 = Long.toString(chislo2);//Из формата лонг в строку
        while (a<s1.length()-2)
        {
            if (s1.charAt(a) == s1.charAt(a+1) && s1.charAt(a) == s1.charAt(a+2))//Проверка на три подряд идущие числа
            {
                while (b<s2.length()-1)
                {
                    if (s2.charAt(b) == s2.charAt(b+1) && s2.charAt(b) == s1.charAt(a))//Проверка на два подряд идущие числа
                    {
                        return true;
                    }
                    b++;
                }
            }
            a++;
        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(povtor(111234, 985432111));
    }
}
