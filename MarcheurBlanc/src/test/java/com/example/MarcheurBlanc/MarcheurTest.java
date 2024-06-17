package com.example.MarcheurBlanc;

import com.example.MarcheurBlanc.model.Carte;
import com.example.MarcheurBlanc.model.Lieu;
import com.example.MarcheurBlanc.model.Marcheur;
import com.example.MarcheurBlanc.model.Rue;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MarcheurTest {

    @Test
    public void marcherSiCarteFaux() {
        //Création des lieux
        var marais = new Lieu("Marais");
        var sekolontsika = new Lieu("Sekolontsika");
        var hei = new Lieu("HEI");
        var pullman = new Lieu("Pullman");
        var nexta = new Lieu("Nexta");
        var balancoire = new Lieu("Balançoire");
        var boulevard = new Lieu("Boulevard de l'Europe");
        var esti = new Lieu("ESTI");

        //Création des rues
        var maraisSekolontsika = new Rue(marais, sekolontsika);
        var sekolontsikaHei = new Rue(sekolontsika, hei);
        var heiPullman = new Rue("Rue Andriantsihorana", hei, pullman);
        var heiBalancoire = new Rue(hei, balancoire);
        var pullmanNexta = new Rue(pullman, nexta);
        var pullmanBalancoire = new Rue("Rue Ranaivo", pullman, balancoire);
        var balancoireBoulevard = new Rue(balancoire, boulevard);
        var balancoireEsti = new Rue(balancoire, esti);
        var boulevardEsti = new Rue(boulevard, esti);

        //Carte
        var carte = new Carte(
                List.of(marais, sekolontsika, hei, pullman, nexta, balancoire, boulevard, esti)
        );

        var soavimbahoaka = new Lieu("Soavimbahoaka");
        var marcheur = new Marcheur("Bjarni");

        assertThrows(RuntimeException.class, () -> marcheur.marcher(carte, hei, soavimbahoaka));
    }

    @Test
    public void marcher() {
        //Création des lieux
        var marais = new Lieu("Marais");
        var sekolontsika = new Lieu("Sekolontsika");
        var hei = new Lieu("HEI");
        var pullman = new Lieu("Pullman");
        var nexta = new Lieu("Nexta");
        var balancoire = new Lieu("Balançoire");
        var boulevard = new Lieu("Boulevard de l'Europe");
        var esti = new Lieu("ESTI");

        //Création des rues
        var maraisSekolontsika = new Rue(marais, sekolontsika);
        var sekolontsikaHei = new Rue(sekolontsika, hei);
        var heiPullman = new Rue("Rue Andriantsihorana", hei, pullman);
        var heiBalancoire = new Rue(hei, balancoire);
        var pullmanNexta = new Rue(pullman, nexta);
        var pullmanBalancoire = new Rue("Rue Ranaivo", pullman, balancoire);
        var balancoireBoulevard = new Rue(balancoire, boulevard);
        var balancoireEsti = new Rue(balancoire, esti);
        var boulevardEsti = new Rue(boulevard, esti);

        //Carte
        var carte = new Carte(
                List.of(marais, sekolontsika, hei, pullman, nexta, balancoire, boulevard, esti)
        );

        var marcheur = new Marcheur("Bjarni");
        var trajet = marcheur.marcher(carte, hei, esti).getTrajet();

        assertEquals(hei, trajet.get(0));
        assertEquals(esti, trajet.get(trajet.size() - 1));
    }

    @Test
    public void doitPasserPar() {
        //Création des lieux
        var marais = new Lieu("Marais");
        var sekolontsika = new Lieu("Sekolontsika");
        var hei = new Lieu("HEI");
        var pullman = new Lieu("Pullman");
        var nexta = new Lieu("Nexta");
        var balancoire = new Lieu("Balançoire");
        var boulevard = new Lieu("Boulevard de l'Europe");
        var esti = new Lieu("ESTI");

        //Création des rues
        var maraisSekolontsika = new Rue(marais, sekolontsika);
        var sekolontsikaHei = new Rue(sekolontsika, hei);
        var heiPullman = new Rue("Rue Andriantsihorana", hei, pullman);
        var heiBalancoire = new Rue(hei, balancoire);
        var pullmanNexta = new Rue(pullman, nexta);
        var pullmanBalancoire = new Rue("Rue Ranaivo", pullman, balancoire);
        var balancoireBoulevard = new Rue(balancoire, boulevard);
        var balancoireEsti = new Rue(balancoire, esti);
        var boulevardEsti = new Rue(boulevard, esti);

        //Carte
        var carte = new Carte(
                List.of(marais, sekolontsika, hei, pullman, nexta, balancoire, boulevard, esti)
        );

        var marcheur = new Marcheur("Bjarni");
        var trajet = marcheur.marcher(carte, hei, esti).getTrajet();

        assertTrue(trajet.contains(balancoire));
    }
}