import java.util.Map;

public class Maps {

	Map<Integer, Person> map=new HashMap<Integer, String>();
	
	public static void main(String[] args) {
		map.put(87578424578, "Jan Kowalski");
		map.put(90578424578, "Adam Nowak");
		
		String string = map.get(87578424578);

	}



}