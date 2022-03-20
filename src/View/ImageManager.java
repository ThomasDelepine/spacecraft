package View;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class ImageManager {

    public static int THUMBNAIL_SIZE = 140;
    public static int BORDER_SIZE = 160;

    public static Image thumbnailMars;
    public static Image thumbnailAlien;
    public static Image thumbnailSpaceMarine;
    public static Image thumbnailSpaceship;
    public static Image thumbnailMeteorite;

    public static Image spaceShipTile;
    public static Image spaceMarineNorthTile;
    public static Image spaceMarineSouthTile;
    public static Image spaceMarineEastTile;
    public static Image spaceMarineWestTile;
    public static Image alienNorthTile;
    public static Image alienSouthTile;
    public static Image alienEastTile;
    public static Image alienWestTile;
    public static Image meteoriteTile;
    public static Image sandTile;

    public static Image rock;

    public static Image heart;
    public static Image sword;

    public static Image thumbnailBorder;

    public static Image launcherBackground;
    public static Image launcherLogo;
    public static Image startButton;

    public ImageManager() throws IOException {
        thumbnailAlien = ImageIO.read(new File("./resources/alien.jpeg")).getScaledInstance(THUMBNAIL_SIZE, THUMBNAIL_SIZE, Image.SCALE_SMOOTH);
        thumbnailSpaceMarine = ImageIO.read(new File("./resources/space_marine.jpg")).getScaledInstance(THUMBNAIL_SIZE, THUMBNAIL_SIZE, Image.SCALE_SMOOTH);
        thumbnailSpaceship = ImageIO.read(new File("./resources/spaceship.jpg")).getScaledInstance(THUMBNAIL_SIZE, THUMBNAIL_SIZE, Image.SCALE_SMOOTH);
        thumbnailMeteorite = ImageIO.read(new File("./resources/meteorite.jpg")).getScaledInstance(THUMBNAIL_SIZE, THUMBNAIL_SIZE, Image.SCALE_SMOOTH);

        spaceShipTile = ImageIO.read(new File("resources/BoardAssets/spaceship.png"));
        meteoriteTile = ImageIO.read(new File("resources/BoardAssets/meteorite.png"));
        sandTile = ImageIO.read(new File("resources/BoardAssets/sand.png"));
        spaceMarineNorthTile = ImageIO.read(new File("resources/BoardAssets/SpaceMarineN.png"));
        spaceMarineSouthTile = ImageIO.read(new File("resources/BoardAssets/SpaceMarineS.png"));
        spaceMarineEastTile = ImageIO.read(new File("resources/BoardAssets/SpaceMarineE.png"));
        spaceMarineWestTile = ImageIO.read(new File("resources/BoardAssets/SpaceMarineW.png"));

        alienNorthTile = ImageIO.read(new File("resources/BoardAssets/AlienN.png"));
        alienSouthTile = ImageIO.read(new File("resources/BoardAssets/AlienS.png"));
        alienEastTile = ImageIO.read(new File("resources/BoardAssets/AlienE.png"));
        alienWestTile = ImageIO.read(new File("resources/BoardAssets/AlienW.png"));

        rock=ImageIO.read(new File("resources/rock.png")).getScaledInstance(25,25,Image.SCALE_SMOOTH);

        heart = ImageIO.read(new File("resources/ControlPanelAssets/heart.png"));
        sword = ImageIO.read(new File("resources/ControlPanelAssets/sword.png"));
        thumbnailBorder = ImageIO.read(new File("resources/ControlPanelAssets/border.png"));

        launcherBackground = ImageIO.read(new File("resources/LauncherAssets/background.png"));
        launcherLogo = ImageIO.read(new File("resources/LauncherAssets/logo.png"));
        startButton = ImageIO.read(new File("resources/LauncherAssets/start.png"));

        createFont();
    }

    public static Image getTileImage(String ressourceName){
        switch (ressourceName){
            case "Spaceship" : return spaceShipTile;
            case "Meteorite" : return meteoriteTile;
            case "Sand" : return sandTile;
            case "SpaceMarineNORTH": return spaceMarineNorthTile;
            case "SpaceMarineSOUTH": return spaceMarineSouthTile;
            case "SpaceMarineWEST": return spaceMarineWestTile;
            case "SpaceMarineEAST": return spaceMarineEastTile;
            case "AlienNORTH": return alienNorthTile;
            case "AlienSOUTH": return alienSouthTile;
            case "AlienWEST": return alienWestTile;
            case "AlienEAST": return alienEastTile;
        }
        return null;
    }

    public static Image getThumbnail(String ressourceName){
        switch (ressourceName){
            case "Spaceship" : return thumbnailSpaceship;
            case "Meteorite" : return thumbnailMeteorite;
            case "SpaceMarine": return thumbnailSpaceMarine;
            case "Alien" : return thumbnailAlien;
        }
        return null;
    }

    public static Image getControlPanelAssets(String ressourceName){
        switch (ressourceName){
            case "Heart" : return heart;
            case "Sword" : return sword;
        }
        return null;
    }

    private static Font ttfBase = null;
    public static Font zeroTwosFont = null;
    private static InputStream myStream = null;
    private static final String FONT_PATH = "resources/ZEROTWOS.TTF";

    public Font createFont() {
        try {
            myStream = new BufferedInputStream(
                    new FileInputStream(FONT_PATH));
            ttfBase = Font.createFont(Font.PLAIN, myStream);
            zeroTwosFont = ttfBase.deriveFont(Font.PLAIN, 12);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.err.println("Font not loaded.");
        }
        return zeroTwosFont;
    }
}
