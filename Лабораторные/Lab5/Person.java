public class Person//Общий класс для игроков
{
	public int randNum;//Случ. цифра
    public int lives;//Жизни
    String name; 
    public Person(String name) //Присваивает имя и жизни
    {
        this.name = name;
        this.lives = 100;
    } 
    public static void loseLives(Person player) {
    	player.lives -= 10;
    }//Отнимает 10 жизней
}