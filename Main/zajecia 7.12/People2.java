public class People {
	String name;
	int age;
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Adam", "Nowak", 30));
		people.add(new Person("Jan", "Kowalski", 19));
		people.add(new Person("Olga", "Polak", 24));

		for(int i = 0; i < people.size(); i++) {
			System.out.print("Imiê i nazwisko: " + people.get(i));
			i++;
			System.out.println(", wiek: " + people.get(i));
		}
	}
}

public class People2 implements Comparable<People>{
	if(this.age == o.age) {
		return 0;
	} else if(this.age > o.age) {
		return 1;
	} else {
		return -1;
	}
	
	public int compareTo(People o) {
		return this.age.compareTo(o.age);
	}
	
	public int compareTo2(People o) {
		return this.name.compareTo(o.name);
	}
}