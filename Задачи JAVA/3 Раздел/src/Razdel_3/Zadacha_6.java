package Razdel_3;

public class Zadacha_6
{
    public static boolean Stroka(int Prim1 [], int Prim2 [])
    {
        int count1 = 0;
        int count2 = 0;
        for (int a = 0; a<Prim1.length; a++)
        {
            int b;
            for (b = 0; b<a; b++)
            {
                if (Prim1[a] == Prim1[b])
                {
                    break;
                }
            }
            if (a == b)
            {
                count1++;
            }
        }
        for (int a = 0; a<Prim2.length; a++)
        {
            int j;
            for (j = 0; j<a; j++)
            {
                if (Prim2[a] == Prim2[j])
                {
                    break;
                }
            }
            if (a == j)
            {
                count2++;
            }
        }
        if (count1 == count2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        int[] Prim1 = {3,6,10,135};
        int[] Prim2 = {1,1,3,1,5,180,3};
        System.out.println(Stroka(Prim1,Prim2));
    }
}
