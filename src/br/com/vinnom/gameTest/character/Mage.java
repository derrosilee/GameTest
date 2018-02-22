package br.com.vinnom.gameTest.character;
import br.com.vinnom.gameTest.weapons.Staff;

public class Mage extends Character
{

	Staff staff = new Staff();

	@Override
	public void setClassAtributes()
	{
		this.className = "Mage";
		this.strength = 2;
		this.dexterity = 3;
		this.intelligence = 5;
	}

	@Override
	public void printBasicStats()
	{
		System.out.printf( "==========%s basic stats:\n", this.className );
		System.out.println( "Strenght:     2" );
		System.out.println( "Dexterity:    3" );
		System.out.println( "Inteligence:  5" );
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
