package ma.project.tp10;

import java.util.Objects;

public class Triplet<T> {
	private final T premier;
	private final T second;
	private final T troisieme;

	public Triplet(T premier, T second, T troisieme) {
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}

	public T getPremier() {
		return premier;
	}

	public T getSecond() {
		return second;
	}

	public T getTroisieme() {
		return troisieme;
	}

	public void affiche() {
		System.out.println("Triplet : [" + premier + ", " + second + ", " + troisieme + "]");
	}

	public Triplet<T> swap() {
		return new Triplet<>(second, premier, troisieme);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Triplet<?> triplet = (Triplet<?>) o;
		return Objects.equals(premier, triplet.premier) && Objects.equals(second, triplet.second)
				&& Objects.equals(troisieme, triplet.troisieme);
	}

	@Override
	public int hashCode() {
		return Objects.hash(premier, second, troisieme);
	}
}
