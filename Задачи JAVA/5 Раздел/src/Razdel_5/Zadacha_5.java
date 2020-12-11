package Razdel_5;

public class Zadacha_5
{
    public static String[] glasnye(String[] arr)
    {
        boolean[] vovels = {false, false, false, false, false, false}; //a,e,i,o,u,y
        String[] itog = new String[arr.length];//Создаём строковый массив, размером с входной массив
        itog[0] = arr[0];
        int shet = 1;
        for (int a=0; a<arr[0].length(); a++)//Определяем какие гласные есть в первом слове
        {
            if (arr[0].charAt(a) == 'a')
                vovels[0] = true;
            else if (arr[0].charAt(a) == 'e')
                vovels[1] = true;
            else if (arr[0].charAt(a) == 'i')
                vovels[2] = true;
            else if (arr[0].charAt(a) == 'o')
                vovels[3] = true;
            else if (arr[0].charAt(a) == 'u')
                vovels[4] = true;
            else if (arr[0].charAt(a) == 'y')
                vovels[5] = true;
        }
        for (int a=1; a<arr.length; a++)//Сравниваем гласные первого слова с остальными
        {
            if ((!(arr[a].indexOf('a') != -1) || vovels[0]) &&
                    (!(arr[a].indexOf('e') != -1) || vovels[1]) &&
                    (!(arr[a].indexOf('i') != -1) || vovels[2]) &&
                    (!(arr[a].indexOf('o') != -1) || vovels[3]) &&
                    (!(arr[a].indexOf('u') != -1) || vovels[4]) &&
                    (!(arr[a].indexOf('y') != -1) || vovels[5]))
            {
                itog[shet] = arr[a];
                shet++;
            }
        }
        return itog;
    }
    public static void main(String[] args)
    {
        String[] arr = {"toe", "ocelot", "maniac", "hoops", "bot"};
        String[] itog = glasnye(arr);
        for (int a=0; a<itog.length && itog[a] != null; a++)//Выводим новый строковый массив
            System.out.println(itog[a]);
    }
}
