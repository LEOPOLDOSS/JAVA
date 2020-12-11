package Razdel_5;

public class Zadacha_2
{
    public static boolean shahmaty(String figura, String otkuda, String kuda)
    {
        figura = figura.toLowerCase();//Понижение регистра
        otkuda = otkuda.toUpperCase();//Повышаем регистр
        kuda = kuda.toUpperCase();//Повышаем регистр
        if (otkuda.length() == 2 && kuda.length() == 2 && otkuda.charAt(0) >= 65 && otkuda.charAt(0) <= 90 &&
                kuda.charAt(0) >= 65 && kuda.charAt(0) <= 90 && otkuda.charAt(1) >= 49 && otkuda.charAt(1) <= 56 &&
                kuda.charAt(1) >= 49 && kuda.charAt(1) <= 56 && otkuda != kuda)//Проверка формата букв и цифр
            if (figura.equals("rook"))//Ладья
                if (otkuda.charAt(0) == kuda.charAt(0) || otkuda.charAt(1) == kuda.charAt(1))
                    return true;
                else
                    return false;
            else if (figura.equals("bishop"))//Слов
                if (Math.abs((int)otkuda.charAt(0) - (int)kuda.charAt(0)) == Math.abs(otkuda.charAt(1) - kuda.charAt(1)))
                    return true;
                else
                    return false;
            else if (figura.equals("queen"))//Королева
                if (otkuda.charAt(0) == kuda.charAt(0) || otkuda.charAt(1) == kuda.charAt(1) ||
                        Math.abs((int)otkuda.charAt(0) - (int)kuda.charAt(0)) == Math.abs(otkuda.charAt(1) - kuda.charAt(1)))
                    return true;
                else
                    return false;
            else if (figura.equals("king"))//Король
                if (Math.abs((int)otkuda.charAt(0) - (int)kuda.charAt(0)) <= 1 && Math.abs(otkuda.charAt(1) - kuda.charAt(1)) <= 1)
                    return true;
                else
                    return false;
            else if (figura.equals("pawn"))//Пешка
                if (otkuda.charAt(1) >= 50 && otkuda.charAt(1) <= 55 &&
                        Math.abs(otkuda.charAt(0) - kuda.charAt(0)) <= 1 && Math.abs(otkuda.charAt(1) - kuda.charAt(1)) == 1 ||
                        Math.abs(otkuda.charAt(1) - kuda.charAt(1)) == 2 && otkuda.charAt(0) - kuda.charAt(0) == 0 &&
                                (otkuda.charAt(1) == 50 || otkuda.charAt(1) == 55))
                    return true;
                else
                    return false;
            else if (figura.equals("horse"))//Конь
                if (Math.abs((int)otkuda.charAt(0)-(int)kuda.charAt(0)) == 1 && Math.abs(otkuda.charAt(1) - kuda.charAt(1)) == 2 ||
                        Math.abs((int)otkuda.charAt(0)-(int)kuda.charAt(0)) == 2 && Math.abs(otkuda.charAt(1) - kuda.charAt(1)) == 1)
                    return true;
                else
                    return false;
            else
                return false;
        else
            return false;
    }
    public static void main(String[] args)
    {
        System.out.println(shahmaty("pawn", "a3", "b2"));
    }
}
