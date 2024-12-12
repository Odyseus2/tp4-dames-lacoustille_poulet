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

    public void deplace(Plateau plateau,int n){
        switch (n){
            case 0:
                if(plateau.getContenu()[this.getX()][this.getY()] instanceof Pion){
                    if(this.couleur==BLANC){
                        this.setPos(new Point2D(this.getX()-1,this.getY()+2));
                    }
                    else{
                        this.setPos(new Point2D(this.getX()+2,this.getY()+2));
                    }
                }
                else{
                    if(this.couleur==BLANC){
                        this.setPos(new Point2D(this.getX()-1,this.getY()+1));
                    }
                    else{
                        this.setPos(new Point2D(this.getX()+1,this.getY()+1));
                    }
                }
                break;
            case 1:
                if(plateau.getContenu()[this.getX()][this.getY()] instanceof Pion){
                    if(this.couleur==BLANC){
                        this.setPos(new Point2D(this.getX()-1,this.getY()-2));
                    }
                    else{
                        this.setPos(new Point2D(this.getX()+2,this.getY()-2));
                    }
                }
                else{
                    if(this.couleur==BLANC){
                        this.setPos(new Point2D(this.getX()-1,this.getY()-1));
                    }
                    else{
                        this.setPos(new Point2D(this.getX()+1,this.getY()-1));
                    }   
                }
                break;
            case 2: 
                if(this.couleur==BLANC){
                        this.setPos(new Point2D(this.getX()+2,this.getY()-2));
                    }
                    else{
                        this.setPos(new Point2D(this.getX()-2,this.getY()-2));
                    }
                break;
            case 3:
                if(this.couleur==BLANC){
                        this.setPos(new Point2D(this.getX()+2,this.getY()+2));
                    }
                    else{
                        this.setPos(new Point2D(this.getX()-2,this.getY()+2));
                    }
                break;
        }
            
    }

    public void prendre(Pion pion){
        pion=null;
    }
}
