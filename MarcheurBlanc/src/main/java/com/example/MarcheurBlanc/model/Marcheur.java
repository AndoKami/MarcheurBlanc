package com.example.MarcheurBlanc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@Getter
public class Marcheur {
    private final String nom;

    public Marche marcher(Carte carte, Lieu depart, Lieu destination) {
        if (!carte.getLieux().contains(depart) || !carte.getLieux().contains(destination)) {
            throw new RuntimeException("Tu t'es trompé de carte");
        }

        List<Lieu> trajet = new ArrayList<>();
        trajet.add(depart);
        Random random = new Random();

        while (!depart.equals(destination)) {
            List<Rue> ruesDisponibles = new ArrayList<>(depart.getRues());
            Rue rueChoisie = ruesDisponibles.get(random.nextInt(ruesDisponibles.size()));

            Lieu prochainLieu = rueChoisie.lieuRelié(depart);
            depart = prochainLieu;
            trajet.add(depart);
        }

        return new Marche(trajet);
    }

}