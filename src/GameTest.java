import java.util.Scanner;

public class GameTest
{
	public static void main( String[] args )
	{
		int control = 0;
		String readName;
		String readLine;

		Knight knight = new Knight();

		Scanner input = new Scanner( System.in );

		do
		{
			System.out.println( "Type your character name:" );
			readName = input.nextLine();
			knight.setCharacterName( readName );
			System.out.println( "\nAre you sure? (yes or no)" );
			readLine = input.nextLine();
			System.out.println();
		}
		while( readLine.equals( "no" ) );

		System.out.println( "Now, lets generate your character stats." );
		knight.printStats();
		System.out.println();
		knight.generateStats();
		System.out.println();
		knight.printStats();

	}
}
