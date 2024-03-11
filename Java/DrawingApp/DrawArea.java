import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawArea extends JComponent {

    // Image in which we're going to draw
    private Image image;
    // Graphics2D object
    private Graphics2D g2;
    // Mouse coordinates
    private int currentX, currentY, oldX, oldY;

    public DrawArea() {
        setDoubleBuffered(false);
        addMouseListener(new MouseAdapter() {

            public void mousePressed(MouseEvent e) {
                // save coordinates x, y, when mouse is pressed
                oldX = e.getX();
                oldY = e.getY();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {

            public void mouseDragged(MouseEvent e) {
                // coord x, y, when drag mouse
                currentX = e.getX();
                currentY = e.getY();

                if (g2 != null) {
                    // draw line if g2 context not null
                    g2.drawLine(oldX, oldY, currentX, currentY);
                    // refresh draw area to repaint
                    repaint();
                    // store current coords x, y, as old x, y
                    oldX = currentX;
                    oldY = currentY;
                }
            }
        });
    }

    protected void paintComponent(Graphics g) {
        if (image == null) {

            //image to draw null ==> we create
            image = createImage(getSize().width, getSize().height);
            g2 = (Graphics2D) image.getGraphics();

            // enable antialiasing
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            // clear drawing drea
            clear();
        }

        g.drawImage(image, 0, 0, null);
    }

    // create exposed methods

    public void clear() {
        g2.setPaint(Color.white);

        // draw white onto entire area
        g2.fillRect(0, 0, getSize().width, getSize().height);
        g2.setPaint(Color.black);
        repaint();
    }

    // applying color on g2 methods

    public void red() {
        g2.setPaint(Color.red);
    }

    public void black() {
        g2.setPaint(Color.black);  
    }

    public void magenta() {
        g2.setPaint(Color.magenta);  
    }

    public void green() {
        g2.setPaint(Color.green); 
    }

    public void blue() {
        g2.setPaint(Color.blue);
    }
}