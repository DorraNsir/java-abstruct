package tp5;

public class Appartement extends ProprietePrivee{
    private int numEtage;

    public Appartement(int id, String adresse, Personne responsable, double surface, int nbPieces, int numEtage) {
        super(id, adresse, responsable, surface, nbPieces);
        this.numEtage = numEtage;
    }
    @Override
    public String toString() {
        return super.toString() +
                "numEtage=" + numEtage ;

    }
}
