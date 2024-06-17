package com.example.MarcheurBlanc;

import com.example.MarcheurBlanc.model.Carte;
import com.example.MarcheurBlanc.model.Lieu;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarteTest {
    @Test
    public void carteTest() {
        var marais = new Lieu("Marais");
        var sekolontsika = new Lieu("Sekolontsika");

        var carte = new Carte(List.of(marais, sekolontsika));
        carte.ajouterLieu(marais);

        assertEquals(2, carte.getLieux().size());
    }
}