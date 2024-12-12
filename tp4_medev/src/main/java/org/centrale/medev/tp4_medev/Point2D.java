package org.centrale.medev.tp4_medev;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clesp
 */
public class Point2D {
    private int x; //coordonnée
    private int y; //coordonnée
    //constructeur d'objet sans argument

    /**
     *
     */
    public Point2D() {    
    }
    //avec argument

    /**
     *
     * @param x Coordonnée
     * @param y Coordonnée
     */
    public Point2D (int x,int y){
        this.setX(x);
        this.setY(y);
    }
    //avec copie d'un objet déja construit

    /**
     *
     * @param p Position à copier
     */
    public Point2D (Point2D p){
        this.setX(p.getX());
        this.setY(p.getY());
    }
    //setters

    /**
     *
     * @param x 
     */
    public void setX(int x){
        this.x=x;
        coordonneeCheck();
    }

    /**
     *
     * @param y
     */
    public void setY(int y){
        this.y=y;
        coordonneeCheck();
    }
    //getters

    /**
     *
     * @return
     */
    public int getX(){
        return this.x;
    }

    /**
     *
     * @return
     */
    public int getY(){
        return this.y;
    }
    //setter des deux composantes

    /**
     *
     * @param x
     * @param y
     */
    public void setPosition(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    /**
     * Permet de translater un objet
     * @param dx Décalage horizontal
     * @param dy Décalage vertical
     */
    public void translate (int dx, int dy){
        this.x+=dx;
        this.y+=dy;
        coordonneeCheck();
    }
    //getter des deux composantes

    /**
     *
     */
    public void affiche(){
        System.out.println("["+this.x+";"+this.y+"]");
    }
    //distance entre deux points

    /**
     *
     * @param p
     * @return Distance entre les deux points
     */
    public float distance(Point2D p){
        double X=(double)this.x-p.x;
        double Y=(double)this.y-p.y;
        return (float)Math.sqrt(X*X+Y*Y);
    }

    public void coordonneeCheck() throws IndexOutOfBoundsException{
        if (x<0 ||x>9 || y<0 || y>9){
            throw new IndexOutOfBoundsException("Position hors de la grille");
        }
    }
}
