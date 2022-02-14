package Model.Layer1.Entities;

import Model.GameBoard;
import Model.Layer1.Layer1Object;

import java.awt.*;
import java.util.ArrayList;

/**
 * Cette classe regroupe les entités du jeu,
 * à savoir les objets qui peuvent être déplacé
 */
public abstract class Entity extends Layer1Object {
    /**Attributes*/
    private int speed;
    private ArrayList<Action>actions;
    private GameBoard gameBoard;
    /**
     * Constructeur
     * @param coordinate   coordonnées globales de l'entité
     * @param dimension    width et size de l'entité
     * @param healthPoints points de vie de l'entité
     * @param speed vitesse en ms de déplacement de l'entité
     */
    public Entity(String name,Point coordinate, Dimension dimension, GameBoard gb, int healthPoints, int speed, String imagePath) {
        super(name, coordinate,dimension,healthPoints,imagePath);
        this.gameBoard = gb;
        this.speed = speed;
        this.actions= new ArrayList<>();
    }

    /** Cette méthode déplace l'entité */
    public void move(Point p){
        super.setCoordinate(p);
    }

    /**Ajoute une action a la liste d'actions de l'entité*/
    public void addAction(Action a){
        this.actions.add(a);
    }

    public ArrayList<Action> getActions() {
        return actions;
    }

    /**
     * getter de GameBoard
     * @return
     */
    public GameBoard getGameBoard() {
        return gameBoard;
    }
}
