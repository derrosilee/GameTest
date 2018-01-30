import java.util.Random;

public abstract class Character
{
	protected static final Random randomDice = new Random();

	protected String	characterName;
	protected int			strenght;
	protected int			dexterity;
	protected int			intelligence;

	public String getCharacterName()
	{
		return characterName;
	}

	public void setCharacterName( String characterName )
	{
		this.characterName = characterName;
	}

	public abstract void printStats();
	
	public abstract void generateStats();
	
	public abstract void setClassAtributes();
}
