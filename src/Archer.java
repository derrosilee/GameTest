
public class Archer extends Character
{

	Bow bow = new Bow();
	
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

	public void setShortWoodBow()
	{
		this.strength += bow.shortWoodBow();
	}
	
	public void setShortBronzeBow()
	{
		this.strength += bow.shortBronzeBow();
	}
	
	public void setShortIronBow()
	{
		this.strength += bow.shortIronBow();
	}
	
	public void setShortSteelBow()
	{
		this.strength += bow.shortSteelBow();
	}
	

}
