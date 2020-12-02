
public class Samurai extends Human {
	
	static int numObjects = 0;
	
	{
		numObjects += 1;
	}
	
	public Samurai(String name) {
		super(name);
		this.health = 200;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = this.health / 2;
		System.out.println(this.name + " used Deathblow, killing " + target.name + ", but his health was reduced by half!");
	}
	
	public void meditate() {
		this.health  = this.health + this.health / 2;
		System.out.println(this.name + " meditated, increasing their health by 50%.");
	}
	
	public void howMany() {
		if (numObjects == 1) {
			System.out.println("There is " + numObjects + " instance of the Samurai class.");
		} else {
			System.out.println("There are " + numObjects + " instances of the Samurai class.");
		}
	}
}
