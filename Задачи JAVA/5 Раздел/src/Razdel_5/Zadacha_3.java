package Razdel_5;

public class Zadacha_3
{
    public static boolean slovovslove(String mask, String word)
    {
        int chet = 0;
        for (int a=0; a<mask.length(); a++)//Идем по первому слову
        {
            while (chet < word.length() && word.charAt(chet) != mask.charAt(a))//Если буквы нет в первом слове, но есть во втором слове, то увеличиваем счетчик
                chet++;
            chet++;
            if (chet > word.length())
                return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(slovovslove("Fill", "Fillname"));
    }
}
