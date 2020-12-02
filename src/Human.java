
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
		System.out.println(target.name + " lost " + this.strength + " health. " + target.name + "'s health is now: " + target.health); 
	}
	
	public void printStats() {
		System.out.println(this.name + "'s Stats:");
		System.out.println("Health: " + this.health + " | Strength: " + this.strength + " | Intelligence: " + this.intelligence + " | Stealth: " + this.stealth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	
}
