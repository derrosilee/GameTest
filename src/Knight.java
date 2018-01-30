
public class Knight extends Character
{
	@Override
	public void setClassAtributes()
	{
		this.strenght = 5;
		this.dexterity = 3;
		this.intelligence = 2;
	}
	
	@Override
	public void printStats()
	{
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

	}

	@Override
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
