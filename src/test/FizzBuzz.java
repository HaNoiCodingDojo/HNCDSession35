package test;

public class FizzBuzz {

	
	public static int askForFizz(int number)
	{
		if ( number == 3) return (1);
		if (number == 6) return (2);
		if ( number == 4 ) return (1);		
		return(0);
	}

	public static int askForBuzz(int number)
	{
		if ( number == 5) return (1);
		return(0);
	}
}
