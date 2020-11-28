package Razdel_2;

public class Zadacha_1
{
    public static String repeat(String A, int M) {
        String sRes = "";
        char arr[] = A.toCharArray();
        for (int b = 0; b<arr.length; b++) {
            for (int j = 0; j<M; j++) {
                sRes += arr[b];
            }
        }
        return sRes;
    }
    public static void main(String[] args)
    {
        System.out.println(repeat("Filipp", 2));
    }
}
