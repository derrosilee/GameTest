package br.com.vinnom.gameTest.main;

import java.util.Scanner;

import br.com.vinnom.gameTest.character.*;
import br.com.vinnom.gameTest.weapons.*;

public class GameTest
{
	private static Scanner input;
	
	private static Knight knight = new Knight();

	public static void main( String[] args )
	{
		createKnight();
	}
	
	static String confirmName()

	{
		String readName;
		String readLine;
		
		input = new Scanner( System.in );
		
		do
		{
			System.out.println( "Type your character name" );
			readName = input.nextLine();
			System.out.println( "Are you sure?" );
			readLine = input.nextLine();
		}
		while( ! readLine.equals( "yes" ) );
		return readName;
	}
	
	static void createKnight()
	{
		knight.characterName = confirmName();

		System.out.printf( "\n\nNow, lets generate %s stats.\n", knight.characterName );
		knight.setClassAtributes();
		knight.printBasicStats();
		System.out.println();
		knight.generateStats();
		System.out.println();
		knight.printStats();
	}
}
