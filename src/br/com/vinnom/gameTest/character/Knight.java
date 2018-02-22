package br.com.vinnom.gameTest.character;

import br.com.vinnom.gameTest.weapons.Sword;

public class Knight extends Character
{
	Sword sword = new Sword();

	@Override
	public void setClassAtributes()
	{
		this.className = "Knight";
		this.strength = 5;
		this.resistance = 4;
		this.dexterity = 3;
		this.intelligence = 2;
	}

	@Override
	public void printBasicStats()
	{
		System.out.printf( "==========%s basic stats:\n", this.className );
		System.out.println( "Strenght:     5" );
		System.out.println( "Resistance:   4" );
		System.out.println( "Dexterity:    3" );
		System.out.println( "Inteligence:  2" );
	}

	public void setWoodSword()
	{
		this.strength += sword.woodSword();
	}

	public void setBronzeSword()
	{
		this.strength += sword.bronzeSword();
	}

	public void setIronSword()
	{
		this.strength += sword.ironSword();
	}

	public void setSteelSword()
	{
		this.strength += sword.steelSword();
	}

}
