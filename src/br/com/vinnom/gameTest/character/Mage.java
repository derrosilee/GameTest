package br.com.vinnom.gameTest.character;

import br.com.vinnom.gameTest.armor.Chest;
import br.com.vinnom.gameTest.weapons.Staff;

public class Mage extends Character
{

	Staff staff = new Staff();

	Chest chest = new Chest();

	@Override
	public void setClassAtributes()
	{
		super.setClassName( "Mage" );
		super.setStrength( 2 );
		super.setResistance( 2 );
		super.setDexterity( 3 );
		super.setIntelligence( 5 );
	}

	@Override
	public void printBasicStats()
	{
		System.out.printf( "==========%s basic stats:\n", super.getClassName() );
		System.out.println( "Strenght:     2" );
		System.out.println( "Dexterity:    3" );
		System.out.println( "Inteligence:  5" );
	}

	public void setWoodStaff()
	{
		super.setStrength( super.getStrength() + staff.woodStaff() );
	}

	public void setBronzeStaff()
	{
	  super.setStrength( super.getStrength() + staff.bronzeStaff() );
	}

	public void setIronStaff()
	{
	  super.setStrength( super.getStrength() + staff.ironStaff() );
	}

	public void setSteelStaff()
	{
	  super.setStrength( super.getStrength() + staff.steelStaff() );
	}

	public void setLeatherClothes()
	{
    super.setResistance( super.getResistance() + chest.leatherClothes() );
	}
}
