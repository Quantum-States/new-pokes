
public class BulbasaurPokemon extends PokemonObject
{
    	int newSpeed;
	    int newAttack;
	    int newDefense;
	    int newSpecialAttack;
	    int newSpecialDefense;
	    int newHealth;
	    int newDex;
	    String newType1;
	    String newType2;
	    double newHeight;
	    double newWeight;
	    String newName;
	    String newSpecies;
	    
	public BulbasaurPokemon()
	{
		setSpeed(45);
	    setAttack(49);
	    setDefense(49);
	    setSpecialAttack(65);
	    setSpecialDefense(65);
	    setHealth(45);
	    setDex(001);
	    setType1("Grass");
	    setType2(null);
	    setHeight(0.7);
	    setHeight(0.5);
	    setName("Bulbasaur");
	    setSpecies("Seed Pokemon");
	 }
	public BulbasaurPokemon(int newSpeed, int newAttack, int newDefense, int newSpecialAttack, int newSpecialDefesnse, int newHealth, int newDex, String newType1, String newType2, double newHeight, double newWeight, String newName, String newSpecies)
	 {
		setSpeed(newSpeed);
	    setAttack(newAttack);
	    setDefense(newDefense);
	    setSpecialAttack(newSpecialAttack);
	    setSpecialDefense(newSpecialDefense);
	    setHealth(newHealth);
	    setDefense(newDex);
	    setType1(newType1);
	    setType2(newType2);
	    setHeight(newHeight);
	    setHeight(newWeight);
	    setName(newName);
	    setSpecies(newSpecies);
	 }
	
}
