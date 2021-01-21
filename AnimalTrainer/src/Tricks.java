
public class Tricks 
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		Cat cat = new Cat();
		Frog frog = new Frog();
		
		final int LENGTH = 3;
		
		Animal[] animals = new Animal [LENGTH];
		animals[0] = dog;
		animals [1] = cat;
		animals[2] = frog;
		//adding these animals to the array is not polymorphism
		
		for (int i= 0; i < animals.length; i++)
		{
			Animal anAnimal = animals[i];
			command(anAnimal);
			// command (animals[i]); //This also works for command (anAnimal);
		}
	}
	
	public static void command(Animal animal)
	{
		animal.speak();
	}
	//This is polymorphism because of dynamic look up 
}
