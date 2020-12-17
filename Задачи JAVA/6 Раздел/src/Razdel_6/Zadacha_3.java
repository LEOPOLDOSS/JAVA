package Razdel_6;

public class Zadacha_3
{
    public static Boolean validColor(String str)
    {
        if ((str.substring(0, 4).equals("rgb(") || str.substring(0, 5).equals("rgba(")) &&
                str.charAt(str.length()-1) == ')' )//Проверка на правильный формат ввода данных
        {
            int i = str.indexOf("(") + 1;
            String buf = "";
            int commas = 0;//Заптяые
            while (str.charAt(i) != ')' && commas < 4)//Пока не дошли до конца, либо запятых больше чем 3
            {
                if (str.charAt(i) >= 48 && str.charAt(i) <= 57 || commas == 3 && str.charAt(i) == '.')//Если это цифры, либо точка в rgba
                    buf += str.charAt(i);
                else
                    if (str.charAt(i) == ',') //Если встретили запятую
                    {
                        if (buf == "" || Integer.parseInt(buf) > 255) //Если нет числа или оно больше 255
                            return false;
                        buf = "";
                        commas++;
                    }
                    else
                        return false;
                i++;
            }
            if (buf == "" || commas == 3 && Double.parseDouble(buf) > 1)//Если 4 значение больше 1
                return false;
            if (str.substring(0, 4).equals("rgb(") && commas == 2 || str.substring(0, 5).equals("rgba(") && commas == 3)//Проверка на соответствие
                return true;
            else
                return false;
        }
        else
            return false;


    }
    public static void main(String[] args)
    {
        System.out.println(validColor("rgb(7,54,8)"));
    }
}
