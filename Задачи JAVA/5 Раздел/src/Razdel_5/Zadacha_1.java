package Razdel_5;

public class Zadacha_1
{
    public static String decod(int[] arr) //Декодирование
    {
        String q = "";
        for (int a=0; a<arr.length; a++)
        {
            if (a!=0)//Если не первая буква слова
                q += (char)(arr[a]+q.charAt(a-1));
            else
                q += (char)arr[a];
        }
        return q;
    }
    public static int[] kodyr(String str)//Кодирование
    {
        int[] arr = new int[str.length()];
        for (int a=0; a<str.length(); a++)
        {
            if (a!=0)//Если не первая буква слова
                arr[a] = (int) str.charAt(a) - (int) str.charAt(a-1);
            else
                arr[a] = (int) str.charAt(a);
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr = {73, 36, -29, 24, 1, 3, -3, 7, 0};
        System.out.println(decod(arr));
        String str = "ImPhilipp";
        int[] arr2 = kodyr(str);
        for (int i=0; i<arr2.length; i++) //Выводим массив через цикл
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
