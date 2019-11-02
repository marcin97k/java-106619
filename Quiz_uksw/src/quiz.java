import java.io.File;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quiz
{
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		int punktacja = 0;
		
		// œcie¿ka do pliku z pytaniami
		File file = new File("pytania.txt");
		
		Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(file);
		int licznik = 1;
		
			while (scanner.hasNext())
			{
				System.out.println("** PYTANIE " + licznik + " **");
				String pytanie = scanner.nextLine();
				System.out.println(pytanie);

				String a = scanner.nextLine();
				System.out.print("a) ");
				System.out.println(a);
		
				String b = scanner.nextLine();
				System.out.print("b) ");
				System.out.println(b);
		
				String c = scanner.nextLine();
				System.out.print("c) ");
				System.out.println(c);
		
				String d = scanner.nextLine();
				System.out.print("d) ");
				System.out.println(d);
		
				String prawidlowaOdp = scanner.nextLine();
				System.out.println("* Twoja odpowiedz: ");
		
				String odp = scan.nextLine();
		
				if (odp.equals(prawidlowaOdp))
				{
					System.out.println("To jest prawid³owa odpowiedz. +1 punkt\n");
					punktacja++;
				}
				else
				{
					System.out.println("To jest b³êdna odpowiedz. Nie dostajesz punktu. Prawid³owa odpowied¿ to " + prawidlowaOdp + "\n");
				}
				
				licznik++;
			}
			licznik --;
			double procent = (double)punktacja / licznik * 100;
			
			System.out.println("Koniec QUIZu. Uda³o Ci siê zdobyæ " + punktacja + " punkty(ów). Daje to " + procent + "%.");
			if (procent == 100)
			{
				System.out.println("Jesteœ œwietny w t¹ grê!");
			}
			else if (procent >= 80)
			{
				System.out.println("Jesteœ prawie mistrzem w tej dziedzinie.");
			}
			else if (procent == 0)
			{
				System.out.println("To chyba nie jest Twoja tematyka.");
			}
			else
			{
				System.out.println("Mog³o byæ lepiej.");
			}
	}

}
