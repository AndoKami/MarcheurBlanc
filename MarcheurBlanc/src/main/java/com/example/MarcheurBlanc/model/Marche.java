package com.example.MarcheurBlanc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Marche {
    private List<Lieu> trajet;

    @Override
    public String toString() {
        StringBuilder marche = new StringBuilder("Marche: ");

        for (Lieu lieu : trajet) {
            marche.append(lieu.getNom()).append(" ");
        }
        return marche.toString();
    }
}