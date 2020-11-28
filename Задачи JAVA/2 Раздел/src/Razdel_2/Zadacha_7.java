package Razdel_2;

public class Zadacha_7
{
    public static boolean index(String stroch)
    {
        char[] arr = stroch.toCharArray();
        if (arr.length > 5 || arr.length == 0)
        {
            return false;
        }
        for (int a=0; a<arr.length; a++)
        {
            if ((int)arr[a] < 48 || (int)arr[a]>57)
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(index("39876"));
    }
}
