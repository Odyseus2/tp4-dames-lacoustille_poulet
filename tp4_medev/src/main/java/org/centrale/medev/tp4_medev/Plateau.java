/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp4_medev;

/**
 *
 * @author clesp
 */
public class Plateau {
    private Pion[][] contenu;

    public Pion[][] getContenu() {
        return contenu;
    }

    public void setContenu(Pion[][] contenu) {
        this.contenu = contenu;
    }

    public Plateau(Pion[][] contenu) {
        this.setContenu(contenu);
    }

    public void affiche(){
        for (int column=0;column<10;column++){
            for (int line=0;line<10;line++){
                Pion pion = contenu[line][column];
                if (pion == null){
                    System.out.print(" ");
                    return;
                }
                    int valeur=0;
                    if (pion instanceof Dame){
                        valeur+=1;
                    }
                    if (pion.getCouleur()==Pion.NOIR){
                        valeur+=2;
                    }
                    switch (valeur){
                        case 0:
                            System.out.print('\u26C0');
                            break;
                        case 1:
                            System.out.print('\u26C1');
                            break;
                        case 2:
                            System.out.print('\u26C2');
                            break;
                        case 3:
                            System.out.print('\u26C3');
                            break;
                    }
            }
        }
    }
}
