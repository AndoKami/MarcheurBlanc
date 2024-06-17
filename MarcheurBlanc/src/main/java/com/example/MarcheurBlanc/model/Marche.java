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

        for (int i = 0; i < trajet.size(); i++) {
            marche.append(trajet.get(i).getNom());
            if (i < trajet.size() - 1) {
                marche.append(" -> ");
            }
        }
        return marche.toString();
    }
}