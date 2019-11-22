import java.io.File;
import java.util.Scanner;

public class Kalkulator
{

	public static void main(String[] args)
	{
		System.out.println("Wybierz typ działania programu\n"
				+ "1. Konsola\n"
				+ "2. Czytanie z pliku.");
		
		Scanner scan = new Scanner(System.in);
		
		int typ = scan.nextInt();
		
		if (typ==1)
		{
			System.out.println("Wpisz swoje działanie");
			String dzialanie = scan.nextLine();
			for (int i=0; i<dzialanie.length(); i++)
			{
				if (dzialanie[i]=='+' || dzialanie[i]=='-' || dzialanie[i]=='*' || dzialanie[i]=='/')
					{
					
					}
				else
					{
					int liczba == dzialanie[i];
					
					};
			}
		}
		else if (typ==2)
		{
			File file = new File("obliczenia.txt");
			System.out.println("Działania z pliku obliczenia.txt:");
		}
		else
		{
			System.out.println("Błąd wyboru");
		}

	}

}
