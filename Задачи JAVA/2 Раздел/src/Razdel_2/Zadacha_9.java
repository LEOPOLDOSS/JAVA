package Razdel_2;

public class Zadacha_9
{
    public static boolean isPrefix(String word, String prefix)
    {
        return word.startsWith(prefix.substring(0, prefix.length() - 1));
    }
    public static boolean isSuffix(String word, String suffix)
    {
        return word.endsWith(suffix.substring(1, suffix.length()));
    }
    public static void main(String[] args)
    {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("vocation", "-logy"));
    }
}
