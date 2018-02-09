
public class Knight extends Character implements WoodSword
{
	@Override
	public void setClassAtributes()
	{
		this.className = "Knight";
		this.strength = 5;
		this.dexterity = 3;
		this.intelligence = 2;
	}
	
	/*public int getStrength()
	{
		return this.strength;
	}

	public int getDexterity()
	{
		return this.dexterity;
	}

	public int getIntelligence()
	{
		return this.intelligence;
	}*/

	@Override
	public void printStats()
	{
		if( strength == 5 && dexterity == 3 && intelligence == 2 )
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
	public void setWoodSword()
	{
		int STR = 3;
		this.strength += STR;
	}
}
