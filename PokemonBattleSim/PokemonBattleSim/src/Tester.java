
public class Tester {

	public static void main(String[] args) 
	{
		Map map = new Map();
		map.DrawMap();

		/*BulbasaurPokemon poke1 = new BulbasaurPokemon();
		
		System.out.println("Attack: "+ poke1.getAttack());
		System.out.println("Defense: "+ poke1.getDefense());
		System.out.println("Speed: " + poke1.getSpeed());
		System.out.println("Special Attack: " + poke1.getSpecialAttack());
		System.out.println("Special Defense: " + poke1.getSpecialDefense());
		System.out.println("Health: " + poke1.getHealth());
		System.out.println("Dex: " + poke1.getDex());
		System.out.println("Type: " + poke1.getType1());
		*/
		PokemonObject poke2 = new PokemonObject();
		
		System.out.print(poke2.toString());
		
		poke2.generateIV();
		
		poke2.generateUniqueStats();
	}

}
