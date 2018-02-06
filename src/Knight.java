
public class Knight extends Character
{
	@Override
	public void setClassAtributes()
	{
		this.className = "Knight";
		this.strenght = 5;
		this.dexterity = 3;
		this.intelligence = 2;
	}

	@Override
	public void printStats()
	{
		if( strenght == 5 && dexterity == 3 && intelligence == 2 )
		{
			System.out.printf( "==========%s basic stats:\n", this.className );
			System.out.printf( "Strenght: %5d\n", this.strenght );
			System.out.printf( "Dexterity: %4d\n", this.dexterity );
			System.out.printf( "Inteligence: %2d\n", this.intelligence );
		}
		else
		{
			System.out.printf( "==========%s new stats:\n", this.className );
			System.out.printf( "Strenght: %5d\n", this.strenght );
			System.out.printf( "Dexterity: %4d\n", this.dexterity );
			System.out.printf( "Inteligence: %2d\n", this.intelligence );
		}
	}
}
