package br.com.vinnom.gameTest.character;

import br.com.vinnom.gameTest.armor.Chest;
import br.com.vinnom.gameTest.weapons.Bow;

public class Archer extends Character
{

  Bow   bow   = new Bow();
  Chest chest = new Chest();

  @Override
  public void setClassAtributes()
  {
    super.setClassName( "Archer" );
    super.setStrength( 3 );
    super.setResistance( 3 );
    super.setDexterity( 5 );
    super.setIntelligence( 2 );
  }

  @Override
  public void printBasicStats()
  {
    System.out.printf( "==========%s basic stats:\n", super.getClassName() );
    System.out.println( "Strenght:     3" );
    System.out.println( "Dexterity:    5" );
    System.out.println( "Inteligence:  2" );
  }

  public void setShortWoodBow()
  {
    super.setStrength( super.getStrength() + bow.shortWoodBow() );
  }

  public void setShortBronzeBow()
  {
    super.setStrength( super.getStrength() + bow.shortBronzeBow() );
  }

  public void setShortIronBow()
  {
    super.setStrength( super.getStrength() + bow.shortIronBow() );
  }

  public void setShortSteelBow()
  {
    super.setStrength( super.getStrength() + bow.shortSteelBow() );
  }

  public void setLeatherClothes()
  {
    super.setResistance( super.getResistance() + chest.leatherClothes() );
  }

}
