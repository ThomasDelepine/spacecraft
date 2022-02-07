package Model.Layer0;

import View.Tiles.TileView;

/**
 * Classe représentant une parcelle du terrain de jeu
 */
public abstract class Parcel {

    TileView view;

    /** Indique si la case peut être traversée par une entité */
    private boolean canBeCrossed;

    /**
     * Constructeur
     * @param canBeCrossed indique si la case peut être traversée par une entité
     */
    public Parcel(boolean canBeCrossed) {
        this.canBeCrossed = canBeCrossed;
    }

    public boolean canBeCrossed() {
        return canBeCrossed;
    }

    public TileView getView() {
        return view;
    }

    public void setView(TileView view) {
        this.view = view;
    }
}