public class Zadanie
{
	public static void main(String[] args)
	{
		public class Square implements Figure, Resetable
		{
			private int liczbaBokow;
			private boolean czyWypukla;
		}
		Square s1 = new Square();
		s1.resetAllAttributes();
		s1.printSidesNumber();
	}
}
