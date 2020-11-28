package Razdel_2;

public class Zadacha_4
{
    public static void cumulativeSum(int [] arr)
    {
        for (int b=1; b<arr.length; b++)
        {
            arr[b] += arr[b-1];
        }
    }
    public static void main(String[] args)
    {
        int A[] = {4, 5, 6, 7};
        cumulativeSum(A);
        for (int b=0; b<A.length; b++)
        {
            System.out.println(A[b]);
        }
    }
}
