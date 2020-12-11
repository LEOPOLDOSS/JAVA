package Razdel_5;

public class Zadacha_4
{
    public static int pribav(int ...nums)
    {
        int itog = 0;
        String a;
        for (int q: nums)//Суммируем числа
            itog += q;
        while (Integer.toString(itog).length() != 1)//Проверка количества знаков в числе, пока не станет цифрой
        {
            a = Integer.toString(itog);
            itog = 1;
            for (int i=0; i<a.length(); i++)
                itog *= Integer.parseInt(a.substring(i, i+1));//Вырезаем цифру из числа и умножаем на itog
        }
        return itog;
    }
    public static void main(String[] args)
    {
        System.out.println(pribav(21, 22, 23, 24, 25, 26));
    }
}
