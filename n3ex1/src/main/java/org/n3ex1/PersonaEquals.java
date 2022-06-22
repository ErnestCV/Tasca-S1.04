package org.n3ex1;

public class PersonaEquals {

    private final String nom;
    private final int edat;

    public PersonaEquals(String nom, int edat) {
        this.nom = nom;
        this.edat = edat;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) {
            return true;
        }

        if (!(o instanceof PersonaEquals p)) {
            return false;
        }

        return p.nom.equals(nom) && p.edat == edat;

    }

}