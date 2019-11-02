import java.util.Arrays;
import java.util.Scanner;

public class Triangle
{
	
	public static void main(String[] args)
	{		
		Scanner scan = new Scanner(System.in);
		
		// nag³ówek -----------------		
		System.out.println("**** Program stworzony na  \n"
				+ "**** laboratorium z Javy \n"
				+ "**** UKSW 2019/20 \n"
				+ "**** Program liczy ró¿ne w³aœciwoœci trójk¹ta z podanych boków.\n");
        
		// Wprowadzanie boków -----------
		System.out.println("Podaj d³ugoœci boków trójk¹ta: ");
        
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
		
        // Czy mo¿na z³o¿yæ trójk¹t ------------------------------------
        if (a+b>c && a+c>b && b+c>a)
        {
        	// Mo¿na z³o¿yæ trójk¹t ------------------------------------------------------------
        	System.out.println("\n**** Mo¿na z³o¿yæ trójk¹t.");
        	
        	// Obwód trójk¹ta ---------------------------------------
        	double obwod = a+b+c;
        	System.out.println("\n**** Obwód tego trójk¹ta to: " + obwod);
        	
        	// Pole trójk¹ta ----------------------------------------
        	double p = obwod/2;
        	double pole = Math.sqrt(p*(p-a)*(p-b)*(p-c)); 
        	System.out.println("\n**** Pole tego trójk¹ta to: " + pole);
        
        	// K¹ty w trójk¹cie ------------------------------------
        	double alfa = Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2))/(2*b*c)) * 57.29577951308;
        	double beta = Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2))/(2*a*c)) * 57.29577951308;
        	double gamma = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2))/(2*a*b)) * 57.29577951308;
        	
        	alfa = Math.round(alfa); // zakr¹glanie do pe³nych stopni
        	beta = Math.round(beta); // zakr¹glanie do pe³nych stopni
        	gamma = Math.round(gamma); // zakr¹glanie do pe³nych stopni
        	
        	System.out.println("\n**** Miary k¹tów w trójk¹cie: ");
        	System.out.println(alfa + " stopni(e)");
        	System.out.println(beta + " stopni(e)");
        	System.out.println(gamma + " stopni(e)");
        	
        	// Jaki to jest trójk¹t ----------------------------------
        	if (a==b && a==c && b==c)
        	{
        		System.out.print("\n**** To jest trójk¹t równoboczny i ");
        	}
        	else if (a==b || a==c || b==c)
        	{
        		System.out.print("\n**** To jest trójk¹t równoramienny i ");
        	}
        	else
        	{
        		System.out.print("\n**** To jest trójk¹t ró¿noboczny i ");
        	}
        	
        	if (alfa>90 || beta>90 || gamma>90)
        	{
        		System.out.println("rozwartok¹tny.");
        	}
        	else if (alfa==90 || beta==90 || gamma==90)
        	{
        		System.out.println("prostok¹tny.");
        	}
        	else
        	{
        		System.out.println("ostrok¹tny.");
        	}
        	
        	// Wysokoœci w trójk¹cie ----------------------------------
        	double ha = (2*pole)/a;
        	double hb = (2*pole)/b;
        	double hc = (2*pole)/c;
        	System.out.println("\n**** Wysokoœci w trójk¹cie: ");
        	System.out.println(ha);
        	System.out.println(hb);
        	System.out.println(hc);
        	
        }
        else
        {
        	// Nie mo¿na z³o¿yæ trójk¹ta --------------------------------------------------------
        	System.out.println("Nie mo¿na z³o¿yæ trójk¹ta.");
        	System.out.println("Koniec dzia³ania programu.");
        }
	}

}
