import java.util.Arrays;
import java.util.Scanner;

public class Triangle
{
	
	public static void main(String[] args)
	{		
		Scanner scan = new Scanner(System.in);
		
		// nag��wek -----------------		
		System.out.println("**** Program stworzony na  \n"
				+ "**** laboratorium z Javy \n"
				+ "**** UKSW 2019/20 \n"
				+ "**** Program liczy r�ne w�a�ciwo�ci tr�jk�ta z podanych bok�w.\n");
        
		// Wprowadzanie bok�w -----------
		System.out.println("Podaj d�ugo�ci bok�w tr�jk�ta: ");
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
		
        // Czy mo�na z�o�y� tr�jk�t ------------------------------------
        if (a+b>c && a+c>b && b+c>a)
        {
        	// Mo�na z�o�y� tr�jk�t ------------------------------------------------------------
        	System.out.println("\n**** Mo�na z�o�y� tr�jk�t.");
        	
        	// Obw�d tr�jk�ta ---------------------------------------
        	double obwod = a+b+c;
        	System.out.println("\n**** Obw�d tego tr�jk�ta to: " + obwod);
        	
        	// Pole tr�jk�ta ----------------------------------------
        	double p = obwod/2;
        	double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
        	System.out.println("\n**** Pole tego tr�jk�ta to: " + pole);
        
        	// K�ty w tr�jk�cie ------------------------------------
        	double alfa = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))/(2*b*c)) * 57.29577951308;
        	double beta = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2*a*c)) * 57.29577951308;
        	double gamma = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2*a*b)) * 57.29577951308;
        	
        	alfa = Math.round(alfa); // zakr�glanie do pe�nych stopni
        	beta = Math.round(beta); // zakr�glanie do pe�nych stopni
        	gamma = Math.round(gamma); // zakr�glanie do pe�nych stopni
        	
        	System.out.println("\n**** Miary k�t�w w tr�jk�cie: ");
        	System.out.println(alfa + " stopni(e)");
        	System.out.println(beta + " stopni(e)");
        	System.out.println(gamma + " stopni(e)");
        	
        	// Jaki to jest tr�jk�t ----------------------------------
        	if (a==b && a==c && b==c)
        	{
        		System.out.print("\n**** To jest tr�jk�t r�wnoboczny i ");
        	}
        	else if (a==b || a==c || b==c)
        	{
        		System.out.print("\n**** To jest tr�jk�t r�wnoramienny i ");
        	}
        	else
        	{
        		System.out.print("\n**** To jest tr�jk�t r�noboczny i ");
        	}
        	
        	if (alfa>90 || beta>90 || gamma>90)
        	{
        		System.out.println("rozwartok�tny.");
        	}
        	else if (alfa==90 || beta==90 || gamma==90)
        	{
        		System.out.println("prostok�tny.");
        	}
        	else
        	{
        		System.out.println("ostrok�tny.");
        	}
        	
        	// Wysoko�ci w tr�jk�cie ----------------------------------
        	double ha = (2*pole)/a;
        	double hb = (2*pole)/b;
        	double hc = (2*pole)/c;
        	System.out.println("\n**** Wysoko�ci w tr�jk�cie: ");
        	System.out.println(ha);
        	System.out.println(hb);
        	System.out.println(hc);
        	
        }
        else
        {
        	// Nie mo�na z�o�y� tr�jk�ta --------------------------------------------------------
        	System.out.println("Nie mo�na z�o�y� tr�jk�ta.");
        	System.out.println("Koniec dzia�ania programu.");
        }
	}

}
