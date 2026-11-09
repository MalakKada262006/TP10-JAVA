package ma.project.tp10;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TripletH<A, B, C> {
	private final A premier;
	private final B second;
	private final C troisieme;

	public TripletH(A premier, B second, C troisieme) {
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}

	public A getPremier() {
		return premier;
	}

	public B getSecond() {
		return second;
	}

	public C getTroisieme() {
		return troisieme;
	}

	public void affiche() {
		System.out.println("TripletH : [" + premier + ", " + second + ", " + troisieme + "]");
	}

	public List<Object> toList() {
		return Arrays.asList(premier, second, troisieme);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TripletH<?, ?, ?> tripletH = (TripletH<?, ?, ?>) o;
		return Objects.equals(premier, tripletH.premier) && Objects.equals(second, tripletH.second)
				&& Objects.equals(troisieme, tripletH.troisieme);
	}

	@Override
	public int hashCode() {
		return Objects.hash(premier, second, troisieme);
	}
}
