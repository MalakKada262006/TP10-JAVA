package ma.project.tp10;

public class TestTriplet {
    public static void main(String[] args) {
        Triplet<Integer> t1 = new Triplet<>(2, 3, 4);
        Triplet<Integer> t2 = new Triplet<>(3, 2, 4);

        t1.affiche();

        Triplet<Integer> tSwapped = t1.swap();
        tSwapped.affiche(); 

        System.out.println("tSwapped est égal à t2 ? " + tSwapped.equals(t2)); 

        Quadruplet<String> qStr = new Quadruplet<>("M", "N", "O", "P");
        qStr.affiche(); 
    }
}
