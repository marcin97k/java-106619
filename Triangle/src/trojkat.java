import javax.swing.JOptionPane;
import java.util.Arrays;

public class trojkat {

	static double poletr(double a,double b,double c)
	{
		if((a+b>c)&&(a+c>b)&&(b+c>a))
		{
			double p=((a+b+c)/2);
			return (double)Math.sqrt(p*(p-a)*(p-b)*(p-c));
		}else return 0;
	}
	  	
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Podaj a: "));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Podaj b: "));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Podaj c: "));
		System.out.print("Pole trójk¹ta: "+poletr(a,b,c));
	
	}
	}