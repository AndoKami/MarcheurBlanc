package com.example.MarcheurBlanc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
public class Lieu {
    private final String nom;
    private List<Rue> rues = new ArrayList<>();

    public Lieu(String nom) {
        this.nom = nom;
    }

    public void ajouterRue(Rue rue) {
        if (!rues.contains(rue)) {
            rues.add(rue);
        }
    }
}