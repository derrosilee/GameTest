import java.util.Random;

public abstract class Character
{
	protected static final Random randomDice = new Random();

	protected String	characterName;
	protected String	className;
	protected int			strength;
	protected int			dexterity;
	protected int			intelligence;

	public String getCharacterName()
	{
		return characterName;
	}

	public void setCharacterName( String characterName )
	{
		this.characterName = characterName;
	}

	public abstract void printBasicStats();

	public abstract void setClassAtributes();

	public void printStats()
	{
		System.out.printf( "==========%s new stats:\n", this.className );
		System.out.printf( "Strenght: %5d\n", this.strength );
		System.out.printf( "Dexterity: %4d\n", this.dexterity );
		System.out.printf( "Inteligence: %2d\n", this.intelligence );
	}

	public void generateStats()
	{
		int d6;

		System.out.println( "A six faces dice will be used to generate your new stats\n" );
		System.out.println( "==========Generating new stats:" );
		d6 = 1 + randomDice.nextInt( 6 );
		this.strength += d6;
		System.out.printf( "Strenght     +%d\n", d6 );
		d6 = 1 + randomDice.nextInt( 6 );
		this.dexterity += d6;
		System.out.printf( "Dexterity    +%d\n", d6 );
		d6 = 1 + randomDice.nextInt( 6 );
		this.intelligence += d6;
		System.out.printf( "Intelligence +%d\n", d6 );
	}

}
