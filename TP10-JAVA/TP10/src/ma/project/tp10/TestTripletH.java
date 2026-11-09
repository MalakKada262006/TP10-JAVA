package ma.project.tp10;

import java.util.List;

public class TestTripletH {
	public static void main(String[] args) {
		TripletH<Integer, String, Double> th = new TripletH<>(55, "Answer", 3.14);
		th.affiche(); 

		List<Object> elements = th.toList();
		System.out.println("Éléments sous forme de liste : " + elements);

		TripletH<String, Integer, Boolean> th2 = new TripletH<>("Aya", 23, true);
		th2.affiche();
	}
}