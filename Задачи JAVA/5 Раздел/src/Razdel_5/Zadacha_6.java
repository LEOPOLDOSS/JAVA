package Razdel_5;

public class Zadacha_6
{
    public static boolean Karta(long num)
    {
        String str = Long.toString(num);
        int prib = 0, umn;
        int chek = Integer.parseInt(str.substring(str.length()-1));//Присваем переменной чек последнюю цифру
        str = str.substring(0, str.length()-1); //Убираем последний знак строки
        str = new StringBuilder(str).reverse().toString(); // Переворачиваем число
        for (int i=0; i<str.length(); i++)
        {
            umn = Integer.parseInt(str.substring(i, i+1));
            if (i%2!=0)//На нечетных позицях умножаем на два
            {
                umn *= 2;
                if (umn>=10)//Если больше одной цифры, то складываем цифры
                    umn = umn/10 + umn%10;
            }
            prib += umn; //Суммируем все цифры
        }
        if (10 - prib % 10 == chek) //Вычтитаем последнюю цифру суммы из 10. Результат должен быть равен контрольной цифре чек
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(Karta(1234567890123452L));
    }
}
