import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        int from = 1;
        int to = 20;
        Scanner scan = new Scanner(System.in);//Предлагает ввести данные
        System.out.printf("Введите имя игрока: ");
        Player player = new Player(scan.nextLine());//Вводим имя игрока
        System.out.printf("Введите имя врага: ");
        Enemy enemy = new Enemy(scan.nextLine());//Вводим имя врага
        int numPlayer = 0, numEnemy = 0;
        while (enemy.lives > 0 && player.lives > 0)
        {
            enemy.randNum = from + (int) (Math.random() * to);//Загадывается случ. число
            player.randNum = from + (int) (Math.random() * to);
            
            while (numPlayer != enemy.randNum && numEnemy != player.randNum)//Пока кто-то не угадал число
            {
                System.out.printf("Введите число от %d до %d: ", from, to);
                numPlayer = scan.nextInt();
                Enemy.checkRandom(numPlayer, player, enemy);
                numEnemy = from + (int) (Math.random() * to);
                Player.checkRandom(numEnemy, enemy, player);
            }
        }
        scan.close();
        System.out.println("Игра окончена.");
        if (enemy.lives == 0)
            System.out.printf("Игрок %s победил!", player.name);
        else if (player.lives == 0)
            System.out.printf("Игрок %s победил!", enemy.name);
    }
}