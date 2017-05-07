public class Automobile 

{

	private int Doors;

	private int Cylinders;


	private String Color;

	private String Model;

	private static String hornSound;

	

	public Automobile (String n, String co, int d, int cy, String hS)

	{
        Model = n;
		Color = co;

		Doors = d;

		Cylinders = cy;

		hornSound = hS;
	}
	public String toString()
	{
		return "The " + Color + " " + Model +  ": a " + Cylinders + "-cylinder, " + Doors + " door automobile ";
	}

	public void SetNumberofDoors (int d)

	{

		Doors = d;

	}

	

	public void SetNumberofCylinders (int c)

	{

		Cylinders = c;

	}



	public void SetColor (String c)

	{

		Color = c;

	}



	public void SetName (String n)

	{

		Model = n;

	}

	
public String Honks()
{
String honks =  hornSound;
return honks;
}
public static String Honk () {return "Bebop Beeep Beep" ; } 

 public static String Honks(String Sound)
{
	return Sound;
	}
}


