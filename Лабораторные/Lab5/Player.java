public class Player extends Person //Наш класс
{
	String name;
    public Player(String name)//Даем имя себе
	{
    	super(name);
        this.name = name;
    }

    public static void checkRandom(int num, Enemy enemy, Player player)
	{
    	if (player.randNum == num)//Угадал ли враг
    	{
    		Person.loseLives(player);
    		System.out.printf("Враг попал в вас! У %s осталось %d жизней!\n", player.name, player.lives);
    	}
    	else
    		System.out.println("Враг не угадал число");
    }
}

