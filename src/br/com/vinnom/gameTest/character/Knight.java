package br.com.vinnom.gameTest.character;

import br.com.vinnom.gameTest.armor.Chest;
import br.com.vinnom.gameTest.weapons.Sword;

public class Knight extends Character
{
	private Sword sword = new Sword();
	
	private Chest chest = new Chest();
	

	@Override
	public void setClassAtributes()
	{
		super.setClassName( "Knight" );
		super.setStrength( 5 );
		super.setResistance( 4 );
		super.setDexterity( 3 );
		super.setIntelligence( 2 );
	}

	@Override
	public void printBasicStats()
	{
		System.out.printf( "==========%s basic stats:\n", super.getClassName() );
		System.out.println( "Strenght:     5" );
		System.out.println( "Resistance:   4" );
		System.out.println( "Dexterity:    3" );
		System.out.println( "Inteligence:  2" );
	}

	public void setWoodSword()
	{
		super.setStrength( super.getStrength() + sword.woodSword() );
	}

	public void setBronzeSword()
	{
		super.setStrength( super.getStrength() + sword.bronzeSword() );
	}

	public void setIronSword()
	{
	  super.setStrength( super.getStrength() + sword.ironSword() );
	}

	public void setSteelSword()
	{
	  super.setStrength( super.getStrength() + sword.steelSword() );
	}

  public void setLeatherClothes()
  {
    super.setResistance( super.getResistance() + chest.leatherClothes() );
  }
}
