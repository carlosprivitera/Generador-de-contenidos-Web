package client;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Imagenes {
    private ImageIcon imageSumatoria = new ImageIcon(getClass().getResource("sumatoria.png")); 
    
    private ImageIcon image01 = new ImageIcon(getClass().getResource("01.png"));
    private ImageIcon image02 = new ImageIcon(getClass().getResource("02.png"));
    private ImageIcon image03 = new ImageIcon(getClass().getResource("03.png"));
    private ImageIcon image04 = new ImageIcon(getClass().getResource("04.png"));
    private ImageIcon image05 = new ImageIcon(getClass().getResource("05.png"));
    private ImageIcon image06 = new ImageIcon(getClass().getResource("06.png"));
    private ImageIcon image07 = new ImageIcon(getClass().getResource("07.png"));
    private ImageIcon image08 = new ImageIcon(getClass().getResource("08.png"));
    private ImageIcon image09 = new ImageIcon(getClass().getResource("09.png"));
    private ImageIcon imageX = new ImageIcon(getClass().getResource("X.png"));
    private ImageIcon imageY = new ImageIcon(getClass().getResource("Y.png"));

    public Image getImage01() {
        return image01.getImage();
    }

    public Image getImage02() {
        return image02.getImage();
    }

    public Image getImage03() {
        return image03.getImage();
    }

    public Image getImage04() {
        return image04.getImage();
    }

    public Image getImage05() {
        return image05.getImage();
    }

    public Image getImage06() {
        return image06.getImage();
    }

    public Image getImage07() {
        return image07.getImage();
    }

    public Image getImage08() {
        return image08.getImage();
    }

    public Image getImage09() {
        return image09.getImage();
    }

    public Image getImageX() {
        return imageX.getImage();
    }

    public Image getImageY() {
        return imageY.getImage();
    }

    public Imagenes() {
        super();
    }

    public ImageIcon getImageIco() {
        return imageSumatoria;
    }

    public Image getImage() {
        return imageSumatoria.getImage();
    }
    public Icon getIcon() {
        return imageSumatoria;
    }
}
