import java.util.Scanner;

public class GameTest
{
	public static void main( String[] args )
	{
		int control = 0;
		String leLinha;

		Knight knight = new Knight();

		Scanner entrada = new Scanner( System.in );

		System.out.println( "Type your character name:" );
		leLinha = entrada.nextLine();
		knight.setCharacterName( leLinha );
		System.out.println( "\nAre you sure? (yes or no)" );
		leLinha = entrada.nextLine();
		
		while( control != 1 )
		{
			switch( leLinha )
			{
				case "yes" :
					System.out.println( "\nThen your name is: " + knight.getCharacterName() );
					control = 1;
					break;

				default :
					System.out.println( "\nType your character name:" );
					leLinha = entrada.nextLine();
					knight.setCharacterName( leLinha );
					System.out.println( "\nAre you sure? (yes or no)" );
					leLinha = entrada.nextLine();
					if( leLinha.equals( "yes" ) )
					{
						System.out.println( "\nThen your name is: " + knight.getCharacterName() );
						control = 1;
					}
					break;
			}
		}

	}
}
