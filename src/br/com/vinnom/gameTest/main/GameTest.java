package br.com.vinnom.gameTest.main;

import java.util.Scanner;

import br.com.vinnom.gameTest.character.*;
import br.com.vinnom.gameTest.weapons.*;

public class GameTest
{
	private static Scanner input;

	public static void main( String[] args )
	{
		Knight knight = new Knight();

		Sword sword = new Sword();

		input = new Scanner( System.in );
		
		knight.characterName = confirmName();

		System.out.printf( "\n\nNow, lets generate %s stats.\n", knight.characterName );
		knight.setClassAtributes();
		knight.printBasicStats();
		System.out.println();
		knight.generateStats();
		System.out.println();
		knight.printStats();
		System.out.printf( "\nEquipping your knight with a Wood Sword (Strenght + %d)\n", sword.woodSword() );
		knight.setWoodSword();
		knight.printStats();
	}
	
	static String confirmName()

	{
		String readName;
		String readLine;
		
		do
		{
			System.out.println( "Type your character name" );
			readName = input.nextLine();
			System.out.println( "Are you sure?" );
			readLine = input.nextLine();
			System.out.println( "readName = " + readName + " readLine = " + readLine );
		}
		while( ! readLine.equals( "yes" ) );
		return readName;
	}
}
