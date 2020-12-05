package Razdel_4;

public class Zadacha_4
{
    public static String overTime(double nach, double konec, double stavka, double mnoch)
    {
        if(konec <= 24)//Проверка конца рабочего дня
        {
            String ZP = "$";
            double Sverch;
            if (konec > 17)//Проверка на сверхурочную работу
            {
                Sverch = (17 - nach) * stavka + (konec - 17) * stavka * mnoch;
            } else//Если работа не сверхурочна
                {
                    Sverch = (konec - nach) * stavka;
                }
            ZP += Double.toString(Sverch);
            return ZP;
        }
        else
            {
                return ("Неверное значение окончания рабочего дня");
            }
    }
    public static void main(String[] args)
    {
        System.out.println(overTime(9, 24, 40, 1.8));
    }
}
