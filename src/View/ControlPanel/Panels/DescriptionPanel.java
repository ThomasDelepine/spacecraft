package View.ControlPanel.Panels;

import View.FontManager;

import javax.swing.*;
import java.awt.*;

public class DescriptionPanel extends JPanel {
    private String[] description;

    public DescriptionPanel(String[] description) {
        this.setPreferredSize(new Dimension(128, 64));
        this.description=description;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(20, 10, this.getWidth()-20, 10);

        g.setColor(Color.BLACK);
        g.setFont(FontManager.Dune2000.deriveFont(16));

        g.drawString(description[0], 20, 30);
        g.drawString(description[1], 20, 46);
        g.drawString(description[2], 20, 62);
        g.drawString(description[3], 20, 78);
    }
}
//"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"