
public class Ninja extends Human {
	
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	
	public void steal(Human target) {
		target.health = target.health - this.stealth;
		this.health = this.health + this.stealth;
		System.out.println(this.name + " stole " + this.stealth + " health from " + target.name + ".");
		System.out.println(target.name + "'s health is now: " + target.health);
		System.out.println(this.name + "'s health is now: " + this.health);
	}
	
	public void runAway() {
		this.health = this.health - 10;
		System.out.println(this.name + " ran away, decreasing their health by 10.");
	}
}
