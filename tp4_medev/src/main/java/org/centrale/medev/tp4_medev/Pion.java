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
    protected static final int[][] DIRECTIONS = new int[][]{
        {-1, 1}, {1, 1}, {-1, -1}, {1, -1}
    };

    public Pion() {
    }
    
    public Pion(Point2D pos, int couleur) {
        this.setPos(pos);
        this.setCouleur(couleur);
    }

    public Pion(int x, int y, int couleur) {
        Pion(new Point2D(x, y), couleur);
    }

    public Point2D getPos() {
        return this.pos;
    }

    public int getCouleur() {
        return this.couleur;
    }

    public void setPos(Point2D pos) {
        this.pos = new Point2D(pos);
    }

    public void setPos(int x, int y) {
        setPos(new Point2D(x, y));
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

    private void deplSurPlateau(Plateau plateau, int dx, int dy) {
        plateau.getContenu()[this.getX()][this.getY()]=null;
        this.getPos().translate(dx, dy);
        plateau.getContenu()[this.getX()][this.getY()]=this;
    }

    private void deplSurPlateauDirDist(Plateau plateau, int dir, int dist) {
        int dx = DIRECTIONS[dir][0]*dist;
        int dy = DIRECTIONS[dir][1]*dist;
        deplSurPlateau(plateau, dx, dy);
    }

    public void deplaceNonPrenable(Plateau plateau,int n){
        int dist = 1;
        int dir = 2*n + ((this.couleur == BLANC) ? 0 : 1);
        deplSurPlateauDirDist(plateau, dir, dist);   
    }

    public void deplacePrenable(Plateau plateau, int n, Pion pionPris){
        int dir = n;
        //ordre des directions : [{-1, 1}, {1, 1}, {-1, -1}, {1, -1}]
        int dist = 2;        
        deplSurPlateauDirDist(plateau, dir, dist);
        //Prise du pion
        this.prendre(plateau, pionPris);
    }

    public void prendre(Plateau plateau,Pion pion){
        plateau.getContenu()[pion.getPos().getX()][pion.getPos().getY()]=null;
    } 
}
