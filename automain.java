public class automain 

{



	public static void main(String[] args) 


	{

	Automobile C = new Automobile("Cabbie", "Yellow",4,2, "Bebop");

	Automobile S = new Automobile("Sporty", "Red",4,3, "Beeep");

	Automobile V = new Automobile("Vany", "Green",5,4, "Beep");
	
	  
	   System.out.println((C) + " honks " + C.Honks());
		
		System.out.println((C) + " honks " + C.Honks("BBBBeeeeppppp"));


		System.out.println((S) + " honks " + S.Honks());
		
		System.out.println((S) + " honks " + S.Honks("BBBBBeeeeeeeeepppppppp"));


		System.out.println((V) + " honks " + V.Honks());
		
		System.out.println((V) + " honks " + V.Honks("BBBBBBBBBBEeeeeeeeeeeeeepppppp"));
	}

	}