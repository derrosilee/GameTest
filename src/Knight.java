import java.util.Random;

public class Knight
{
	private static final Random randomDice = new Random();

	private String	characterName;
	private int			strenght			= 5;
	private int			dexterity			= 3;
	private int			intelligence	= 2;

	public String getCharacterName()
	{
		return characterName;
	}

	public void setCharacterName( String characterName )
	{
		this.characterName = characterName;
	}

	public void printStats()
	{
		if( strenght == 5 && dexterity == 3 && intelligence == 2 )
		{
			System.out.println( "==========Knight basic stats:" );
			System.out.printf( "Strenght: %5d\n", this.strenght );
			System.out.printf( "Dexterity: %4d\n", this.dexterity );
			System.out.printf( "Inteligence: %2d\n", this.intelligence );
		}
		else
		{
			System.out.println( "==========Knight new stats:" );
			System.out.printf( "Strenght: %5d\n", this.strenght );
			System.out.printf( "Dexterity: %4d\n", this.dexterity );
			System.out.printf( "Inteligence: %2d\n", this.intelligence );
		}
	}

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
}
