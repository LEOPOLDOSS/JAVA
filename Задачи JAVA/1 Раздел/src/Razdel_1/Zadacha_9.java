package Razdel_1;

public class Zadacha_9
{
    public static int sumOfCubes(int arr[])
    {
        int N = 0;
        for (int a = 0; a<arr.length; a++)
        {
            N += Math.pow(arr[a],3);
        }
        return N;
    }
    public static void main(String[] args)
    {
        int x[] = {4, 5, 6};
        System.out.println(sumOfCubes(x));
    }
}
