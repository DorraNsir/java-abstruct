package tp5;

public class Fiscalite {
    public static void main(String[] args) {
        Lotissement lt= new LotissementPrivee(10);
        Personne p1=new Personne(1234,"dorra","nsir") ;
        Personne p2=new Personne(5678,"cyrine","mech") ;
        Personne p3=new Personne(78900,"tesnim","roro") ;
        ProprietePrivee pro1=new ProprietePrivee(1,"courniche",p1,350,4) ;
        ProprietePrivee pro2=new Villa(2,"DAr chaaben",p2,400,6,true) ;
        ProprietePrivee pro3=new Appartement(3,"Korba",p2,1200,8,3);
        ProprieteProfessionnelle pro5=new ProprieteProfessionnelle(4,"Korba",p3,1000, 50, true);
        ProprieteProfessionnelle pro4=new ProprieteProfessionnelle(5,"Bir Bouragba",p1,2500, 400, false);
        Lotissement l=new Lotissement(10);
        l.ajouter(pro1);
        l.ajouter(pro2);
        l.ajouter(pro3);
        l.ajouter(pro4);
        l.ajouter(pro5);
        System.out.println("*************************");
        l.afficherProprietes();
        System.out.println("*************************");
        System.out.println("le nombre global des pièces ="+l.nombreGlobalePieces());
        l.moins_dimpôts();
        l.supprimer(pro3);
        System.out.println("***********apres la suppression **************");
        l.afficherProprietes();
        System.out.println("*******************************************************");
        lt.ajouter(pro1);
        lt.ajouter(pro2);
        lt.ajouter(pro3);
        lt.ajouter(pro4);
        lt.ajouter(pro5);
        lt.afficherProprietes();
        System.out.println("************lt*************");
        System.out.println("le nombre global des pièces ="+lt.nombreGlobalePieces());
        lt.moins_dimpôts();
        lt.supprimer(pro3);
        System.out.println("***********apres la suppression **************");
        lt.afficherProprietes();
    }
}
