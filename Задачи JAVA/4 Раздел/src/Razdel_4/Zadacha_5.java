package Razdel_4;

public class Zadacha_5
{
    public static String BMI(String Str1, String Str2)
    {
        String A1 = "";
        double weight = Double.parseDouble(Str1.substring(0, Str1.indexOf(" ")));//Берем из строки только число от первого символа до пробела
        if (Str1.endsWith("pounds"))//Проверка на слово pounds и перевод в kilos
        {
            weight *= 0.453592;
        }
        double height = Double.parseDouble(Str2.substring(0, Str2.indexOf(" ")));//Берем из строки только число от первого символа до пробела
        if (Str2.endsWith("inches"))//Проверка на слово inches и перевод в meters
        {
            height *= 0.0254;
        }
        double BMI = weight*1.0/Math.pow(height, 2);//Формула расчета BMI
        if (BMI < 18.5)//Определение категории BMI
        {
            A1 += String.format("%.1f", BMI) + " Underweight";
        }
        else if (BMI < 25)//Определение категории BMI
        {
            A1 += String.format("%.1f", BMI) + " Normal weight";
        }
        else//Определение категории BMI
            {
            A1 += String.format("%.1f", BMI) + " Overweight";
            }
        return A1;
    }
    public static void main(String[] args)
    {
        System.out.println(BMI("205 pounds", "73 inches"));//Пуды и дюймы
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));
    }
}
