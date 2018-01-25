import java.util.Scanner;

public class GameTest
{
	public static void main( String[] args )
	{
		int control = 0;
		String readLine;

		Knight knight = new Knight();

		Scanner input = new Scanner( System.in );

		System.out.println( "Type your character name:" );
		readLine = input.nextLine();
		knight.setCharacterName( readLine );
		System.out.println( "\nAre you sure? (yes or no)" );
		readLine = input.nextLine();
		
		while( control != 1 )
		{
			switch( readLine )
			{
				case "yes" :
					System.out.println( "\nThen your name is: " + knight.getCharacterName() );
					control = 1;
					break;

				default :
					System.out.println( "\nType your character name:" );
					readLine = input.nextLine();
					knight.setCharacterName( readLine );
					System.out.println( "\nAre you sure? (yes or no)" );
					readLine = input.nextLine();
					if( readLine.equals( "yes" ) )
					{
						System.out.println( "\nThen your name is: " + knight.getCharacterName() );
						control = 1;
					}
					break;
			}
		}

	}
}
