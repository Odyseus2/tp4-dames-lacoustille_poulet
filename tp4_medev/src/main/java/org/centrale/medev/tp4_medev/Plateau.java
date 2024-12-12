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

    public Plateau(Pion[][] contenu) {
        this.contenu = contenu;
    }

    public void affiche(){
        for (int column=0;column<10;column++){
            for (int line=0;line<10;line++){
                Pion pion = contenu[line][column];
                if (pion !=null){
                    int valeur=0;
                    if (pion instanceof Dame){
                        valeur+=1;
                    }
                    if (pion.getCouleur()==pion.NOIR){
                        valeur+=2;
                    }
                    switch (valeur){
                        case 0:
                            System.out.println('\u26C0');
                            break;
                        case 1:
                            System.out.println('\u26C1');
                            break;
                        case 2:
                            System.out.println('\u26C2');
                            break;
                        case 3:
                            System.out.println('\u26C3');
                            break;
                    }

                }else{
                    System.out.print(' ');
                }
            }
        }
    }
}
