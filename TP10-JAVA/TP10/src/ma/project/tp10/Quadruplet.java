package ma.project.tp10;

import java.util.Objects;

public class Quadruplet<T> {
	private final T premier;
	private final T second;
	private final T troisieme;
	private final T quatrieme;

	public Quadruplet(T premier, T second, T troisieme, T quatrieme) {
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
		this.quatrieme = quatrieme;
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

	public T getQuatrieme() {
		return quatrieme;
	}

	public void affiche() {
		System.out.println("Quadruplet : [" + premier + ", " + second + ", " + troisieme + ", " + quatrieme + "]");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Quadruplet<?> that = (Quadruplet<?>) o;
		return Objects.equals(premier, that.premier) && Objects.equals(second, that.second)
				&& Objects.equals(troisieme, that.troisieme) && Objects.equals(quatrieme, that.quatrieme);
	}

	@Override
	public int hashCode() {
		return Objects.hash(premier, second, troisieme, quatrieme);
	}
}
