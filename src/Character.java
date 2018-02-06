import java.util.Random;

public abstract class Character
{
	protected static final Random randomDice = new Random();

	protected String	characterName;
	protected String	className;
	protected int			strenght;
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

	public abstract void printStats();

	public void generateStats()
	{
		int d6;

		System.out.println( "A six faces dice will be used to generate your new stats\n" );
		System.out.println( "==========Generating new stats:" );
		d6 = 1 + randomDice.nextInt( 6 );
		this.strenght += d6;
		System.out.printf( "Strenght     +%d\n", d6 );
		d6 = 1 + randomDice.nextInt( 6 );
		this.dexterity += d6;
		System.out.printf( "Dexterity    +%d\n", d6 );
		d6 = 1 + randomDice.nextInt( 6 );
		this.intelligence += d6;
		System.out.printf( "Intelligence +%d\n", d6 );
	}

	public abstract void setClassAtributes();
}
