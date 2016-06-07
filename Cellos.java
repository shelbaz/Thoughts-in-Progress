package thirdsem;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Cellos extends JPanel{
                // Token used for this cell
                private char token = ' ';
                public Cellos() {
                        setBorder(new LineBorder(Color.black, 1)); // Set cell's border
                }
               
                /** Return token */
                public char getToken() {
                        return token;
                }
               
                /** Set a new token */
                public void setToken(char c) {
                        token = c;
                        repaint();
                }
               
                @Override /** Paint the cell */
                protected void paintComponent(Graphics g){
                        super.paintComponent(g);
                       
                        if (token == 'X') {
                                g.drawLine(10, 10, getWidth() - 10, getHeight() - 10);
                                g.drawLine(getWidth() - 10, 10, 10, getHeight() - 10);
                        }
                        else if (token == 'O') {
                                g.drawOval(10, 10, getWidth() - 20, getHeight() - 20);
                        }
                }
               
            
                }