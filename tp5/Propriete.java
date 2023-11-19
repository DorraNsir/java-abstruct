package tp5;

import java.util.Objects;

public abstract class Propriete {
    protected int id ;
    protected String adresse;
    protected Personne responsable ;
    protected double surface;

    public int getId() {
        return id;
    }

    public Propriete(int id, String adresse, Personne responsable, double surface) {
        this.id = id;
        this.adresse = adresse;
        this.responsable = responsable;
        this.surface = surface;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"  : " +
                "id=" + id +
                ", adresse='" + adresse + '\'' +
                ", responsable=" + responsable +
                ", surface=" + surface +
                ", impot = " + this.calculImpot();
    }
    public abstract double calculImpot();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propriete propriete = (Propriete) o;
        return id == propriete.id && Double.compare(surface, propriete.surface) == 0 && Objects.equals(adresse, propriete.adresse) && Objects.equals(responsable, propriete.responsable);
    }


}
