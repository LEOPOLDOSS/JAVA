package Razdel_2;

public class Zadacha_3
{
    public static boolean isAvgWhole(int [] arr) {
        int Summ = 0;
        for (int b = 0; b<arr.length; b++) {
            Summ += arr[b];
        }
        if (Summ % arr.length == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args)
    {
        int a[] = {2, 4, 6, 8};
        System.out.println(isAvgWhole(a));
    }
}
