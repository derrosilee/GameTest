package br.com.vinnom.gameTest.character;

import java.util.Random;

public abstract class Character
{
	protected static final Random randomDice = new Random();

	public String	characterName;
	public String	className;
	public int		strength;
	public int		resistance;
	public int		dexterity;
	public int		intelligence;

	public String getCharacterName()
	{
		return characterName;
	}

	public void setCharacterName( String characterName )
	{
		this.characterName = characterName;
	}

	public abstract void printBasicStats();

	public abstract void setClassAtributes();

	public void printStats()
	{
		System.out.printf( "==========%s new stats:\n", this.className );
		System.out.printf( "Strenght: %5d\n", this.strength );
		System.out.printf( "Resistance: %3d\n", this.resistance );
		System.out.printf( "Dexterity: %4d\n", this.dexterity );
		System.out.printf( "Inteligence: %2d\n", this.intelligence );
	}

	public void generateStats()
	{
		int d6;

		System.out.println( "A six faces dice will be used to generate your new stats\n" );
		System.out.println( "==========Generating new stats:" );
		d6 = 1 + randomDice.nextInt( 6 );
		this.strength += d6;
		System.out.printf( "Strenght     +%d\n", d6 );
		d6 = 1 + randomDice.nextInt( 6 );
		this.resistance += d6;
		System.out.printf( "Resistance   +%d\n", d6 );
		d6 = 1 + randomDice.nextInt( 6 );
		this.dexterity += d6;
		System.out.printf( "Dexterity    +%d\n", d6 );
		d6 = 1 + randomDice.nextInt( 6 );
		this.intelligence += d6;
		System.out.printf( "Intelligence +%d\n", d6 );
	}

}
