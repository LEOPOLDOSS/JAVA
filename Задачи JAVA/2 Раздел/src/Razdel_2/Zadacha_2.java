package Razdel_2;

public class Zadacha_2
{
    public static int defferenceMaxMin(int [] arr) {
        int Max = arr[0];
        int Min = arr[0];
        for (int a = 1; a<arr.length; a++) {
            if (arr[a]>Max) {
                Max = arr[a];
            }
            else if (arr[a]<Min) {
                Min = arr[a];
            }
        }
        return Max-Min;
    }
    public static void main(String[] args)
    {
        int a[] = {-5, -3, 0, 5, 7, 13, 17, 65};
        System.out.println(defferenceMaxMin(a));
    }
}
