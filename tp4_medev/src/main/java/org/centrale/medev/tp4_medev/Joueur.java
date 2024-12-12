/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp4_medev;

/**
 *
 * @author clesp
 */
public class Joueur {
    private String pseudo;
    private int couleur;

    public Joueur() {

    }

    public Joueur(String pseudo, int couleur) {
        this.setCouleur(couleur);
        this.setPseudo(pseudo);
    }

    public String getPseudo() {
        return this.pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public int getCouleur() {
        return this.couleur;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }
}
