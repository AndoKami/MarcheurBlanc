package com.example.MarcheurBlanc.Service;


import com.example.MarcheurBlanc.model.Lieu;
import com.example.MarcheurBlanc.model.Marche;
import com.example.MarcheurBlanc.model.Marcheur;

public class MarcheurService {

    public Marche faireMarcherAleatoirement(Lieu lieuDepart, Lieu lieuArrivee) {
        Marcheur marcheur = new Marcheur(lieuDepart);
        while (!marcheur.getPositionActuelle().equals(lieuArrivee)) {
            marcheur.avancerAleatoirement();
        }
        return marcheur.getMarcheEnCours();
    }
}