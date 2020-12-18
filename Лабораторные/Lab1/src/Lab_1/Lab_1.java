package Lab_1;

import java.util.*;//Библиотека для случайного числа

public class Lab_1 {
    public static void main(String[] args)
    {
        //Обьявляем три потока
        Sluch Slch = new Sluch();
        Kvadrat Kv = new Kvadrat();
        Cub Cb = new Cub();
        //Запуск потоков
        Slch.start();
        Kv.start();
        Cb.start();
        int Chislo;
        while (1>0)
        {
            try
            {
                Chislo = Sluch.randRun();//Получаем число
                Slch.sleep(1000);//Ждём 1 секунду
                if (Chislo % 2 == 0)//Проверка четности числа
                    Kv.kvRun(Chislo);
                else
                    Cb.cbRun(Chislo);
            }
            catch (InterruptedException e)
            {
                System.out.println("Исключение(ошибка)");
            }
        }
    }
}

//объявим внутри нашего класса внутренний класс
class Sluch extends Thread {
    public static int randRun()
    {
        //обьявляем обьект random
        Random rand = new Random();
        //задаем границы чисел
        int VerhGran = 101;
        return rand.nextInt(VerhGran);
    }
}

//объявим внутри нашего класса внутренний класс
class Kvadrat extends Thread {
    public static void kvRun(int x)
    {
        //Возвращает квадрат числа
        System.out.println("Квадрат " + x + ": " + Math.pow(x,2));
    }
}

//объявим внутри нашего класса внутренний класс
class Cub extends Thread {
    public static void cbRun(int x)
    {
        //Возвращает куб числа
        System.out.println("Куб " + x + ": " + Math.pow(x,3));
    }
}