package quiz;

import java.io.BufferedReader;
import java.util.List;

public class pytanie {
	string tresc;
	string a,b,c,d;
	string poprawnal
	string odpowiedz;
	int nr_pytania;
	int punkt;
	
	public Pytanie(int a) {
		nr_pytania = a;
	}
	
	void wczytaj(List<String> p) {
		tresc = p.get((nr_pytania - 1)*7);
		a = p.get((nr_pytania - 1)*7 + 1);
		b = p.get((nr_pytania - 1)*7 + 2);
		c = p.get((nr_pytania - 1)*7 + 3);
		d = p.get((nr_pytania - 1)*7 + 4);
		poprawna = p.get((nr_pytania - 1)*7 + 5);
		System.out.println(tresc);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	int zadaj() throws IDException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		odpowiedz = br.readLine();
	}
}
