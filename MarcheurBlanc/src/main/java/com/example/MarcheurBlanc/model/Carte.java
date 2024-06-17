package com.example.MarcheurBlanc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Getter
public class Carte {
    private List<Lieu> lieux;

    public void ajouterLieu(Lieu lieu) {
        if (!lieux.contains(lieu)) {
            lieux.add(lieu);
        }
    }

}