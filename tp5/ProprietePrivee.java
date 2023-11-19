package tp5;

public  class ProprietePrivee extends Propriete{
    private int nbPieces;

    public int getNbPieces() {
        return nbPieces;
    }

    public ProprietePrivee(int id, String adresse, Personne responsable, double surface, int nbPieces) {
        super(id, adresse, responsable, surface);
        this.nbPieces = nbPieces;
    }

    @Override
    public String toString() {
        return super.toString()+"nbPieces=" + nbPieces ;
    }


    public  double calculImpot(){
        return 0.5*super.surface + 10/nbPieces;
    }


}
