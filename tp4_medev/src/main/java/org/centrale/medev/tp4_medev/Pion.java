/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.medev.tp4_medev;

/**
 *
 * @author clesp
 */
public class Pion {
    private Point2D pos;
    private int couleur;
    public final int NOIR = 0;
    public final int BLANC = 1;

    public Pion() {
        
    }

    public Point2D getPos() {
        return pos;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setPos(Point2D pos) {
        this.pos = pos;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void deplaceNonPrenable(Plateau plateau,int n){
        switch (n){
            //Déplacement nord/sud-est
            case 0:
                //nord-est
                if(this.couleur==this.BLANC){
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(-1, 1);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                //sud-est
                else{
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(1, 1);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                break;
            //Déplacement nord/sud-ouest
            case 1:
                //nord-ouest
                if(this.couleur==this.BLANC){
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(-1, -1);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                //sud-ouest
                else{
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(1, -1);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }   
                break;
        }
            
    }
    public void deplacePrenable(Plateau plateau,int n, Pion pionPris){
        //Prise du pion
        this.prendre(plateau,pionPris);
        //Déplacement
        switch(n){
            //Déplacement nord/sud-est
            case 0:
                //nord-ouest
                if(this.couleur==this.BLANC){
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(-2, 2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                //sud-est
                else{
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(2, 2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                break;
            //nord/sud ouest
            case 1 :
                //nord-ouest
                if(this.couleur==this.BLANC){
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(-2, -2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                //sud-ouest
                else{
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(2, -2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                break;
            //sud/nord ouest
            case 2: 
                //sud-ouest
                if(this.couleur==this.BLANC){
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(2, -2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                //nord-ouest
                else{
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(-2, -2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                break;
            //sud/nord-est
            case 3:
                //sud-est
                if(this.couleur==this.BLANC){
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(2, 2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                    
                }
                else{
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=null;
                    this.getPos().translate(-2, 2);
                    plateau.getContenu()[this.pos.getX()][this.pos.getY()]=this;
                }
                break;
        }
    }
    public Pion(Point2D pos, int couleur) {
        this.pos = pos;
        this.couleur = couleur;
    }
    public void prendre(Plateau plateau,Pion pion){
        plateau.getContenu()[pion.getPos().getX()][pion.getPos().getY()]=null;
    } 
}
