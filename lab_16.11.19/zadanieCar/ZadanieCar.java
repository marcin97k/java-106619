public class ZadanieCar {
	
	public static void main(String[] args)
	{
		
		public abstract class Samochod
		{
			protected String marka;
			protected String model;
			protected String kolor;
			protected int przebieg;
			protected int rocznik;
			protected int liczbaMiejsc;
			protected int liczbaDrzwi;
			protected double pojemnoscSilnika;
		
			public Samochod(String marka, String model, String kolor, int przebieg, int rocznik, int liczbaDrzwi, int liczbaMiejsc, double pojemnoscSilnika)
			{
				this.marka = marka;
				this.model = model;
				this.kolor = kolor;
				this.przebieg = przebieg;
				this.rocznik = rocznik;
				this.liczbaMiejsc = liczbaMiejsc;
				this.liczbaDrzwi = liczbaDrzwi;
				this.pojemnoscSilnika = pojemnoscSilnika;
			}

			//zak³adamy, ¿e nie mo¿na wykupiæ AC dla auta starszego ni¿ 15 lat
			public boolean czyAc(int rocznik, int dzisiaj)
			{
				return dzisiaj - rocznik < 15;
			}
			
		}

		public class Mercedes extends Samochod
		{
			public static final String MARKA = "Mercedes";
		}
		
		Samochod s1 = new Samochod();
		s1.marka = "Opel";
		s1.model = "Corsa";
		s1.kolor = "czarny";
		s1.przebieg = 160000;
		s1.rocznik = 1998;
		s1.liczbaMiejsc = 5;
		s1.liczbaDrzwi = 3;
		s1.pojemnoscSilnika = 1.2;
		s1.czyAc(s1.rocznik, 2019);
	}
	
}