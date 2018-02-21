import java.util.Scanner;

public class GameTest
{
	private static Scanner input;

	public static void main( String[] args )
	{
		String readName;
		String readLine;

		Knight knight = new Knight();
		Mage mage = new Mage();
		Archer archer = new Archer();
		
		Sword sword = new Sword();

		input = new Scanner( System.in );

		do
		{
			System.out.println( "Type your knight character name:" );
			readName = input.nextLine();
			knight.setCharacterName( readName );
			System.out.println( "\nAre you sure? (yes or no)" );
			readLine = input.nextLine();
			System.out.println();
		}
		while( readLine.equals( "no" ) );

		System.out.printf( "\n\nNow, lets generate %s character stats.\n", knight.characterName );
		knight.setClassAtributes();
		knight.printBasicStats();
		System.out.println();
		knight.generateStats();
		System.out.println();
		knight.printStats();
		System.out.printf( "\nEquipping your knight with a Wood Sword (Strenght + %d)\n", sword.woodSword() );
		knight.setWoodSword();
		knight.printStats();

		do
		{
			System.out.println( "\nType your mage character name:" );
			readName = input.nextLine();
			mage.setCharacterName( readName );
			System.out.println( "\nAre you sure? (yes or no)" );
			readLine = input.nextLine();
			System.out.println();
		}
		while( readLine.equals( "no" ) );

		System.out.printf( "\n\nNow, lets generate %s character stats.\n", mage.characterName );
		mage.setClassAtributes();
		mage.printBasicStats();
		System.out.println();
		mage.generateStats();
		System.out.println();
		mage.printStats();

		do
		{
			System.out.println( "\nType your archer character name:" );
			readName = input.nextLine();
			archer.setCharacterName( readName );
			System.out.println( "\nAre you sure? (yes or no)" );
			readLine = input.nextLine();
			System.out.println();
		}
		while( readLine.equals( "no" ) );

		System.out.printf( "\n\nNow, lets generate %s character stats.\n", archer.characterName );
		archer.setClassAtributes();
		archer.printBasicStats();
		System.out.println();
		archer.generateStats();
		System.out.println();
		archer.printStats();

	}
}
