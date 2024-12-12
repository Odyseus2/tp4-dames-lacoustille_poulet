/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp4_medev;

import java.util.logging.Logger;

/**
 *
 * @author clesp
 */
public class Plateau {

    Logger logger = Logger.getLogger(getClass().getName());

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

    private int valPion(Pion pion) {
        int valeur;
        if (pion == null) {
            valeur = -1;
        } else {
            valeur = 0;
            if (pion instanceof Dame){
                valeur+=1;
            }
            if (pion.getCouleur()==Pion.NOIR){
                valeur+=2;
            }
        }
        return valeur;
    }

    public void affiche(){
        for (int column=0;column<10;column++){
            for (int line=0;line<10;line++){
                Pion pion = contenu[line][column];
                String ligneString = "|";
                int valeur = valPion(pion);
                switch (valeur){
                    case -1:
                        ligneString += ' ';
                        break;
                    case 0:
                        ligneString += '\u26C0';
                        break;
                    case 1:
                        ligneString += '\u26C1';
                        break;
                    case 2:
                        ligneString += '\u26C2';
                        break;
                    case 3:
                        ligneString += '\u26C3';
                        break;
                    default:
                        break;
                }
                ligneString +="|"
                logger.info(ligneString);
            }
        }
    }
}
