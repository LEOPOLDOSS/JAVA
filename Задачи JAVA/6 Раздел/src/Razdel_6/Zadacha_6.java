package Razdel_6;

import java.util.Vector;

public class Zadacha_6
{
    static Vector<Integer> vect = new Vector<Integer>();
    public static int ulam(int n)
    {
        vect.add(1);
        vect.add(2);
        for (int i=3; vect.size()<n; i++)
        {
            int count = 0;
            for (int j=0; j<vect.size()-1; j++)
            {
                for (int k=j+1; k<vect.size(); k++)
                {
                    if (vect.get(j) + vect.get(k) == i)
                        count++;
                    if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }
            if (count == 1)
            {
                vect.add(i);
            }
        }
        return vect.get(n-1);
    }
    public static void main(String[] args)
    {
        System.out.println(ulam(206));
    }
}
