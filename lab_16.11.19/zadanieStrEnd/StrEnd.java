import java.util.*;

public class StrEnd
{
	
	public static void main(String[] args)
	{
		String tekst;
        Scanner odczyt = new Scanner(System.in);

        do
        {
        	System.out.println("Wprowadz ci�g znak�w: "); 
        	tekst = odczyt.nextLine();
        	tekst = tekst.toLowerCase();
        } while (!tekst.endsWith("end"));
        
        System.out.println("Koniec programu"); 
	}

}