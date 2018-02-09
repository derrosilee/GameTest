
public class Archer extends Character implements WoodBow
{

	@Override
	public void printStats()
	{
		if( strength == 3 && dexterity == 5 && intelligence == 2 )
		{
			System.out.printf( "==========%s basic stats:\n", this.className );
			System.out.printf( "Strenght: %5d\n", this.strength );
			System.out.printf( "Dexterity: %4d\n", this.dexterity );
			System.out.printf( "Inteligence: %2d\n", this.intelligence );
		}
		else
		{
			System.out.printf( "==========%s new stats:\n", this.className );
			System.out.printf( "Strenght: %5d\n", this.strength );
			System.out.printf( "Dexterity: %4d\n", this.dexterity );
			System.out.printf( "Inteligence: %2d\n", this.intelligence );
		}
	}

	@Override
	public void setClassAtributes()
	{
		this.className = "Archer";
		this.strength = 3;
		this.dexterity = 5;
		this.intelligence = 2;
	}

	@Override
	public void setWoodBow()
	{
		int STR = 2;
		this.strength += STR;
	}
	

}
