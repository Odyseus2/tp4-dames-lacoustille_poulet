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
    public static final int NOIR = 0;
    public static final int BLANC = 1;

    public Pion() {
    }
    
    public Pion(Point2D pos, int couleur) {
        this.setPos(pos);
        this.setCouleur(couleur);
    }

    public Pion(int x, int y, int couleur) {
        this.setPos(x, y);
        this.setCouleur(couleur);
    }

    public Point2D getPos() {
        return pos;
    }

    public int getCouleur() {
        return couleur;
    }

    public void setPos(Point2D pos) {
        this.pos = new Point2D(pos);
    }

    public void setPos(int x, int y) {
        this.pos = new Point2D(x, y);
    }

    public int getX() {
        return this.pos.getX();
    }

    public int getY() {
        return this.pos.getY();
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void deplaceNonPrenable(Plateau plateau,int n){
        switch (n){
            //Déplacement nord/sud-est
            case 0:
                //nord-est
                if(this.couleur==BLANC){
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(-1, 1);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                //sud-est
                else{
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(1, 1);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                break;
            //Déplacement nord/sud-ouest
            case 1:
                //nord-ouest
                if(this.couleur==BLANC){
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(-1, -1);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                //sud-ouest
                else{
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(1, -1);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }   
                break;
            default:
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
                if(this.couleur==BLANC){
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(-2, 2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                //sud-est
                else{
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(2, 2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                break;
            //nord/sud ouest
            case 1 :
                //nord-ouest
                if(this.couleur==BLANC){
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(-2, -2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                //sud-ouest
                else{
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(2, -2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                break;
            //sud/nord ouest
            case 2: 
                //sud-ouest
                if(this.couleur==BLANC){
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(2, -2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                //nord-ouest
                else{
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(-2, -2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                break;
            //sud/nord-est
            case 3:
                //sud-est
                if(this.couleur==BLANC){
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(2, 2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                    
                }
                else{
                    plateau.getContenu()[this.getX()][this.getY()]=null;
                    this.getPos().translate(-2, 2);
                    plateau.getContenu()[this.getX()][this.getY()]=this;
                }
                break;
            default:
                break;
        }
    }
    public void prendre(Plateau plateau,Pion pion){
        plateau.getContenu()[pion.getPos().getX()][pion.getPos().getY()]=null;
    } 
}
