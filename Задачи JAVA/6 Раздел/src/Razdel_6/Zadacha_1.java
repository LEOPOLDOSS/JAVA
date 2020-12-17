package Razdel_6;

public class Zadacha_1
{
    public static int bell(int n)
    {
        int[][] bel = new int[n+1][n+1];
        bel[0][0] = 1;
        for (int i=1; i<=n; i++)
        {
            bel[i][0] = bel[i-1][i-1];
            for (int j=1; j<=i; j++)
                bel[i][j] = bel[i-1][j-1] + bel[i][j-1];
        }
        return bel[n][0];
    }
    public static void main(String[] args)
    {
        System.out.println(bell(3));
    }
}
