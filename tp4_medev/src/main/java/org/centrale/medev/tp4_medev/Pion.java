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

    public void deplace(Plateau plateau,int n){
        switch (n){
            case 0:
                if(plateau.getContenu()[this.pos.getX()][this.pos.getY()] instanceof Pion){
                    if(this.couleur==this.BLANC){
                        this.setPos(new Point2D(this.pos.getX()-1,this.pos.getY()+2));
                    }
                    else{
                        this.setPos(new Point2D(this.pos.getX()+1,this.pos.getY()+2));
                    }
                }
                else{
                    if(this.couleur==this.BLANC){
                        this.setPos(new Point2D(this.pos.getX()-1,this.pos.getY()+1));
                    }
                    else{
                        this.setPos(new Point2D(this.pos.getX()+1,this.pos.getY()+1));
                    }
                }
            case 1:
                if(plateau.getContenu()[this.pos.getX()][this.pos.getY()] instanceof Pion){
                    if(this.couleur==this.BLANC){
                        this.setPos(new Point2D(this.pos.getX()-1,this.pos.getY()-2));
                    }
                    else{
                        this.setPos(new Point2D(this.pos.getX()+1,this.pos.getY()-2));
                    }
                }
                else{
                    if(this.couleur==this.BLANC){
                        this.setPos(new Point2D(this.pos.getX()-1,this.pos.getY()-1));
                    }
                    else{
                        this.setPos(new Point2D(this.pos.getX()+1,this.pos.getY()-1));
                    }
                }
        }
    }
    public Pion(Point2D pos, int couleur) {
        this.pos = pos;
        this.couleur = couleur;
    }
    
}
