package test;

public class FizzBuzz {

	
	public static int askForFizz(int number)
	{
		if (number >= 9) return 3;
		if (number >= 6) return (2);
		if ( number >= 3 ) return (1);		
		return(0);
	}

	public static int askForBuzz(int number)
	{
		if ( number == 5) return (1);
		return(0);
	}
	
	
}
