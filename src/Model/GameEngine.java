package Model;

/**
 * Classe représentant le moteur du jeu
 */
public class GameEngine {

    GameBoard gameBoard;

    /**
     * Constructeur
     */
    public GameEngine() {
        this.gameBoard = new GameBoard();
    }

    public GameBoard getGameBoard() {
        return gameBoard;
    }
}
