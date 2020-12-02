
public class HumanTest {
	public static void main(String[] args) {
		Human BillyBob = new Human("BillyBob");
		Human Jolene = new Human("Jolene");
		BillyBob.attack(Jolene);
		Ninja NinjaBob = new Ninja("NinjaBob");
		NinjaBob.steal(BillyBob);
		NinjaBob.runAway();
		Wizard Gandolf = new Wizard("Gandolf");
		Gandolf.heal(Jolene);
		Gandolf.printStats();
		Gandolf.fireball(BillyBob);
		Samurai Kilo = new Samurai("Kilo");
		Samurai Kenobi = new Samurai("Kenobi");
		Kenobi.printStats();
		Kilo.printStats();
		Kilo.deathBlow(Gandolf);
		Kilo.meditate();
		Kilo.printStats();
		Kilo.howMany();
	}
}
