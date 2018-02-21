
public class Mage extends Character
{

	Staff staff = new Staff();
	
	@Override
	public void printStats()
	{
		if( strength == 2 && dexterity == 3 && intelligence == 5 )
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
		this.className = "Mage";
		this.strength = 2;
		this.dexterity = 3;
		this.intelligence = 5;
	}

	public void setWoodStaff()
	{
		this.strength += staff.woodStaff();
	}

	public void setBronzeStaff()
	{
		this.strength += staff.bronzeStaff();
	}
	
	public void setIronStaff()
	{
		this.strength += staff.ironStaff();
	}
	
	public void setSteelStaff()
	{
		this.strength += staff.steelStaff();
	}
}
