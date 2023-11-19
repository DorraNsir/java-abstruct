package tp5;


public class LotissementPrivee extends Lotissement {

    public LotissementPrivee(int capacite) {
        super(capacite);
    }
    @Override
    public boolean ajouter(Propriete p) {
            if(p instanceof ProprietePrivee) {
                super.ajouter(p);
                return true;
            }
            return false;
    }

    @Override
    public Propriete getproprieteByIndice(int i) {
        for (int j=0 ;j<nombre;j++){
            if(tabProp[j]instanceof ProprietePrivee){
                return super.getproprieteByIndice(i);
                }
        }
        return null;
    }

    @Override
    public int getnbPieces() {
        for (int j=0 ;j<nombre;j++){
            if(tabProp[j]instanceof ProprietePrivee){
                return super.getnbPieces();
            }
        }
        return 0;
    }
}
