package br.com.vinnom.gameTest.character;
import br.com.vinnom.gameTest.weapons.Bow;

public class Archer extends Character
{

	Bow bow = new Bow();

	@Override
	public void setClassAtributes()
	{
		this.className = "Archer";
		this.strength = 3;
		this.dexterity = 5;
		this.intelligence = 2;
	}

	@Override
	public void printBasicStats()
	{
		System.out.printf( "==========%s basic stats:\n", this.className );
		System.out.println( "Strenght:     3" );
		System.out.println( "Dexterity:    5" );
		System.out.println( "Inteligence:  2" );
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
