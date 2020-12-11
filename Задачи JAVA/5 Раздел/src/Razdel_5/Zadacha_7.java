package Razdel_5;

public class Zadacha_7
{
    public static String chisla(int a)
    {
        String itog = "";
        String[] mal = new String[]{ "", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] decyti = new String[]
                {"", "", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        String sto = "hundred";
        if (a == 0)
            return "zero";
        if (a >= 100)
        {
            itog += mal[a/100] + " " + sto + " ";
        }
        if (a % 100 < 20 && a % 100 != 0)
            itog += mal[a % 100];
        else
            itog += decyti[a % 100 / 10] +  " " + mal[a % 10];
        return itog;
    }
    public static void main(String[] args)
    {
        System.out.println(chisla(679));
    }
}
