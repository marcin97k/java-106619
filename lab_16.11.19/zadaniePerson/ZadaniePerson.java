public class Teacher implements UniversityPerson
{
	public String pozycja = "Teacher";
	public String imie;
	public String nazwisko;
	public int wiek;
	public String wyksztalcenie;
	void zrobKolokwium(String temat);
	void zrobEgzamin(String temat);
}

public class Student implements Person
{
	public int nrIndeksu;
	public int semestr;
	public String imie;
	public String nazwisko;
	public int wiek;
	void zlozPodanie(String powod);
}

public class ZadaniePerson
{	
	public static void main(String[] args)
	{
			Student janKowalski = new Student();
			janKowalski.nrIndeksu = 123456;
			janKowalski.semestr = 5;
			janKowalski.imie = "Jan";
			janKowalski.nazwisko = "Kowalski";
			janKowalski.wiek = 30;
			janKowalski.zlozPodanie("Powtórzenie roku");
			
			Teacher adamNowak = new Teacher();
			adamNowak.imie = "Adam";
			adamNowak.nazwisko = "Nowak";
			adamNowak.wiek = 60;
			adamNowak.wyksztalcenie = "Profesor";
	}
}