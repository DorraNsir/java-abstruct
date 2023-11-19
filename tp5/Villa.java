package tp5;

public class Villa extends ProprietePrivee{
    private boolean avecPiscine;

    public Villa(int id, String adresse, Personne responsable, double surface, int nbPieces, boolean avecPiscine) {
        super(id, adresse, responsable, surface, nbPieces);
        this.avecPiscine = avecPiscine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "avecPiscine=" + avecPiscine ;

    }

    @Override
    public double calculImpot() {
        if(avecPiscine){
            return super.calculImpot()+200;
        }
        return super.calculImpot();
    }
}
