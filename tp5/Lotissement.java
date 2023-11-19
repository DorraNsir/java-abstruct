package tp5;

public class Lotissement implements GestionPropriete{
    protected Propriete [] tabProp;
    protected int nombre=0;

    public Lotissement(int capacite) {
        if(capacite<MAX_PROPRIETES){
            this.tabProp = new Propriete[capacite];
        }
    }

    @Override
    public void afficherProprietes() {
        for (int i=0;i<nombre;i++){
            System.out.println(tabProp[i].toString());
        }
    }

    @Override
    public boolean ajouter(Propriete p) {
        if(nombre<tabProp.length){
            tabProp[nombre]=p;
            nombre++;
            return true;
        }
        return false;
    }
    @Override
    public boolean supprimer(Propriete p) {
            for (int i = 0; i < nombre; i++) {
                if(tabProp[i].equals(p)){
                    for (int j = i; j < nombre; j++){
                        tabProp[j] = tabProp[j + 1];
                    }
                    tabProp[nombre - 1] = null;
                    nombre--;
                    return true;
                }

                }
            return false;
    }
    public Propriete getproprieteByIndice (int i){
        if(i>0 || i<nombre){
            return tabProp[i];
        }
        return null;
    }
    public int getnbPieces() {
        int nbPieces = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                nbPieces += ((ProprietePrivee) tabProp[i]).getNbPieces();
            }
        }
        return nbPieces;
    }
//    public void impoPayee(){
//        for (int i = 0; i < nombre; i++) {
//            System.out.println(" la propriétés num"+(i+1)+"  a payee = "+tabProp[i].calculImpot());
//            }
//    }
    public int nombreGlobalePieces(){
        int somme=0;
        for (int i = 0; i < nombre; i++) {
            if(tabProp[i]instanceof ProprietePrivee){
                somme+=((ProprietePrivee) tabProp[i]).getNbPieces();
            }
        }
        return somme;
    }
    public void moins_dimpôts(){
        Propriete pMin=null;
        for (int i = 0; i < nombre; i++) {
            if(tabProp[i]instanceof ProprietePrivee){
                if(pMin==null) pMin=tabProp[i];
                else{
                if(tabProp[i].calculImpot()<pMin.calculImpot()) {
                    pMin = tabProp[i];
                }

                }
            }
        }
        System.out.println(" le propriétaire qui a paye le moins d’impôts : "+pMin.toString()+" le montant des impôts qu’il va payer."+pMin.calculImpot());
    }
}
