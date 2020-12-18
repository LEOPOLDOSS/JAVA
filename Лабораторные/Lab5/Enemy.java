public class Enemy extends Person //Класс врага
{
	String name;
    public Enemy(String name) //Даем имя врагу
	{
        super(name);
        this.name = name;
    }

    public static void checkRandom(int num, Player player, Enemy enemy)
	{
    	if (enemy.randNum == num) //Угадал ли ты
    	{
    		Person.loseLives(enemy);
    		System.out.printf("Вы угадали, теперь у врага с именем %s осталось %d жизней!\n", enemy.name, enemy.lives);
    	}
    	else if (enemy.randNum > num)//Сравнение больше загаданное число или меньше
    		System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, больше");
    	else if (enemy.randNum < num)
    		System.out.println("Вы не угадали! Число, что вы пытаетесь угадать, меньше");
    }
}
