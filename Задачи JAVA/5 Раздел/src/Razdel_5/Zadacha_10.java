package Razdel_5;
import java.util.Scanner;
public class Zadacha_10
{
    public static void krugi(String[] arr)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scanner.nextInt();

        System.out.println(hexLattice(a));
    }

    public static String hexLattice(int a) //смотрим на первый символ
    {
        if (a == 1)
        {
            return " * ";
        } else if (a < 0)
        {
            return "Invalid";
        }

        double y = (3 + Math.sqrt(12 * a - 3)) / 6; //сопостовляем его с форумулой

        if (y - (int)y != 0) //делаем проверку
        {
            return "Invalid";
        }

        int q = (int)y;
        StringBuilder upperPart = new StringBuilder();

        for(int h = 0; h < (int)y; h++)//расставляем звездочки, пробелы и строки
        {
            upperPart.append(" ".repeat((int)y - h));
            upperPart.append("* ".repeat(q));
            upperPart.append(" ".repeat((int)y - h - 1));
            q++;
            upperPart.append("/y");
        }

        StringBuilder strBuffer = new StringBuilder(upperPart.toString());//Продолжаем процедуру
        String bottomPart = strBuffer.reverse().toString();//Переворачиваем
        bottomPart = bottomPart.substring(bottomPart.indexOf(("y/"), 2) + 2);//Состыковываем все ряды
        bottomPart = bottomPart.replaceAll("n/", "\n");

        return upperPart.toString().replaceAll("/n", "\n") + bottomPart;
    }
}
