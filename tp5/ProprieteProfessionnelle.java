package tp5;

public class ProprieteProfessionnelle extends Propriete {

    private int nbEmployes;
    private boolean estEtatique;

    public ProprieteProfessionnelle(int id, String adresse, Personne responsable, double surface, int nbEmployes, boolean estEtatique) {
        super(id, adresse, responsable, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }

    @Override
    public double calculImpot() {
        if(!estEtatique){
            return super.surface+30/nbEmployes;
        }
        return 0;
    }
}
