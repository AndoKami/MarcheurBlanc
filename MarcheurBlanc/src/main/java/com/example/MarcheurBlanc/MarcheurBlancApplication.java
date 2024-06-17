package com.example.MarcheurBlanc;

import com.example.MarcheurBlanc.model.*;

import java.util.Arrays;

public class MarcheurBlancApplication {
    public static void main(String[] args) {
        // Création des lieux
        Lieu marais = new Lieu("Marais");
        Lieu sekolintsika = new Lieu("Sekolintsika");
        Lieu hei = new Lieu("HEI");
        Lieu balancoire = new Lieu("Balancoire");
        Lieu pullman = new Lieu("Pullman");
        Lieu esti = new Lieu("ESTI");
        Lieu boulevardDeLEurope = new Lieu("Boulevard de l'Europe");
        Lieu nexta = new Lieu("Nexta");

        // Création des rues et ajout aux lieux correspondants
        new Rue("Rue 1", marais, sekolintsika);
        new Rue("Rue Andriantsiroana", sekolintsika, hei);
        new Rue("Rue Ravohalo", hei, pullman);
        new Rue("Rue 2", hei, balancoire);
        new Rue("Rue 3", balancoire, esti);
        new Rue("Rue 4", balancoire, boulevardDeLEurope);
        new Rue("Rue 5", pullman, nexta);

        // Création de la carte
        Carte carte = new Carte(Arrays.asList(marais, sekolintsika, hei, balancoire, pullman, esti, boulevardDeLEurope, nexta));

        // Création du marcheur
        Marcheur bjarni = new Marcheur("Bjarni");

        // Tester le chemin de HEI à Balancoire
        Lieu depart = hei;
        Lieu destination = balancoire;
        try {
            Marche marche = bjarni.marcher(carte, depart, destination);
            System.out.println(marche);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Tester les chemins avec les contraintes mentionnées
        // HEI -> Marais (should return to Sekolintsika)
        depart = hei;
        destination = marais;
        try {
            Marche marche = bjarni.marcher(carte, depart, destination);
            System.out.println(marche);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // HEI -> Nexta (should return to Pullman)
        depart = hei;
        destination = nexta;
        try {
            Marche marche = bjarni.marcher(carte, depart, destination);
            System.out.println(marche);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}