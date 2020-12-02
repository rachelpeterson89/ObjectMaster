
public class Human {
	public String name;
	
	public Human(String name) {this.name = name;};
	public int strength = 3;
	public int intelligence = 3;
	public int stealth = 3;
	public int health = 100;
	
	public void attack(Human target) {
		target.health = target.health - this.strength;
		System.out.println(this.name + " did a regular attack.");
		System.out.println(target.name + " lost " + this.strength + " health. " + target.name + "'s health is now: " + target.health + "."); 
	}
}
