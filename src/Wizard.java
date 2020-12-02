
public class Wizard extends Human {
	
	public Wizard(String name) {
		super(name);
		this.health = 50;
		this.intelligence = 8;
	}
	
	public void heal(Human target) {
		target.health = target.health + this.intelligence;
		System.out.println(this.name + " healed " + target.name + " by " + this.intelligence + ".");
	}
	
	public void fireball(Human target) {
		int damage = this.intelligence * 3;
		target.health = target.health - damage;
		System.out.println(this.name + " attacked " + target.name + " with Fireball, decreasing their health by " + damage + ".");
	}
}
