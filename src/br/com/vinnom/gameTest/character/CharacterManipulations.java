package br.com.vinnom.gameTest.character;

import java.util.Scanner;

import br.com.vinnom.gameTest.armor.Chest;
import br.com.vinnom.gameTest.weapons.Bow;
import br.com.vinnom.gameTest.weapons.Staff;
import br.com.vinnom.gameTest.weapons.Sword;

public class CharacterManipulations
{
  private static Scanner input = new Scanner( System.in );

  private static Knight knight = new Knight();
  private static Mage   mage   = new Mage();
  private static Archer archer = new Archer();

  private static Sword sword = new Sword();
  private static Staff staff = new Staff();
  private static Bow   bow   = new Bow();

  private static Chest chest = new Chest();

  static String confirmName()

  {
    String readName;
    String readLine;

    do
    {
      System.out.println( "Type your character name" );
      readName = input.nextLine();
      System.out.println( "Are you sure?(yes or no)" );
      readLine = input.nextLine();
    }
    while( !readLine.equals( "yes" ) );
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
    System.out.printf( "\nEquipping %s with a Wood Sword (Strenght + %d)", knight.characterName, sword.woodSword() );
    System.out.printf( " and Leather Clothes (Resistance + %d)\n", chest.leatherClothes() );
    knight.setWoodSword();
    knight.setLeatherClothes();
    knight.printStats();
  }

  static void createMage()
  {
    mage.characterName = confirmName();

    System.out.printf( "\n\nNow, lets generate %s stats.\n", mage.characterName );
    mage.setClassAtributes();
    mage.printBasicStats();
    System.out.println();
    mage.generateStats();
    System.out.println();
    mage.printStats();
    System.out.printf( "\nEquipping %s with a Wood Staff (Strenght + %d)", mage.characterName, staff.woodStaff() );
    System.out.printf( " and Leather Clothes (Resistance + %d)\n", chest.leatherClothes() );
    mage.setWoodStaff();
    mage.setLeatherClothes();
    mage.printStats();
  }

  static void createArcher()
  {
    archer.characterName = confirmName();

    System.out.printf( "\n\nNow, lets generate %s stats.\n", archer.characterName );
    archer.setClassAtributes();
    archer.printBasicStats();
    System.out.println();
    archer.generateStats();
    System.out.println();
    archer.printStats();
    System.out.printf( "\nEquipping %s with a Short Wood Bow (Strenght + %d)", archer.characterName,
        bow.shortWoodBow() );
    System.out.printf( " and Leather Clothes (Resistance + %d)\n", chest.leatherClothes() );
    archer.setShortWoodBow();
    archer.setLeatherClothes();
    archer.printStats();
  }

  public void chooseCharacterClass()
  {
    String characterClass;

    System.out.println( "Type the class name to choose your character class" );
    System.out.println( "knight\nmage\narcher" );
    System.out.print( "Class: " );
    characterClass = input.nextLine();

    switch( characterClass )
    {
      case "knight" :
        createKnight();
        break;
      case "mage" :
        createMage();
        break;
      case "archer" :
        createArcher();
        break;
    }
  }

}
