import javax.swing.JOptionPane;
import java.util.Arrays;

public class trojkat {

	static double poletr(double a,double b,double c)
	{
		if((a+b>c)&&(a+c>b)&&(b+c>a))
		{
			System.out.print("Mo¿na z³o¿yæ trójk¹t: ");
			double p=((a+b+c)/2);
			return (double)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		} else {
			System.out.print("Nie mo¿na z³o¿yæ trójk¹ta.");
			System.out.println();
			return 0;
			}
	}
		  	
	public static void main(String[] args)
	{
		int a=Integer.parseInt(JOptionPane.showInputDialog("Podaj a: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Podaj b: "));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Podaj c: "));
		System.out.print("Pole trójk¹ta: "+poletr(a,b,c));
	}
	
}