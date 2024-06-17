package com.example.MarcheurBlanc.model;


import lombok.Getter;

@Getter
public class Rue {
    private String nom;
    private final Lieu lieu1;
    private final Lieu lieu2;

    public Rue(String nom, Lieu lieu1, Lieu lieu2) {
        this.nom = nom;
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;

        lieu1.ajouterRue(this);
        lieu2.ajouterRue(this);
    }

    public Rue(Lieu lieu1, Lieu lieu2) {
        this.lieu1 = lieu1;
        this.lieu2 = lieu2;

        lieu1.ajouterRue(this);
        lieu2.ajouterRue(this);
    }

    public Lieu lieuRelié(Lieu lieuActuel) {
        if (lieuActuel.equals(lieu1)) {
            return lieu2;
        } else if (lieuActuel.equals(lieu2)) {
            return lieu1;
        } else {
            throw new IllegalArgumentException("Cet lieu n'est pas relié à cette Rue");
        }
    }

    @Override
    public String toString() {
        return (nom != null ? nom : "Rue sans nom") + " entre " + lieu1.getNom() + " et " + lieu2.getNom();
    }
}